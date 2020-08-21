/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.KhachHang;
import model.Spa;
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
public class SpaDAOTest {
    SpaDAO spaDAO = new SpaDAO();
   

    /**
     * Test of getSpa method, of class SpaDAO.
     */
    @Test
    public void testGetSpa() {
        int ma = 1;
        Spa spa = spaDAO.getSpa(ma);
        
        Assert.assertNotNull(spa);
        Assert.assertEquals(spa.getMa(), 1);
        Assert.assertEquals(spa.getTen(), "minh");
        Assert.assertEquals(spa.getDiaChi(), "hn");
        Assert.assertEquals(spa.getSoDienThoai(), 123);
        return;
    }
    
    @Test
    public void testNgoaiLeGetSpa() {
        int ma = 0;
        Spa spa = spaDAO.getSpa(ma);
        Assert.assertNull(spa);
        return;
    }
    
}
