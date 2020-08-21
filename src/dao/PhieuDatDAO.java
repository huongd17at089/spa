/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.KhachHang;
import model.NguoiDung;
import model.PhieuDat;
import model.Slot;
import model.SlotDat;

/**
 *
 * @author My PC
 * chua test xong
 */
public class PhieuDatDAO extends DAO{

    public PhieuDatDAO() {
        super();
    }
    
    public boolean luuDat(PhieuDat pd){
        String luuPhieu = "INSERT INTO tbl_phieudat(manvdat, makhach, ngaydat, khuyenmai, ghichu) VALUES(?,?,?,?,?)";
        String luuSlotDat = "INSERT INTO tbl_slotdat(maslot, maphieu, ngaygio, danhan) "
                        + "VALUES(?,?,?,?)";
        String kiemTra = "SELECT * FROM tbl_slotdat WHERE maslot = ? AND ngaygio >= ? AND ngaygio < ?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean kq = true;
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(luuPhieu, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pd.getNvDat().getMa());
            ps.setInt(2, pd.getKh().getMa());
            ps.setString(3, sdf.format(pd.getNgayDat()));
            ps.setFloat(4, pd.getKhuyenMai());
            ps.setString(5, pd.getGhiChu());

            ps.executeUpdate();			
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                pd.setMa(generatedKeys.getInt(1));


                for(SlotDat slot: pd.getDsSlot()) {

                    ps = con.prepareStatement(kiemTra);
                    ps.setInt(1,slot.getSlot().getMa());
                    ps.setString(2, sdf.format(new Date(slot.getNgayGio().getTime() - 7200000)));
                    ps.setString(3, sdf.format(new Date(slot.getNgayGio().getTime() + 7200000)));

                    ResultSet rs = ps.executeQuery();
                    if(rs.next()) {
                        kq = false;
                        try {
                            con.rollback();
                            con.setAutoCommit(true);
                        }catch(Exception ex) {
                            kq = false;
                            ex.printStackTrace();
                        }
                        return kq;
                    }
                    ps = con.prepareStatement(luuSlotDat, Statement.RETURN_GENERATED_KEYS);
                    ps.setInt(1, slot.getSlot().getMa());
                    ps.setInt(2, pd.getMa());
                    ps.setString(3, sdf.format(slot.getNgayGio()));
                    ps.setString(4, slot.getGhiChu());


                    ps.executeUpdate();			

                    generatedKeys = ps.getGeneratedKeys();
                    if (generatedKeys.next()) {
                            slot.setMa(generatedKeys.getInt(1));
                    }
                }
            }
            //cmt chay uint test
           // con.commit();
            }catch(Exception e) {
                kq = false;			
                try {				
                    con.rollback();
                }catch(Exception ex) {
                    kq = false;
                    ex.printStackTrace();
                }
                e.printStackTrace();
            }finally {
                try {	
                    //cmt chay uint test
                  //  con.setAutoCommit(true);
                }catch(Exception ex) {
                    kq = false;
                    ex.printStackTrace();
                }
            }
		
        return kq;
    }
    
    public ArrayList <PhieuDat> timPhieuDat(String tenkhach){
        ArrayList <PhieuDat> ds = new ArrayList<PhieuDat>();
        String sql = "SELECT tbl_phieudat.ma , makhach , ngaydat , tbl_phieudat.ghichu , manvdat FROM tbl_khachhang, tbl_phieudat WHERE makhach = tbl_khachhang.ma AND ten LIKE ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tenkhach + "%");
           
            ResultSet rs = ps.executeQuery();
            
            KhachHangDAO khDAO = new KhachHangDAO();
            SlotDatDAO slotDAO = new SlotDatDAO();
            NguoiDungDAO nddAO = new NguoiDungDAO();
            while(rs.next()){
                PhieuDat pd = new PhieuDat();
                KhachHang kh = khDAO.getKhachHang(rs.getInt("makhach"));
                NguoiDung nvdat = nddAO.getNguoiDung(rs.getInt("manvdat"));
                ArrayList <SlotDat> dssl = slotDAO.getSlotDat(rs.getInt("ma"));
                pd.setNvDat(nvdat);
                pd.setMa(rs.getInt("ma"));
                pd.setKh(kh);
                pd.setNgayDat(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(rs.getString("ngaydat")));
                pd.setDsSlot(dssl);
                pd.setGhiChu(rs.getString("ghichu"));
                ds.add(pd);
            }
        }catch(Exception e){
                e.printStackTrace();
        }
        return ds;
    }
    
    public ArrayList<PhieuDat> DSPhieuDatTheoDichVu(int madv, Date ngaybd, Date ngaykt){
        ArrayList<PhieuDat> ds = new ArrayList<PhieuDat>();
        String sql = "SELECT * FROM \n" +
                    "(SELECT * FROM tbl_phieudat WHERE ngaythanhtoan >= ? AND ngaythanhtoan <= ?) AS pd WHERE pd.ma IN \n" +
                    "(SELECT  maphieu AS ma FROM tbl_slotdat, tbl_slot, tbl_dichvu WHERE tbl_slotdat.maslot = tbl_slot.ma AND tbl_slot.madv = tbl_dichvu.ma AND tbl_dichvu.ma = ?)\n" +
                    "ORDER BY ngaythanhtoan DESC";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sdf.format(ngaybd));
            ps.setString(2, sdf.format(ngaykt));
            ps.setInt(3, madv);
