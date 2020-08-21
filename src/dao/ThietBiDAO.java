/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.ThietBi;


/**
 *
 * @author My PC
 * chua test
 */
public class ThietBiDAO extends DAO{

    public ThietBiDAO() {
        super();
    }
    
     public boolean themThietBi(ThietBi tb){
        String sql = "INSERT INTO tbl_thietbi( ten, soluong, xuatxu, mota) VALUES(?,?,?,?)";
            try {
                PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, tb.getTen());
                ps.setString(4, tb.getMoTa());
                ps.setInt(2, tb.getSoLuong());
                ps.setString(3, tb.getXuatXu());
                ps.executeUpdate();			
                return true;
            }catch(Exception e) {
                    e.printStackTrace();
            }
        return false;
    }
    
}
