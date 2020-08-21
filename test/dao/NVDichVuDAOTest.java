/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import model.NVDichVu;

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
public class NVDichVuDAOTest {
    

    NVDichVuDAO nvDAO = new NVDichVuDAO();
    /**
     * Test of timNhanVien method, of class NVDichVuDAO.
     */
    @Test
    public void testTimNhanVien() throws ParseException {
        Date ngaygio = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("24-5-2019 10:00:00");
        int madv = 1;
        ArrayList<NVDichVu> ds = nvDAO.timNhanVien(madv, ngaygio);
        Assert.assertNotNull(ds);
        Assert.assertEquals(7, ds.size());
        for(int i=0; i<ds.size(); i++){
            int ma = ds.get(i).getMa();
            Assert.assertTrue(ma == 1 | ma == 2 | ma == 3 | ma == 4 
                    | ma == 24| ma == 25| ma == 26 );
            

        }
    }
    
}
