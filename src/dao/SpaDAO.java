/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.DichVu;
import model.Spa;

/**
 *
 * @author My PC
 */
public class SpaDAO extends DAO{

    public SpaDAO() {
        super();
    }
    
    public Spa getSpa(int ma){
        Spa spa = null;
        String sql = "SELECT * FROM tbl_spa WHERE ma = ?";
        try{
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                spa = new Spa();
                spa.setMa(rs.getInt("ma"));
                spa.setTen(rs.getString("ten"));
                spa.setDiaChi(rs.getString("diachi"));
                spa.setSoDienThoai(rs.getInt("sodienthoai"));
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return spa; 
    }
    
}
