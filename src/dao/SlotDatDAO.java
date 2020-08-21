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
import model.CongLam;
import model.DichVuDung;
import model.NguyenLieuDung;
import model.Slot;
import model.SlotDat;

/**
 *
 * @author My PC
 * dang test
 */
public class SlotDatDAO extends DAO{

    public SlotDatDAO() {
        super();
    }
    
    public ArrayList <SlotDat> getSlotDat(int mapphieu){
        ArrayList <SlotDat> ds = new ArrayList <SlotDat>();
        String sql = "SELECT * FROM tbl_slotdat WHERE maphieu = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,  mapphieu );
            ResultSet rs = ps.executeQuery();
            SlotDAO slotDAO = new SlotDAO();

            DichVuDungDAO dvDAO = new DichVuDungDAO();
            NguyenLieuDungDAO nlDAO = new NguyenLieuDungDAO();
            

            while(rs.next()){
                SlotDat slot = new SlotDat();
                Slot sl = slotDAO.getSlot(rs.getInt("maslot"));
                ArrayList <DichVuDung> dsdv = dvDAO.getDSDichVuDung(rs.getInt("ma"));
                ArrayList <NguyenLieuDung> dsnl = nlDAO.getDSNguyenLieuDung(rs.getInt("ma"));
                slot.setMa(rs.getInt("ma"));
                slot.setSlot(sl);
                slot.setNgayGio(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rs.getString("ngaygio")));
                slot.setDsdv(dsdv);
                slot.setDsnl(dsnl);
                slot.setGhiChu(rs.getString("danhan"));
                ds.add(slot);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        System.out.println(ds.size());
        return ds;
    }

    public boolean nhanSlot(SlotDat slot) {
        String capNhatSlot = "UPDATE tbl_slotdat SET danhan='da nhan' WHERE ma = ?;";
        String themNguyenLieuDung = "INSERT INTO tbl_nguyenlieudung( manl, gia, maslotdat, soluong, khuyenmai) "
                        + "VALUES(?,?,?,?,?)";
        String themDichVuDung = "INSERT INTO tbl_dichvudung( maslotdat, madichvu, gia, khuyenmai) "
                        + "VALUES(?,?,?,?)";
        String kiemTraNV = "SELECT * FROM tbl_conglam WHERE manv = ? AND ngaygio > ? AND ngaygio < ?";
        String themCongLam =  "INSERT INTO tbl_conglam( manv, madvd, ngaygio) "
                        + "VALUES(?,?,?)";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean kq = true;
        try {
            con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement(capNhatSlot, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, slot.getMa());

            ps.executeUpdate();			

            for( NguyenLieuDung nl: slot.getDsnl()){
                ps = con.prepareStatement(themNguyenLieuDung, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, nl.getNl().getMa());
                ps.setFloat(2, nl.getGia());
                ps.setInt(3, slot.getMa());
                ps.setInt(4, nl.getSoluong());
                ps.setInt(5, nl.getKhuyenmai());
                ps.executeUpdate();
            }

            for( DichVuDung dvd: slot.getDsdv()){
                ps = con.prepareStatement(themDichVuDung, Statement.RETURN_GENERATED_KEYS);
                ps.setInt(1, slot.getMa());
                ps.setInt(2, dvd.getDv().getMa());
                ps.setFloat(3, dvd.getGia());
                ps.setInt(4, dvd.getKhuyenmai());
                ps.executeUpdate();
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    dvd.setMa(generatedKeys.getInt(1));

                    for( CongLam cl: dvd.getDscong()){
                        ps = con.prepareStatement(kiemTraNV, Statement.RETURN_GENERATED_KEYS);
                        ps.setInt(1, cl.getNv().getMa());
                        ps.setString(2, sdf.format(cl.getNgaygio()));
                        ps.setString(3, sdf.format(new Date(cl.getNgaygio().getTime() + 7200000)));

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



                        ps = con.prepareStatement(themCongLam, Statement.RETURN_GENERATED_KEYS);
                        ps.setInt(1, cl.getNv().getMa());
                        ps.setInt(2, dvd.getMa());
                        ps.setString(3, sdf.format(cl.getNgaygio()));
                        ps.executeUpdate();
                    }
                }
            }

            //cmt chay uint test
          //  con.commit();
        }catch(Exception e) {
                kq= false;			
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
                    // con.setAutoCommit(true);
                }catch(Exception ex) {
                    kq = false;
                    ex.printStackTrace();
                }
        }
        return kq;
    }
    
}
