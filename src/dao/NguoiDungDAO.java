/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.NguoiDung;

/**
 *
 * @author My PC
 * ok test 
 */
public class NguoiDungDAO extends DAO{
	
	public NguoiDungDAO() {
		super();
	}
	
	public boolean kiemTraDangNhap(NguoiDung nd) {
            boolean kq = false;

            String sql = "SELECT ma, ten, vitri FROM tbl_nguoidung WHERE tendangnhap= ? AND matkhau= ?";

            try {

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, nd.getTenDangNhap());
                ps.setString(2, nd.getMatKhau());
                ResultSet rs = ps.executeQuery();
                if(rs.next()) {
                        nd.setTen(rs.getString("ten"));
                        nd.setViTri(rs.getString("vitri"));
                        nd.setMa(rs.getInt("ma"));
                        kq = true;
                }
            }catch(Exception e) {
                    e.printStackTrace();
            }
            return kq;
        }

    public NguoiDung getNguoiDung (int ma){
        NguoiDung nd = null;
        String sql = "SELECT * FROM tbl_nguoidung WHERE ma=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            ResultSet rs = ps.executeQuery();

            if(rs.next()){
              nd = new NguoiDung();
              nd.setMa(rs.getInt("ma"));
              nd.setTen(rs.getString("ten"));
              nd.setViTri(rs.getString("vitri"));
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return nd;
    }
        
        
}
