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
import model.DichVuDung;
import model.NguyenLieu;
import model.NguyenLieuDung;
import model.SlotDat;

/**
 *
 * @author My PC
 * test chua xong
 */
public class NguyenLieuDungDAO extends DAO{

    public NguyenLieuDungDAO() {
        super();
    }
    
    public ArrayList <NguyenLieuDung>  getDSNguyenLieuDung(int maslot){
        ArrayList <NguyenLieuDung> ds = new ArrayList<>();
        String sql = "SELECT * FROM tbl_nguyenlieudung WHERE maslotdat = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, maslot);
            ResultSet rs = ps.executeQuery();

            NguyenLieuDAO nlDAO = new NguyenLieuDAO();

            while(rs.next()){
                NguyenLieuDung nld = new NguyenLieuDung();
                NguyenLieu nl = nlDAO.getNguyenLieu(rs.getInt("manl"));
                nld.setMa(rs.getInt("ma"));
                nld.setSoluong(rs.getInt("soluong"));
                nld.setGia(rs.getFloat("gia"));
                nld.setNl(nl);
                nld.setKhuyenmai(rs.getInt("khuyenmai"));
                ds.add(nld);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return ds;
    }
    
    // chua test
    public boolean xoaNguyenLieuDung(NguyenLieuDung nl){
        String sql = "DELETE FROM tbl_nguyenlieudung WHERE ma = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nl.getMa());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
        }
        return false;
    }
    
    public boolean themNguyenLieuDung(int sl, NguyenLieuDung nl){
       String sql = "INSERT INTO tbl_nguyenlieudung(manl, gia, maslotdat, soluong, khuyenmai) VALUES(?,?,?,?,?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, nl.getNl().getMa());
            ps.setFloat(2, nl.getGia());
            ps.setInt(3, sl);
            ps.setInt(4, nl.getSoluong());
            ps.setInt(5, nl.getKhuyenmai());
            ps.executeUpdate();
            
            ResultSet generatedKeys = ps.getGeneratedKeys();
            if (generatedKeys.next()) {
                    nl.setMa(generatedKeys.getInt(1));
            }
            return true;
        }catch(Exception e){
                e.printStackTrace();
        }
        return false;
    }
    
    
}
