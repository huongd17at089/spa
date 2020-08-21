/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import static dao.DAO.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.Slot;
import java.util.Date;
import model.DichVu;

/**
 *
 * @author My PC
 * ok test 
 */
public class SlotDAO extends DAO{

    public SlotDAO() {
        super();
    }
    
    public ArrayList <Slot> timSlotTrong(Date ngayGio, String tenDichVu){
        ArrayList <Slot> ds = new ArrayList<>();
         String sql = "SELECT slot.ma AS maslot, dv.ma AS madv , slot.maspa, slot.ghichu FROM " +
            "(SELECT ma, ten, mota FROM tbl_dichvu WHERE ten LIKE ?) AS dv, " +
            "(SELECT ma, madv, maspa , ghichu FROM tbl_Slot WHERE tbl_Slot.ma NOT IN (SELECT maslot FROM tbl_slotdat WHERE ngaygio > ? AND ngaygio < ?)) AS slot " +
            "WHERE slot.madv = dv.ma;";
        
        Date ketthuc = new Date(ngayGio.getTime() + 7200000);
        Date bd = new Date(ngayGio.getTime() - 7200000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + tenDichVu + "%");
            ps.setString(2, sdf.format(bd));
            ps.setString(3, sdf.format(ketthuc));
            ResultSet rs = ps.executeQuery();
            
            DichVuDAO dvDAO = new DichVuDAO();
            SpaDAO spaDAO = new SpaDAO();
            while(rs.next()){
                    Slot slot = new Slot();
                    slot.setMa(rs.getInt("maslot"));
                    slot.setDichVu(dvDAO.getDichVu(rs.getInt("madv")));
                    slot.setSpa(spaDAO.getSpa(rs.getInt("maspa")));
                    slot.setGhichu(rs.getString("ghichu"));
                 //   System.out.println(rs.getInt("madv") + " " + rs.getInt("maspa") + " " + rs.getString("ghichu"));
                    ds.add(slot);
            }
        }catch(Exception e){
                e.printStackTrace();
        }
        return ds;
    }
    
    public Slot getSlot(int maslot){
        Slot slot = null;
        String sql = "SELECT * FROM tbl_slot WHERE ma=?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, maslot);
            ResultSet rs = ps.executeQuery();

            DichVuDAO dvDAO = new DichVuDAO();
            SpaDAO spaDAO = new SpaDAO();

            if(rs.next()){
                slot = new Slot();
                slot.setMa(rs.getInt("ma"));
                slot.setDichVu(dvDAO.getDichVu(rs.getInt("madv")));
                slot.setSpa(spaDAO.getSpa(rs.getInt("maspa")));
                slot.setGhichu(rs.getString("ghichu"));
            }
        }catch(Exception e){
                e.printStackTrace();
        }	
        return slot;
    }
    
}
