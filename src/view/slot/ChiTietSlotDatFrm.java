/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.slot;

import dao.DichVuDungDAO;
import dao.NguyenLieuDungDAO;
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import model.DichVuDung;
import model.NguyenLieuDung;
import model.SlotDat;

/**
 *
 * @author My PC
 */
public class ChiTietSlotDatFrm extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietSlotDatFrm
     */
    private SlotDat slot;
    private DefaultTableModel bangdv, bangnl;
    private DSSlotThanhToanFrm gddsslot;
    public ChiTietSlotDatFrm(SlotDat slot,  DSSlotThanhToanFrm gddsslot) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        txtNgayGio.setBackground(new Color(0, 0, 0, 0));
        txtTenDichVu.setBackground(new Color(0, 0, 0, 0));
        txtTongTien.setBackground(new Color(0, 0, 0, 0));
        txtTrangThai.setBackground(new Color(0, 0, 0, 0));
        txtMaSlot.setBackground(new Color(0,0,0,0));
        btnThemNguyenLieu.setBackground(new Color(0, 0, 0, 0));
        btnXoaDichVu.setBackground(new Color(0, 0, 0, 0));
        btnXoaNguyenLieu.setBackground(new Color(0, 0, 0, 0));
        btnXong.setBackground(new Color(0, 0, 0, 0));
        
        tblDanhSachDichVu.getTableHeader().setFont(new Font("Arial", 1 , 14));
        tblDanhSachNguyenLieu.getTableHeader().setFont(new Font("Arial", 1 , 14));
        this.slot = slot;
        this.gddsslot = gddsslot;
        bangdv = (DefaultTableModel) tblDanhSachDichVu.getModel();
        bangnl = (DefaultTableModel) tblDanhSachNguyenLieu.getModel();
        float tien = 0;
        
        while(bangdv.getRowCount() > 0)
                bangdv.removeRow(0);
        for(DichVuDung dvd: slot.getDsdv()){
            bangdv.addRow(dvd.toObject());
            tien += dvd.getGia();
        }
        
        while(bangnl.getRowCount() > 0)
                bangnl.removeRow(0);
        for(NguyenLieuDung nld: slot.getDsnl()){
            bangnl.addRow(nld.toObject());
            tien += nld.tinhTien();
        }
        
        txtMaSlot.setText(String.valueOf(slot.getMa()));
        txtTenDichVu.setText(slot.getSlot().getDichVu().getTen());
        txtNgayGio.setText(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(slot.getNgayGio()));
        txtTrangThai.setText(slot.getGhiChu());
        txtTongTien.setText(String.valueOf(tien));
        
    }
    
     public void capNhatNguyenLieuDung(NguyenLieuDung nld){
        slot.getDsnl().add(nld);
        bangnl.addRow(nld.toObject());
         txtTongTien.setText(String.valueOf(Float.parseFloat(txtTongTien.getText()) + nld.tinhTien()));
    }

    public SlotDat getSlot() {
        return slot;
    }

   
     
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMaSlot = new javax.swing.JTextField();
        txtTenDichVu = new javax.swing.JTextField();
        txtNgayGio = new javax.swing.JTextField();
        txtTrangThai = new javax.swing.JTextField();
        btnXoaDichVu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachDichVu = new javax.swing.JTable();
        txtTongTien = new javax.swing.JTextField();
        btnThemNguyenLieu = new javax.swing.JButton();
        btnXoaNguyenLieu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachNguyenLieu = new javax.swing.JTable();
        btnXong = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1250, 771));
        getContentPane().setLayout(null);

        txtMaSlot.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtMaSlot.setBorder(null);
        txtMaSlot.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMaSlot.setEnabled(false);
        getContentPane().add(txtMaSlot);
        txtMaSlot.setBounds(290, 71, 50, 30);

        txtTenDichVu.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTenDichVu.setBorder(null);
        txtTenDichVu.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTenDichVu.setEnabled(false);
        getContentPane().add(txtTenDichVu);
        txtTenDichVu.setBounds(450, 71, 240, 30);

        txtNgayGio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtNgayGio.setBorder(null);
        txtNgayGio.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNgayGio.setEnabled(false);
        getContentPane().add(txtNgayGio);
        txtNgayGio.setBounds(820, 71, 170, 30);

        txtTrangThai.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtTrangThai.setBorder(null);
        txtTrangThai.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtTrangThai.setEnabled(false);
        getContentPane().add(txtTrangThai);
        txtTrangThai.setBounds(1120, 71, 80, 30);

        btnXoaDichVu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaDichVu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaDichVuActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoaDichVu);
        btnXoaDichVu.setBounds(418, 108, 58, 30);

        tblDanhSachDichVu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDanhSachDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Đơn giá", "khuyen mãi", "Số lượng", "thành tiền"
            }
        ));
        tblDanhSachDichVu.setRowHeight(18);
        jScrollPane1.setViewportView(tblDanhSachDichVu);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(242, 140, 940, 230);

        txtTongTien.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        txtTongTien.setBorder(null);
        txtTongTien.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTongTien.setEnabled(false);
        txtTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTongTienActionPerformed(evt);
            }
        });
        getContentPane().add(txtTongTien);
        txtTongTien.setBounds(351, 645, 200, 46);

        btnThemNguyenLieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemNguyenLieuActionPerformed(evt);
            }
        });
        getContentPane().add(btnThemNguyenLieu);
        btnThemNguyenLieu.setBounds(459, 380, 58, 30);

        btnXoaNguyenLieu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaNguyenLieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaNguyenLieuActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoaNguyenLieu);
        btnXoaNguyenLieu.setBounds(523, 380, 58, 30);

        tblDanhSachNguyenLieu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDanhSachNguyenLieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Đơn giá", "khuyến mãi", "Số lượng", "Thành tiền"
            }
        ));
        tblDanhSachNguyenLieu.setRowHeight(18);
        jScrollPane2.setViewportView(tblDanhSachNguyenLieu);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(242, 410, 940, 230);

        btnXong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXongActionPerformed(evt);
            }
        });
        getContentPane().add(btnXong);
        btnXong.setBounds(576, 645, 125, 46);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 54.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1250, 721);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemNguyenLieuActionPerformed
        (new view.nguyenlieu.ThemNguyenLieuDungFrm(this)).setVisible(true);
    }//GEN-LAST:event_btnThemNguyenLieuActionPerformed

    private void btnXoaNguyenLieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaNguyenLieuActionPerformed
        int row = tblDanhSachNguyenLieu.getSelectedRow();
        if(row < 0 || row >= tblDanhSachNguyenLieu.getRowCount())
            return;
        NguyenLieuDung nld = slot.getDsnl().get(row);
        slot.getDsnl().remove(row);
        bangnl.removeRow(row);
        NguyenLieuDungDAO nlDAO = new NguyenLieuDungDAO();
        nlDAO.xoaNguyenLieuDung(nld);
        txtTongTien.setText(String.valueOf(Float.parseFloat(txtTongTien.getText()) - nld.tinhTien()));
    }//GEN-LAST:event_btnXoaNguyenLieuActionPerformed

    private void btnXoaDichVuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaDichVuActionPerformed
        int row = tblDanhSachDichVu.getSelectedRow();
        if(row < 0 || row >= tblDanhSachDichVu.getRowCount())
            return;
        DichVuDung dvd = slot.getDsdv().get(row);
        slot.getDsdv().remove(row);
        bangdv.removeRow(row);
        DichVuDungDAO dvDAO = new DichVuDungDAO();
        dvDAO.xoaDichVuDung(dvd);
        txtTongTien.setText(String.valueOf(Float.parseFloat(txtTongTien.getText()) - dvd.tinhtien()));                        
    }//GEN-LAST:event_btnXoaDichVuActionPerformed

    private void txtTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTongTienActionPerformed
       
    }//GEN-LAST:event_txtTongTienActionPerformed

    private void btnXongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXongActionPerformed
        gddsslot.getGdhoadon().capNhat();
        gddsslot.getGdhoadon().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnXongActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btnThemNguyenLieu;
    private javax.swing.JButton btnXoaDichVu;
    private javax.swing.JButton btnXoaNguyenLieu;
    private javax.swing.JButton btnXong;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblDanhSachDichVu;
    private javax.swing.JTable tblDanhSachNguyenLieu;
    private javax.swing.JTextField txtMaSlot;
    private javax.swing.JTextField txtNgayGio;
    private javax.swing.JTextField txtTenDichVu;
    private javax.swing.JTextField txtTongTien;
    private javax.swing.JTextField txtTrangThai;
    // End of variables declaration//GEN-END:variables
}