/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.NguyenLieuDung;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author My PC
 */
public class NguyenLieuDungDAOTest {
    
    NguyenLieuDungDAO nlDAO = new NguyenLieuDungDAO();

    /**
     * Test of getDSNguyenLieuDung method, of class NguyenLieuDungDAO.
     */
    @Test
    public void testGetDSNguyenLieuDung() {
        int ma = 2;
        ArrayList<NguyenLieuDung> ds= nlDAO.getDSNguyenLieuDung(ma);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(1, ds.size());
//        for(int i=0; i < ds.size(); i++){
//            Assert.assertTrue(listRoom.get(i).getName().toLowerCase().contains(key.toLowerCase()));
//        }
        return;
    }
    
    @Test
    public void testNgoaiLeGetDSNguyenLieuDung() {
        int ma = 0;
        ArrayList<NguyenLieuDung> ds= nlDAO.getDSNguyenLieuDung(ma);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
//        for(int i=0; i < ds.size(); i++){
//            Assert.assertTrue(listRoom.get(i).getName().toLowerCase().contains(key.toLowerCase()));
//        }
        return;
    }
    
    /**
     * Test of xoaNguyenLieuDung method, of class NguyenLieuDungDAO.
     */
    @Test
    public void testXoaNguyenLieuDung() {
        Connection con = DAO.con;
        NguyenLieuDung nl = new NguyenLieuDung();
        nl.setMa(3);
        String sql = "SELECT * FROM tbl_nguyenlieudung WHERE ma = ?";
        
        try{
            con.setAutoCommit(false);
            assertTrue(nlDAO.xoaNguyenLieuDung(nl));
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nl.getMa());
            ResultSet rs = ps.executeQuery();
            assertFalse(rs.next());
        }catch(Exception e){
                e.printStackTrace();
        }finally{
            try{
                con.rollback();
                con.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;
        
    }
    
//    @Test
//    public void testNgoaiLeXoaNguyenLieuDung() {
//        Connection con = DAO.con;
//        NguyenLieuDung nl = new NguyenLieuDung();
//        nl.setMa(0);
//        try{
//            con.setAutoCommit(false);
//            assertFalse(nlDAO.xoaNguyenLieuDung(nl));
//            
//        }catch(Exception e){
//                e.printStackTrace();
//        }finally{
//            try{
//                con.rollback();
//                con.setAutoCommit(true);
//            }catch(Exception ex){
//                ex.printStackTrace();
//            }
//        }
//        return;
//        
//    }

    /**
     * Test of themNguyenLieuDung method, of class NguyenLieuDungDAO.
     */
    @Test
    public void testThemNguyenLieuDung() {
        Connection con = DAO.con;
        NguyenLieuDung nl = new NguyenLieuDung();
        
        nl.setKhuyenmai(0);
        nl.setGia(100);
        nl.setSoluong(1);
        nl.setNl(new NguyenLieuDAO().getNguyenLieu(1));
        String sql = "SELECT * FROM tbl_nguyenlieudung WHERE ma = ?";
        try{
            con.setAutoCommit(false);
            assertTrue(nlDAO.themNguyenLieuDung(2, nl));
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, nl.getMa());
            ResultSet rs = ps.executeQuery();
            assertTrue(rs.next());
        }catch(Exception e){
                e.printStackTrace();
        }finally{
            try{
                con.rollback();
                con.setAutoCommit(true);
            }catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return;
    }
    
}


    
    

