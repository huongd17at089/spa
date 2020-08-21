/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
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
public class SlotDatDAOTest {
    
    SlotDatDAO slDAO = new SlotDatDAO();
    /**
     * Test of getSlotDat method, of class SlotDatDAO.
     */
    @Test
    public void testGetSlotDat() {
        int maphieu = 3;
        ArrayList<SlotDat> ds = slDAO.getSlotDat(maphieu);
        Assert.assertNotNull(ds);
        Assert.assertEquals(1, ds.size());
//        for(int i=0; i<listRoom.size(); i++){
//                Assert.assertTrue(listRoom.get(i).getName().toLowerCase().contains(key.toLowerCase()));
//        }
        return;
    }

    /**
     * Test of nhanSlot method, of class SlotDatDAO.
     */
    @Test
    public void testNhanSlot() {
        SlotDat sl = new SlotDat();
        
    }
    
}
