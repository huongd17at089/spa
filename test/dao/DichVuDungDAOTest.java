/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DichVuDung;
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
public class DichVuDungDAOTest {
    
     DichVuDungDAO dvDAO = new DichVuDungDAO();

    
    /**
     * Test of getDSDichVuDung method, of class DichVuDungDAO.
     */
    @Test
    public void testGetDSDichVuDung() {
        int ma = 1;
        ArrayList<DichVuDung> ds= dvDAO.getDSDichVuDung(ma);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(1, ds.size());
//        for(int i=0; i < ds.size(); i++){
//            Assert.assertTrue(listRoom.get(i).getName().toLowerCase().contains(key.toLowerCase()));
//        }
        return;
    }
    
     @Test
    public void testNgoaiLeGetDSDichVuDung() {
        int ma = 0;
        ArrayList<DichVuDung> ds= dvDAO.getDSDichVuDung(ma);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
//        for(int i=0; i < ds.size(); i++){
//            Assert.assertTrue(listRoom.get(i).getName().toLowerCase().contains(key.toLowerCase()));
//        }
        return;
    }

    /**
     * Test of xoaDichVuDung method, of class DichVuDungDAO.
     */
    @Test
    public void testXoaDichVuDung() {
        Connection con = DAO.con;
        DichVuDung dv = new DichVuDung();
        dv.setMa(1);
        
        
        try{
            con.setAutoCommit(false);
            assertTrue(dvDAO.xoaDichVuDung(dv));
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
//    public void testXoaDichVuDung2Lan() {
//        Connection con = DAO.con;
//        DichVuDung dv = new DichVuDung();
//        dv.setMa(1);
//        
//        
//        try{
//            con.setAutoCommit(false);
//            assertTrue(dvDAO.xoaDichVuDung(dv));
//            assertFalse(dvDAO.xoaDichVuDung(dv));
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
    
//    @Test
//    public void testNgoaiLeXoaDichVuDung() {
//        Connection con = DAO.con;
//        DichVuDung dv = new DichVuDung();
//        dv.setMa(0);
//      
//        
//        try{
//            con.setAutoCommit(false);
//            assertFalse(dvDAO.xoaDichVuDung(dv));
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
    
}
