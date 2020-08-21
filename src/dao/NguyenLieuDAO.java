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
import java.util.ArrayList;
import model.NguyenLieu;

/**
 *
 * @author My PC
 * ok test
 */
public class NguyenLieuDAO extends DAO{

    public NguyenLieuDAO() {
        super();
    }
    
    public boolean themNguyenLieu(NguyenLieu nl){
        String sql = "INSERT INTO tbl_nguyenlieu( ten, gianhap, giaban, donvi, dungtich) VALUES(?,?,?,?,?)";
        try {
                PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, nl.getTen());
                ps.setFloat(2, nl.getGiaNhap());
                ps.setFloat(3, nl.getGiaBan());
                ps.setString(4, nl.getDonVi());
                ps.setFloat(5, nl.getDungTich());
                ps.executeUpdate();			
                return true;
        }catch(Exception e) {
                e.printStackTrace();
        }
        return false;
    }

    public NguyenLieu getNguyenLieu(int manl) {
        NguyenLieu nl = null;
        String sql = "SELECT * FROM tbl_nguyenlieu WHERE ma=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, manl);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                nl = new NguyenLieu();
                nl.setTen(rs.getString("ten"));
                nl.setMa(rs.getInt("ma"));
                nl.setDonVi(rs.getString("donvi"));
                nl.setDungTich(rs.getInt("dungtich"));
                nl.setGiaNhap(rs.getFloat("gianhap"));
                nl.setGiaBan(rs.getFloat("giaban"));
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return nl;
    }

    public ArrayList<NguyenLieu> timNguyenLieu(String ten) {
        ArrayList<NguyenLieu> ds = new ArrayList<NguyenLieu>();
            String sql = "SELECT * FROM tbl_nguyenlieu WHERE ten LIKE ?";
            try{
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, "%" + ten + "%");
                    ResultSet rs = ps.executeQuery();

                    while(rs.next()){
                            NguyenLieu nl = new NguyenLieu();
                            nl.setMa(rs.getInt("ma"));
                            nl.setTen(rs.getString("ten"));
                            nl.setDungTich(rs.getInt("dungtich"));
                            nl.setGiaBan(rs.getFloat("giaban"));
                            nl.setGiaNhap(rs.getFloat("gianhap"));
                            nl.setDonVi(rs.getString("donvi"));
                            ds.add(nl);
                    }
            }catch(Exception e){
                    e.printStackTrace();
            }	
            return ds;
    }
    
}
