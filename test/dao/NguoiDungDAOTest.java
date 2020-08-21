/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.NguoiDung;
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
public class NguoiDungDAOTest {
    
   
    NguoiDungDAO ndDAO = new NguoiDungDAO();
    /**
     * Test of kiemTraDangNhap method, of class NguoiDungDAO.
     */
    @Test
    public void testKiemTraDangNhap1() {
        NguoiDung nd = new NguoiDung();
        nd.setTenDangNhap("minh");
        nd.setMatKhau("1234");
        Assert.assertTrue(ndDAO.kiemTraDangNhap(nd));
    }
    
    @Test
    public void testKiemTraDangNhap2() {
        NguoiDung nd = new NguoiDung();
        nd.setTenDangNhap("ngocanh");
        nd.setMatKhau("ngocanh");
        Assert.assertFalse(ndDAO.kiemTraDangNhap(nd));
    }
    
    @Test
    public void testKiemTraDangNhap3() {
        NguoiDung nd = new NguoiDung();
        nd.setTenDangNhap("saitendangnhap");
        nd.setMatKhau("minh");
        Assert.assertFalse(ndDAO.kiemTraDangNhap(nd));
    }

    /**
     * Test of getNguoiDung method, of class NguoiDungDAO.
     */
    @Test
    public void testGetNguoiDung() {
        int ma = 1;
        NguoiDung nd = ndDAO.getNguoiDung(ma);
        
        Assert.assertNotNull(nd);
        Assert.assertEquals(nd.getMa(), 1);
        Assert.assertEquals(nd.getTen(), "Ngọc Anh");
        Assert.assertEquals(nd.getViTri(), "quanly");
        return;
    }
    
    @Test
    public void testNgoaiLeGetNguoiDung() {
        int ma = 0;
        NguoiDung nd = ndDAO.getNguoiDung(ma);
        
        Assert.assertNull(nd);
        return;
    }
    
}
