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
import model.DichVu;
import model.DichVuChiTiet;

/**
 *
 * @author My PC
 * ok test
 */
public class DichVuChiTietDAO extends DAO{

    public DichVuChiTietDAO() {
        super();
    }
    
    public boolean themDichViChiTiet(DichVuChiTiet dv){
        String sql = "INSERT INTO tbl_dichvuchitiet( ten, mota, gia, madichvu) VALUES(?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, dv.getTen());
                ps.setString(2, dv.getMoTa());
                ps.setFloat(3, dv.getGia());
                ps.setInt(4, dv.getDichVu().getMa());
                ps.executeUpdate();			
                return true;
            }catch(Exception e) {
                    e.printStackTrace();
            }
        return false;
    }
    
    public ArrayList <DichVuChiTiet> getDSDichVuChiTiet(int madv){
        ArrayList <DichVuChiTiet> ds = new ArrayList<DichVuChiTiet>();
        String sql = "SELECT * FROM tbl_dichvuchitiet WHERE madichvu = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, madv);
            ResultSet rs = ps.executeQuery();
            DichVuDAO dvDAO = new DichVuDAO();
            while(rs.next()){
                DichVuChiTiet dvct = new DichVuChiTiet();
                DichVu dv = dvDAO.getDichVu(rs.getInt("madichvu"));
                dvct.setMa(rs.getInt(1));
                dvct.setTen(rs.getString(4));
                dvct.setMoTa(rs.getString(5));
                dvct.setGia(rs.getFloat(3));
                dvct.setDichVu(dv);
                ds.add(dvct);
            }
        }catch(Exception e){
                e.printStackTrace();
        }
        return ds;
    }
    
    public DichVuChiTiet getDichVuChiTiet( int madv){
        DichVuChiTiet dv = null;
		String sql = "SELECT * FROM tbl_dichvuchitiet WHERE ma=?";
            try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, madv);
                ResultSet rs = ps.executeQuery();
                DichVuDAO dvDAO = new DichVuDAO();

                if(rs.next()){
                    dv = new DichVuChiTiet();
                   dv.setMa(rs.getInt("ma"));
                    dv.setTen(rs.getString("ten"));
                    dv.setMoTa(rs.getString("mota"));
                    dv.setGia(rs.getFloat("gia"));
                   dv.setDichVu(dvDAO.getDichVu(rs.getInt("madichvu")));
                }
            }catch(Exception e){
                    e.printStackTrace();
            }	
            return dv;
    }

    public ArrayList<DichVuChiTiet> timDichVuChiTiet(DichVu dichvu, String ten) {
        ArrayList<DichVuChiTiet> ds = new ArrayList<DichVuChiTiet>();
        String sql = "SELECT * FROM tbl_dichvuchitiet WHERE madichvu = ? AND ten LIKE ?";
        try{
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, dichvu.getMa());
                ps.setString(2, "%" + ten + "%");
                ResultSet rs = ps.executeQuery();

                while(rs.next()){
                    DichVuChiTiet dv = new DichVuChiTiet();
                    dv.setMa(rs.getInt(1));
                    dv.setTen(rs.getString(4));
                    dv.setMoTa(rs.getString(5));
                    dv.setGia(rs.getFloat(3));
                    dv.setDichVu(dichvu);
                    ds.add(dv);
                }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return ds;
    }
    
}
