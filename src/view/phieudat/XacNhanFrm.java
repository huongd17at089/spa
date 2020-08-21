/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.phieudat;

import dao.PhieuDatDAO;
import exception.DeTrong;
import exception.SaiPhanTram;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.NguoiDung;
import model.PhieuDat;
import model.SlotDat;
import view.khachhang.TimKhachHangFrm;
import view.nguoidung.NhanVienFrm;

/**
 *
 * @author My PC
 */
public class XacNhanFrm extends javax.swing.JFrame {

    /**
     * Creates new form XacNhanFrm
     */
    private PhieuDat pd;
    
   // private NguoiDung nd;
    public XacNhanFrm(PhieuDat pd ) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        txtTenKhachHang.setBackground(new Color(0, 0, 0, 0));
        txtSoDienThoai.setBackground(new Color(0, 0, 0, 0));
        txtKhuyenMai.setBackground(new Color(0, 0, 0, 0));
        txtMaNhanVien.setBackground(new Color(0, 0, 0, 0));
        txtTenNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnXacNhan.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThuNho.setBackground(new Color(0, 0, 0, 0));
        
        tblSlotDat.getTableHeader().setBackground(new Color(0, 0, 0));
        tblSlotDat.getTableHeader().setFont(new Font("Arial", 1 , 22));
        
        this.pd = pd;
        
        txtTenKhachHang.setText(pd.getKh().getTen());
        txtSoDienThoai.setText(String.valueOf(pd.getNvDat().getMa()));
        txtMaNhanVien.setText(String.valueOf(pd.getKh().getSoDienThoai()));
        txtTenNhanVien.setText(pd.getNvDat().getTen());
        
        ArrayList <SlotDat> ds = pd.getDsSlot();
        DefaultTableModel bang = (DefaultTableModel) tblSlotDat.getModel();
        
        while(bang.getRowCount() > 0)
                bang.removeRow(0);
        for(SlotDat sl : ds)
            bang.addRow(sl.toObject());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTenKhachHang = new javax.swing.JTextField();
        txtSoDienThoai = new javax.swing.JTextField();
        txtMaNhanVien = new javax.swing.JTextField();
        txtTenNhanVien = new javax.swing.JTextField();
        txtKhuyenMai = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSlotDat = new javax.swing.JTable();
        btnXacNhan = new javax.swing.JButton();
        btnThuNho = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 724));
        getContentPane().setLayout(null);

        txtTenKhachHang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        txtTenKhachHang.setBorder(null);
        txtTenKhachHang.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTenKhachHang.setEnabled(false);
        getContentPane().add(txtTenKhachHang);
        txtTenKhachHang.setBounds(370, 170, 220, 30);

        txtSoDienThoai.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSoDienThoai.setForeground(new java.awt.Color(255, 255, 255));
        txtSoDienThoai.setBorder(null);
        txtSoDienThoai.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSoDienThoai.setEnabled(false);
        getContentPane().add(txtSoDienThoai);
        txtSoDienThoai.setBounds(890, 170, 220, 30);

        txtMaNhanVien.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtMaNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtMaNhanVien.setBorder(null);
        txtMaNhanVien.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtMaNhanVien.setEnabled(false);
        txtMaNhanVien.setFocusable(false);
        getContentPane().add(txtMaNhanVien);
        txtMaNhanVien.setBounds(370, 240, 220, 30);

        txtTenNhanVien.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTenNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        txtTenNhanVien.setBorder(null);
        txtTenNhanVien.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTenNhanVien.setEnabled(false);
        getContentPane().add(txtTenNhanVien);
        txtTenNhanVien.setBounds(890, 240, 220, 30);

        txtKhuyenMai.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtKhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        txtKhuyenMai.setBorder(null);
        txtKhuyenMai.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtKhuyenMai);
        txtKhuyenMai.setBounds(610, 628, 220, 35);

        tblSlotDat.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        tblSlotDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Tên dịch vu", "Tên spa"
            }
        ));
        tblSlotDat.setRowHeight(30);
        tblSlotDat.setSelectionBackground(new java.awt.Color(0, 153, 102));
        jScrollPane1.setViewportView(tblSlotDat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 290, 1020, 320);

        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnXacNhan);
        btnXacNhan.setBounds(860, 619, 160, 56);

        btnThuNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThuNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuNhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnThuNho);
        btnThuNho.setBounds(1170, 30, 40, 40);

        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(1230, 30, 40, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 22.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1320, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        try {
            int khuyenmai = Integer.parseInt(txtKhuyenMai.getText());
            if(khuyenmai < 0 || khuyenmai > 100) throw new exception.SaiPhanTram();
            pd.setKhuyenMai(khuyenmai);
            
            pd.setGhiChu("Chưa thanh toán");
            PhieuDatDAO pdDAO = new PhieuDatDAO();
            if(pdDAO.luuDat(pd)){
                JOptionPane.showMessageDialog(this, "Thêm thành công");
                (new NhanVienFrm(pd.getNvDat())).setVisible(true);
                this.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Thêm không thành công");
                (new NhanVienFrm(pd.getNvDat())).setVisible(true);
                this.dispose();
            }
        } catch (SaiPhanTram ex) {
            JOptionPane.showMessageDialog(this, "0 <= Khuyến mại <= 100");
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Sai định dạng số");
        } 
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void btnThuNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuNhoActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnThuNhoActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        (new view.khachhang.TimKhachHangFrm(pd)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThuNho;
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSlotDat;
    private javax.swing.JTextField txtKhuyenMai;
    private javax.swing.JTextField txtMaNhanVien;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTenNhanVien;
    // End of variables declaration//GEN-END:variables
}
