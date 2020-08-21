/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.DichVu;
import model.Slot;
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
public class SlotDAOTest {
    
    SlotDAO slotDAO = new SlotDAO();

    /**
     * Test of timSlotTrong method, of class SlotDAO.
     */
    @Test
    public void testTimSlotTrong() {
        
        try {
            Date ngaygio = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse("24-5-2019 10:00:00");
            String tendv = "t";
            ArrayList<Slot> ds = slotDAO.timSlotTrong(ngaygio, tendv);
            Assert.assertNotNull(ds);
            Assert.assertEquals(1, ds.size());
            for(int i=0; i<ds.size(); i++){
                Assert.assertFalse(ds.get(i).getMa() == 1);
                
            }
        } catch (ParseException ex) {
            
        }
    }

    /**
     * Test of getSlot method, of class SlotDAO.
     */
    @Test
    public void testGetSlot() {
        int ma = 1;
        Slot slot = slotDAO.getSlot(ma);
        
        Assert.assertNotNull(slot);
        Assert.assertEquals(slot.getMa(), 1);
        Assert.assertEquals(slot.getDichVu(),new DichVuDAO().getDichVu(1));
        Assert.assertEquals(slot.getSpa(),new SpaDAO().getSpa(1));
        Assert.assertNull(slot.getGhichu());
        
        return;
    }
    
    @Test
    public void testNgoaiLeGetSlot() {
        int ma = 0;
        Slot slot = slotDAO.getSlot(ma);
        
        Assert.assertNull(slot);
        
        return;
    }
}
