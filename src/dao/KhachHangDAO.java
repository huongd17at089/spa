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
import model.KhachHang;

/**
 *
 * @author My PC
 * test ok
 */
public class KhachHangDAO extends DAO{

    public KhachHangDAO() {
        super();
    }

    
    
    public ArrayList <KhachHang> timKhachHang(String ten){
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        String sql = "SELECT * FROM tbl_khachhang WHERE ten LIKE ?";
        try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, "%" + ten + "%");
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    KhachHang kh = new KhachHang();
                    kh.setMa(rs.getInt("ma"));
                    kh.setTen(rs.getString("ten"));
                    kh.setDiaChi(rs.getString("diachi"));
                    kh.setEmail(rs.getString("email"));
                    kh.setSoDienThoai(rs.getInt("sodienthoai"));
                    kh.setGhichu(rs.getString("ghichu"));
                    ds.add(kh);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return ds;
    }
    
    public boolean themKhachHang(KhachHang kh){
        String sql = "INSERT INTO tbl_khachhang(ten, diachi, sodienthoai, email, ghichu) VALUES(?,?,?,?,?)";
        try{
                PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                ps.setString(1, kh.getTen());
                ps.setString(2, kh.getDiaChi());
                ps.setInt(3, kh.getSoDienThoai());
                ps.setString(4, kh.getEmail());
                ps.setString(5, kh.getGhichu());
               

                ps.executeUpdate();

                //get id of the new inserted client
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                        kh.setMa(generatedKeys.getInt(1));
                }
                return true;
        }catch(Exception e){
                e.printStackTrace();
        }
        return false;
    }
    
    public KhachHang getKhachHang(int makhach){
        KhachHang kh = null;
        String sql = "SELECT * FROM tbl_khachhang WHERE ma=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, makhach);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                kh = new KhachHang();
                kh.setMa(rs.getInt("ma"));
                kh.setTen(rs.getString("ten"));
                kh.setDiaChi(rs.getString("diachi"));
                kh.setEmail(rs.getString("email"));
                kh.setSoDienThoai(rs.getInt("sodienthoai"));
                kh.setGhichu(rs.getString("ghichu"));

            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return kh;
    }
    
}
