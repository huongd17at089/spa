/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.NguyenLieuDung;
import model.PhieuDat;
import model.SlotDat;
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
public class PhieuDatDAOTest {
    
      PhieuDatDAO pdDAO = new PhieuDatDAO();
    /**
     * Test of luuDat method, of class PhieuDatDAO.
     */
    @Test
    public void testLuuDat() throws ParseException {
        Connection con = DAO.con;
        PhieuDat pd = new PhieuDat();
        pd.setKh(new KhachHangDAO().getKhachHang(1));
        pd.setGhiChu("ghichumoi");
        pd.setKhuyenMai(0);
        pd.setNgayDat(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("24-5-2020 10:00:00"));
        pd.setNvDat(new NguoiDungDAO().getNguoiDung(1));
        ArrayList <SlotDat> ds = new ArrayList<SlotDat>();
        SlotDat sl = new SlotDat();
        sl.setGhiChu("gihxhu");
        sl.setNgayGio(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("30-5-2020 10:00:00"));
        sl.setSlot(new SlotDAO().getSlot(1));
        ds.add(sl);
        pd.setDsSlot(ds);
        
        try{
            
            con.setAutoCommit(false);
            pdDAO.luuDat(pd);
            
            PhieuDat moi = pdDAO.getPhieuDat(pd.getMa());
            Assert.assertEquals(moi, pd);
            
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
     * Test of timPhieuDat method, of class PhieuDatDAO.
     */
    @Test
    public void testTimPhieuDat() {
        String ten = "t";
        ArrayList<PhieuDat> ds = pdDAO.timPhieuDat(ten);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(2, ds.size());
        for(int i=0; i < ds.size(); i++){
            Assert.assertTrue(ds.get(i).getKh().getTen().toLowerCase().contains(ten.toLowerCase()));
        }
	return;
    }
    
    @Test
    public void testNgoaiLeTimPhieuDat() {
        String ten = "123";
        ArrayList<PhieuDat> ds = pdDAO.timPhieuDat(ten);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        
	return;
    }
    
    @Test
    
    public void testGetPhieuDat() throws ParseException{
        int ma = 3;
        PhieuDat pd = pdDAO.getPhieuDat(ma);
        Assert.assertNotNull(pd);
        Assert.assertEquals(pd.getMa(), 3);
        Assert.assertEquals(pd.getGhiChu(), "da thanh toan");
        Assert.assertEquals(pd.getKh(), new KhachHangDAO().getKhachHang(2));
        
        Assert.assertEquals(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(pd.getNgayDat()) , "2020-06-23 00:07:11");
        Assert.assertEquals(pd.getDsSlot(), new SlotDatDAO().getSlotDat(pd.getMa()));
        Assert.assertEquals(pd.getKhuyenMai(), 10);
        Assert.assertEquals(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(pd.getNgayThanhToan()) , "2019-05-25 12:00:00");
        Assert.assertEquals(pd.getNvDat(), new NguoiDungDAO().getNguoiDung(1));
        Assert.assertEquals(pd.getNvThanhToan(), new NguoiDungDAO().getNguoiDung(1));
        
    }
    
    @Test
    public void testLuuThanhToan() throws ParseException{
        Connection con = DAO.con;
        PhieuDat pd = new PhieuDat();
        pd.setGhiChu("da thanh toan");
        pd.setNvThanhToan(new NguoiDungDAO().getNguoiDung(1));
        pd.setMa(3);
        pd.setNgayThanhToan(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2019-05-25 12:00:00"));
        String sql = "SELECT * FROM tbl_phieudat WHERE ma = ?";
        
        try{
            con.setAutoCommit(false);
            pdDAO.luuThanhToan(pd);
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, pd.getMa());
            ResultSet rs = ps.executeQuery();
            assertTrue(rs.next());
            
            assertEquals(rs.getInt("ma"), pd.getMa());
            assertEquals(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(pd.getNgayThanhToan()) , "2019-05-25 12:00:00");
            assertEquals(rs.getInt("manvthanhtoan"), pd.getNvThanhToan().getMa());
            
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

//    /**
//     * Test of DSPhieuDatTheoDichVu method, of class PhieuDatDAO.
//     */
//    @Test
//    public void testDSPhieuDatTheoDichVu() {
//        System.out.println("DSPhieuDatTheoDichVu");
//        int madv = 0;
//        Date ngaybd = null;
//        Date ngaykt = null;
//        PhieuDatDAO instance = new PhieuDatDAO();
//        ArrayList<PhieuDat> expResult = null;
//        ArrayList<PhieuDat> result = instance.DSPhieuDatTheoDichVu(madv, ngaybd, ngaykt);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
