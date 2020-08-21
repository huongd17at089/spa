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
import model.Slot;

/**
 *
 * @author My PC
 *test ok
 */
public class DichVuDAO extends DAO{

    public DichVuDAO() {
        super();
    }
    
    public boolean themDichVu(DichVu dv){
        String sql = "INSERT INTO tbl_dichvu( ten, mota) VALUES(?,?)";
        try {
                PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, dv.getTen());
                ps.setString(2, dv.getMoTa());
                ps.executeUpdate();	

                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    dv.setMa(generatedKeys.getInt(1));
                }
                return true;
        }catch(Exception e) {
                e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList <DichVu> getDSDichVu(){
        ArrayList <DichVu> ds = new ArrayList<DichVu>();
        String sql = "SELECT * FROM tbl_dichvu";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                    DichVu dv = new DichVu();
                    dv.setMa(rs.getInt(1));
                    dv.setTen(rs.getString(2));
                    dv.setMoTa(rs.getString(3));
                    ds.add(dv);
            }
        }catch(Exception e){
                e.printStackTrace();
        }
        return ds;
    }
    
    public DichVu getDichVu(int ma){
        DichVu dv = null;
        String sql = "SELECT * FROM tbl_dichvu WHERE ma = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, ma);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                dv = new DichVu();
               dv.setMa(rs.getInt("ma"));
               dv.setTen(rs.getString("ten"));
               dv.setMoTa(rs.getString("mota"));
            }
            
        }catch(Exception e){
                e.printStackTrace();
        }
        return dv;
    }
    
    
}
