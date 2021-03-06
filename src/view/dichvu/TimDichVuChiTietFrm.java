/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.dichvu;

import dao.DichVuChiTietDAO;
import exception.ChuaChon;
import exception.DeTrong;
import exception.SaiSo;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DichVuChiTiet;
import model.DichVuDung;
import model.NguyenLieu;
import view.slot.NhapThongTinSlotDatFrm;

/**
 *
 * @author My PC
 */
public class TimDichVuChiTietFrm extends javax.swing.JFrame {

    private ArrayList <DichVuChiTiet> dsdv;
    private DefaultTableModel bang;
    private NhapThongTinSlotDatFrm formnhap;
    
    private int X,Y;

    public NhapThongTinSlotDatFrm getFormnhap() {
        return formnhap;
    }
    
    
    public TimDichVuChiTietFrm(NhapThongTinSlotDatFrm formnhap) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        tblDichVu.getTableHeader().setBackground(new Color(0, 0, 0));
        tblDichVu.getTableHeader().setFont(new Font("Arial", 1 , 20));
        
        btnTimKiem.setBackground(new Color(0, 0, 0, 0));
        btnThem.setBackground(new Color(0, 0, 0, 0));
        btnXacNhan.setBackground(new Color(0, 0, 0, 0));
        this.formnhap = formnhap;
        bang = (DefaultTableModel) tblDichVu.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDichVu = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnXacNhan = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1076, 663));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(240, 120, 406, 32);

        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem);
        btnTimKiem.setBounds(653, 118, 123, 35);

        tblDichVu.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tblDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên dịch vụ", "Loại ", "Giá"
            }
        ));
        tblDichVu.setRowHeight(35);
        jScrollPane1.setViewportView(tblDichVu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 180, 800, 380);

        jTextField2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(280, 580, 210, 31);

        btnThem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem);
        btnThem.setBounds(539, 578, 100, 35);

        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXacNhan);
        btnXacNhan.setBounds(667, 578, 100, 35);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 68.png"))); // NOI18N
        backGround.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backGroundMouseDragged(evt);
            }
        });
        backGround.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backGroundMousePressed(evt);
            }
        });
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 910, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            DichVuChiTietDAO dvDAO = new DichVuChiTietDAO();
            String ten = jTextField1.getText();
            ten = ten.trim();
            if( ten.length() == 0) throw new exception.DeTrong();
            dsdv = dvDAO.timDichVuChiTiet(formnhap.getSlot().getSlot().getDichVu(), ten);
            
            while(bang.getRowCount() > 0)
                bang.removeRow(0);
            for(DichVuChiTiet dvct: dsdv)
                bang.addRow(dvct.toObject());
        } catch (DeTrong ex) {
            JOptionPane.showMessageDialog(this, "chưa nhập tên dịch vụ");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            int row = tblDichVu.getSelectedRow();
            if(row < 0 || row >= tblDichVu.getRowCount()) throw new exception.ChuaChon();
            
            DichVuChiTiet dvct = dsdv.get(row);
            int khuyenmai = Integer.parseInt(jTextField2.getText());
            if( khuyenmai < 0 || khuyenmai > 100) throw new exception.SaiSo();
            DichVuDung dvd = new DichVuDung();
            dvd.setKhuyenmai(khuyenmai);
            dvd.setDv(dvct);
            dvd.setGia(dvct.getGia());
            (new view.nhanvien.TimNhanVienDVFrm(dvd,this )).setVisible(true);
            formnhap.capNhatDichVuDung(dvd);
        } catch (SaiSo ex) {
            JOptionPane.showMessageDialog(this, "  0 <= khuyến mãi <= 100  ");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "khuyến mãi không hợp lệ");
        } catch (ChuaChon ex) {
            
            JOptionPane.showMessageDialog(this, "chua chon");
            
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void backGroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundMouseDragged
        this.setLocation((evt.getX()+this.getX())-X,( evt.getY()+this.getY())-Y);
    }//GEN-LAST:event_backGroundMouseDragged

    private void backGroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backGroundMousePressed
        X = evt.getX();
        Y = evt.getY();
    }//GEN-LAST:event_backGroundMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblDichVu;
    // End of variables declaration//GEN-END:variables
}
