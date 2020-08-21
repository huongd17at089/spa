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
import model.DichVuChiTiet;
import model.DichVuDung;
import model.NguyenLieuDung;

/**
 *
 * @author My PC
 * chua test xong
 */
public class DichVuDungDAO extends DAO{
    
    public DichVuDungDAO() {
        super();
    }
    
    public ArrayList <DichVuDung>  getDSDichVuDung(int maslot){
        ArrayList <DichVuDung> ds = new ArrayList<DichVuDung>();
        String sql = "SELECT * FROM tbl_dichvudung WHERE maslotdat = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, maslot);
            ResultSet rs = ps.executeQuery();

            DichVuChiTietDAO dvDAO = new DichVuChiTietDAO();

            while(rs.next()){
                DichVuDung dv = new DichVuDung();
                DichVuChiTiet dvct = dvDAO.getDichVuChiTiet(rs.getInt("madichvu"));
                dv.setMa(rs.getInt("ma"));
                dv.setGia(rs.getFloat("gia"));
                dv.setDv(dvct);
                dv.setKhuyenmai(rs.getInt("khuyenmai"));
                ds.add(dv);
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return ds;
    }
    
    // chua test
    public boolean xoaDichVuDung(DichVuDung dv){
        String sql = "DELETE FROM tbl_conglam WHERE madvd = ?";
        String sql1 = "DELETE FROM tbl_dichvudung WHERE ma = ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dv.getMa());
            ps.executeUpdate();
            PreparedStatement ps1 = con.prepareStatement(sql1);
            ps.setInt(1, dv.getMa());
            ps.executeUpdate();
            return true;
        }catch(Exception e){
                e.printStackTrace();
        }
        return false;
    }
    
}
