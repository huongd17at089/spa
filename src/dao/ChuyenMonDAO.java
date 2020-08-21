/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.Statement;
import model.ChuyenMon;

/**
 *
 * @author My PC
 */
public class ChuyenMonDAO  extends DAO{

    public ChuyenMonDAO() {
        super();
    }
    
    public boolean themChuyenMon(ChuyenMon cm){
        String sql = "INSERT INTO tbl_chuyenmon( manv, madv, diem) VALUES(?,?,?)";
            try {
                    PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

                    ps.setInt(1, cm.getNv().getMa());
                    ps.setInt(2, cm.getDv().getMa());
                    ps.setInt(3, cm.getDiem());
                    ps.executeUpdate();			
                    return true;
            }catch(Exception e) {
                    e.printStackTrace();
            }
        return false;
    }
    
}
