/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.util.ArrayList;
import model.DichVu;
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
public class DichVuDAOTest {
    
    
    DichVuDAO dvDAO = new DichVuDAO();
    /**
     * Test of themDichVu method, of class DichVuDAO.
     */
    @Test
    public void testThemDichVu() {
        Connection con = DAO.con;
        DichVu dv = new DichVu();
        dv.setTen("dvmoi");
        dv.setMoTa("motamoi");
        try{
            con.setAutoCommit(false);
            dvDAO.themDichVu(dv);
            
            DichVu moi = dvDAO.getDichVu(dv.getMa());

            Assert.assertNotNull(moi);
            Assert.assertEquals(dv.getMa(), moi.getMa());
            Assert.assertEquals(dv.getTen(), moi.getTen());
            Assert.assertEquals(dv.getMoTa(), moi.getMoTa());
            
            
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
     * Test of getDichVu method, of class DichVuDAO.
     */
    @Test
    public void testGetDichVu() {
        int ma = 1;
        DichVu dv = dvDAO.getDichVu(ma);
        
        Assert.assertNotNull(dv);
        Assert.assertEquals(dv.getMa(), 1);
        Assert.assertEquals(dv.getTen(), "Chăm sóc tóc");
        Assert.assertEquals(dv.getMoTa(), "Các dịch vụ chăm sóc, làm đẹp tóc");
       
        return;
    }
    
    @Test
    public void testNgoaiLeGetDichVu() {
        int ma = 0;
        DichVu dv = dvDAO.getDichVu(ma);
        
        Assert.assertNull(dv);
        return;
    }
    
}
