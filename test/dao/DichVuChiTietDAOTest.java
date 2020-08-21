/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import model.DichVu;
import model.DichVuChiTiet;
import model.Slot;
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
public class DichVuChiTietDAOTest {
    
    DichVuChiTietDAO dvDAO = new DichVuChiTietDAO();
    

    /**
     * Test of getDichVuChiTiet method, of class DichVuChiTietDAO.
     */
    @Test
    public void testGetDichVuChiTiet() {
        int ma = 1;
        DichVuChiTiet dvct = dvDAO.getDichVuChiTiet(ma);
        DichVu dv = new DichVuDAO().getDichVu(1);
        
        Assert.assertNotNull(dvct);
        Assert.assertEquals(dvct.getMa(), 1);
        Assert.assertEquals(dvct.getDichVu(),dv);
        Assert.assertTrue(dvct.getGia() ==  450000 );
        Assert.assertEquals(dvct.getMoTa(), "Tư vấn, làm phồng, hướng dẫn chăm sóc");
        Assert.assertEquals(dvct.getTen(), "Làm phồng chân tóc");
           
        
        
        return;
    }
    
    @Test
    public void testNgoaiLeGetDichVuChiTiet() {
        int ma = 0;
        DichVuChiTiet dvct = dvDAO.getDichVuChiTiet(ma);
        Assert.assertNull(dvct);
        return;
    }
    
    

    /**
     * Test of timDichVuChiTiet method, of class DichVuChiTietDAO.
     */
    @Test
    public void testTimDichVuChiTiet() {
        String ten = "c";
        DichVu dv = new DichVuDAO().getDichVu(1);
        ArrayList<DichVuChiTiet>  ds = dvDAO.timDichVuChiTiet(dv, ten);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(3, ds.size());
        for(int i=0; i<ds.size(); i++){
                Assert.assertTrue(ds.get(i).getTen().toLowerCase().contains(ten.toLowerCase()));
        }
        return;
    }
    
    @Test
    public void testNgoaiLeTimDichVuChiTiet() {
        String ten = "123";
        DichVu dv = new DichVuDAO().getDichVu(1);
        ArrayList<DichVuChiTiet>  ds = dvDAO.timDichVuChiTiet(dv, ten);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        
        return;
    }
    
    @Test
    public void testNgoaiLeTimDichVuChiTiet1() {
        String ten = "a";
        DichVu dv = new DichVuDAO().getDichVu(0);
        ArrayList<DichVuChiTiet>  ds = dvDAO.timDichVuChiTiet(dv, ten);		
        Assert.assertNotNull(ds);
        Assert.assertEquals(0, ds.size());
        
        return;
    }
    
}
