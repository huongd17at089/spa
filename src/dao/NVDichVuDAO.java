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
import model.NVDichVu;


/**
 *
 * @author My PC
 * ok test
 */
public class NVDichVuDAO extends DAO{

    public NVDichVuDAO() {
        super();
    }
    
    public boolean themNVDichVu(NVDichVu nv){
        String sql = "INSERT INTO tbl_nvdichvu( ten, calam) VALUES(?,?)";
        try {
            System.out.println(Statement.RETURN_GENERATED_KEYS);
            PreparedStatement ps = con.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, nv.getTen());
            ps.setString(2, nv.getCaLam());
            ps.executeUpdate();	

            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                nv.setMa(generatedKeys.getInt(1));
            }
           // System.out.println(nv.getMa());
            return true;
        }catch(Exception e) {
                e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList <NVDichVu> timNhanVien(int madv, Date ngayGio){
        ArrayList<NVDichVu> ds = new ArrayList<NVDichVu>();
        String sql = "SELECT dsnv.ma , dsnv.ten, dsnv.calam FROM (SELECT ma, ten, calam FROM tbl_nvdichvu WHERE tbl_nvdichvu.ma NOT IN  " +
            "(SELECT manv FROM tbl_conglam WHERE ngaygio > ? AND ngaygio < ?) ) AS dsnv, tbl_chuyenmon  " +
            "WHERE dsnv.ma = tbl_chuyenmon.manv AND tbl_chuyenmon.madv = ?;";
        Date ketthuc = new Date(ngayGio.getTime() + 7200000);
        Date bd = new Date(ngayGio.getTime() - 7200000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(3, madv);
            ps.setString(1, sdf.format(bd));
            ps.setString(2, sdf.format(ketthuc));
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                NVDichVu nv = new NVDichVu();
                nv.setMa(rs.getInt("ma"));
                nv.setTen(rs.getString("ten"));
                nv.setCaLam(rs.getString("calam"));
                ds.add(nv);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return ds;
    }
    
}
