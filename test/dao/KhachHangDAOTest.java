/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import model.KhachHang;
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
public class KhachHangDAOTest {
    
    
    KhachHangDAO khDAO = new KhachHangDAO();
    
    @Test
    public void testNgoaiLeTimKhachHang1(){
        String ten = "1234";
        ArrayList<KhachHang> ds = khDAO.timKhachHang(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        return;
    }

    @Test
    public void testNgoaiLeTimKhachHang2(){
        String ten = "abc1";
        ArrayList<KhachHang> ds = khDAO.timKhachHang(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        return;
    }
    
    @Test
    public void testTimKhachHang1(){
        String ten = "t";
        ArrayList<KhachHang> ds = khDAO.timKhachHang(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(8, ds.size());
        for(int i = 0; i < ds.size(); i++){
            Assert.assertTrue(ds.get(i).getTen().toLowerCase().contains(ten.toLowerCase()));
        }
        return;
    }

    @Test
    public void testTimKhachHang2(){
        String ten = "z";
        ArrayList<KhachHang> ds = khDAO.timKhachHang(ten);
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        for(int i = 0; i < ds.size(); i++){
            Assert.assertTrue(ds.get(i).getTen().toLowerCase().contains(ten.toLowerCase()));
        }
        return;
    }
        
    /**
     * Test of themKhachHang method, of class KhachHangDAO.
     */
    @Test
    public void testThemKhachHang() {
        Connection con = DAO.con;
        KhachHang kh = new KhachHang();
        kh.setTen("tenmoi");
        kh.setDiaChi("dcmoi");
        kh.setEmail("emailmoi");
        kh.setGhichu("ghichumoi");
        kh.setSoDienThoai(12345);
        try{
            con.setAutoCommit(false);
            khDAO.themKhachHang(kh);
            
            KhachHang moi = khDAO.getKhachHang(kh.getMa());

            Assert.assertNotNull(moi);
            Assert.assertEquals(kh.getMa(), moi.getMa());
            Assert.assertEquals(kh.getTen(), moi.getTen());
            Assert.assertEquals(kh.getDiaChi(), moi.getDiaChi());
            Assert.assertEquals(kh.getEmail(), moi.getEmail());
            Assert.assertEquals(kh.getGhichu(), moi.getGhichu());
            Assert.assertEquals(kh.getSoDienThoai(), moi.getSoDienThoai());
            
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

    /**
     * Test of getKhachHang method, of class KhachHangDAO.
     */
    @Test
    public void testGetKhachHang() {
        int makh = 1;
        KhachHang kh = khDAO.getKhachHang(makh);
        
        Assert.assertNotNull(kh);
        Assert.assertEquals(kh.getMa(), 1);
        Assert.assertEquals(kh.getTen(), "Anh");
        Assert.assertEquals(kh.getDiaChi(), "Hoàn Kiếm");
        Assert.assertEquals(kh.getEmail(), "ta@gmail.com");
        Assert.assertNull(kh.getGhichu());
        Assert.assertEquals(kh.getSoDienThoai(), 12345123);
        return;
    }
    
    @Test
    public void testNgoaiLeGetKhachHang() {
        int makh = 0;
        KhachHang kh = khDAO.getKhachHang(makh);
        Assert.assertNull(kh);
        return;
    }
    
    
    
    
}