//           
            ResultSet rs = ps.executeQuery();

            KhachHangDAO khDAO = new KhachHangDAO();
            NguoiDungDAO ndDAO = new NguoiDungDAO();
            while(rs.next()){
               PhieuDat pd = new PhieuDat();
               pd.setMa(rs.getInt("ma"));
               pd.setNgayDat(rs.getDate("ngaydat"));
               pd.setKh(khDAO.getKhachHang(rs.getInt("makhach")));
               pd.setGhiChu(rs.getString("ghichu"));
               pd.setKhuyenMai(rs.getInt("khuyenmai"));
               pd.setNgayThanhToan(rs.getDate("ngaythanhtoan"));
               pd.setNvDat(ndDAO.getNguoiDung(rs.getInt("manvdat")));
               pd.setNvThanhToan(ndDAO.getNguoiDung(rs.getInt("manvthanhtoan")));
               ds.add(pd);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
    return ds;
    }
    
    public PhieuDat getPhieuDat(int ma){
        PhieuDat pd = null;
        String sql = "SELECT *  FROM tbl_phieudat WHERE ma = ?;";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
           
            ResultSet rs = ps.executeQuery();
            
            KhachHangDAO khDAO = new KhachHangDAO();
            SlotDatDAO slotDAO = new SlotDatDAO();
            NguoiDungDAO ndDAO = new NguoiDungDAO();
            if(rs.next()){
                pd = new PhieuDat();
                pd.setMa(rs.getInt("ma"));
                pd.setKh(khDAO.getKhachHang(rs.getInt("makhach")));
                pd.setNgayDat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString("ngaydat")));
                pd.setDsSlot(slotDAO.getSlotDat(pd.getMa()));
                pd.setNvDat(ndDAO.getNguoiDung(rs.getInt("manvdat")));
                pd.setGhiChu(rs.getString("ghichu"));
                pd.setKhuyenMai(rs.getInt("khuyenmai"));
                pd.setNgayThanhToan(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString("ngaythanhtoan")));
                pd.setNvThanhToan(ndDAO.getNguoiDung(rs.getInt("manvthanhtoan")));
                
            }
        }catch(Exception e){
                e.printStackTrace();
        }
        return pd;
    }
    
    public boolean luuThanhToan(PhieuDat pd){
        String sql = "UPDATE tbl_phieudat SET ngaythanhtoan = ?, ghichu = ? , manvthanhtoan = ? WHERE ma=?";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, sdf.format(pd.getNgayThanhToan()));
            ps.setString(2, pd.getGhiChu());
            ps.setInt(3, pd.getNvThanhToan().getMa());
            ps.setInt(4, pd.getMa());
            

            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
        }
        return false;
    }
    
}
