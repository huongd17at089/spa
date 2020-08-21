/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.NguyenLieu;
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
public class NguyenLieuDAOTest {
    
    NguyenLieuDAO nlDAO = new NguyenLieuDAO();
    /**
     * Test of getNguyenLieu method, of class NguyenLieuDAO.
     */
    @Test
    public void testGetNguyenLieu() {
        int ma = 1;
        NguyenLieu nl = nlDAO.getNguyenLieu(ma);
        
        Assert.assertNotNull(nl);
        Assert.assertEquals( 1, nl.getMa());
        Assert.assertEquals("dầu gội A", nl.getTen());
        Assert.assertEquals("ml", nl.getDonVi());
        Assert.assertEquals(200 ,nl.getDungTich(),0);
        Assert.assertEquals(123, nl.getGiaNhap(),0);
        Assert.assertEquals(125 ,nl.getGiaBan(),0);
        return;
    }
    
    @Test
    public void testNgoaiLeGetNguyenLieu() {
        int ma = 0;
        NguyenLieu nl = nlDAO.getNguyenLieu(ma);
        
        Assert.assertNull(nl);
        return;
    }

    /**
     * Test of timNguyenLieu method, of class NguyenLieuDAO.
     */
    @Test
    public void testNgoaiLeTimNguyenLieu() {
        String ten = "1234";
        ArrayList<NguyenLieu> ds = nlDAO.timNguyenLieu(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        return;
    }
    
    
    
    @Test
    public void testTimNguyenLieu() {
        String ten = "B";
        ArrayList<NguyenLieu> ds = nlDAO.timNguyenLieu(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(1, ds.size());
        for(int i = 0; i < ds.size(); i++){
                Assert.assertTrue(ds.get(i).getTen().toLowerCase().contains(ten.toLowerCase()));
        }
        return;
    }
    
}
