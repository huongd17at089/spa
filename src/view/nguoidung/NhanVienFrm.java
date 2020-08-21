/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.nguoidung;

import java.awt.Color;
import javax.swing.JFrame;
import model.NguoiDung;

/**
 *
 * @author My PC
 */
public class NhanVienFrm extends javax.swing.JFrame {

    /**
     * Creates new form NhanVienFrm
     */
    
    private NguoiDung nd;
    
    public NhanVienFrm(NguoiDung nd) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        btnDangXuat.setBackground(new Color(0, 0, 0, 0));
        btnDatSlot.setBackground(new Color(0, 0, 0, 0));
        btnNhanKhach.setBackground(new Color(0, 0, 0, 0));
        btnThanhToan.setBackground(new Color(0, 0, 0, 0));
        btnThuNho.setBackground(new Color(0, 0, 0, 0));
        btnDangXuat.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
//        System.out.println(nd.getMa());
       this.nd = nd;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDatSlot = new javax.swing.JButton();
        btnNhanKhach = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnThuNho = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(919, 564));
        getContentPane().setLayout(null);

        btnDatSlot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDatSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatSlotActionPerformed(evt);
            }
        });
        getContentPane().add(btnDatSlot);
        btnDatSlot.setBounds(320, 160, 280, 60);

        btnNhanKhach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNhanKhach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanKhachActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhanKhach);
        btnNhanKhach.setBounds(320, 250, 280, 60);

        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangXuat);
        btnDangXuat.setBounds(320, 420, 280, 60);

        btnThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });
        getContentPane().add(btnThanhToan);
        btnThanhToan.setBounds(320, 330, 280, 60);

        btnThuNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThuNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuNhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnThuNho);
        btnThuNho.setBounds(800, 40, 30, 30);

        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(850, 40, 30, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 14.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 919, 564);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDatSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatSlotActionPerformed
        (new view.slot.TimSlotFrm(nd)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDatSlotActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        (new DangNhapFrm()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnThuNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuNhoActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnThuNhoActionPerformed

    private void btnNhanKhachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanKhachActionPerformed
        (new view.phieudat.TimPhieuDatFrm(nd)).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_btnNhanKhachActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        (new view.phieudat.TimPhieuThanhToanFrm(nd)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        (new DangNhapFrm()).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDatSlot;
    private javax.swing.JButton btnNhanKhach;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThuNho;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
