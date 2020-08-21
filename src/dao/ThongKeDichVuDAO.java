/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.ThongKeDichVu;

/**
 *
 * @author My PC
 * chua test 
 */
public class ThongKeDichVuDAO extends DAO{

    public ThongKeDichVuDAO() {
        super();
    }
    
    public ArrayList<ThongKeDichVu> getTKDichVu(Date ngaybd, Date ngaykt){
        System.out.println(ngaybd);
         System.out.println(ngaykt);
        ArrayList<ThongKeDichVu> ds = new ArrayList<ThongKeDichVu>();
        String sql = "SELECT ma, ten, mota, tien, soluong FROM tbl_dichvu,\n" +
                    "(SELECT x.madv , SUM(tongtien) AS tien , COUNT(x.maslotdat) AS soluong FROM \n" +
                    "(SELECT a.madv, a.maslotdat, tongtien FROM\n" +
                    "(SELECT madv, slotdat.ma AS maslotdat FROM tbl_slot,\n" +
                    "(SELECT ma, maslot FROM tbl_slotdat WHERE maphieu IN (SELECT ma FROM tbl_phieudat WHERE ngaythanhtoan >= ? AND ngaythanhtoan <= ?)) AS slotdat\n" +
                    "WHERE maslot = tbl_slot.ma) AS a, (SELECT maslotdat, SUM(gia*(100-khuyenmai)/100) AS tongtien FROM tbl_dichvudung GROUP BY maslotdat) AS b\n" +
                    "WHERE a.maslotdat = b.maslotdat) AS x\n" +
                    "GROUP BY madv) AS tk\n" +
                    "WHERE tk.madv = tbl_dichvu.ma\n" +
                    "ORDER BY tien ASC;";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        try {
            PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, sdf.format(ngaybd));
                ps.setString(2, sdf.format(ngaykt));

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                    ThongKeDichVu tkdv = new ThongKeDichVu();
                    tkdv.setMa(rs.getInt("ma"));
                    tkdv.setTen(rs.getString("ten"));
                    tkdv.setMoTa(rs.getString("mota"));
                    tkdv.setSoLuongDat(rs.getInt("soluong"));
                    tkdv.setDoanhThu(rs.getFloat("tien"));
                    ds.add(tkdv);
            }			
        }catch(Exception e) {
                e.printStackTrace();
        }

        return ds;
    }
    
}
