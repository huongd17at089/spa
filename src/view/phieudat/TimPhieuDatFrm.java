/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.phieudat;

import dao.PhieuDatDAO;
import exception.DeTrong;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NguoiDung;
import model.PhieuDat;

/**
 *
 * @author My PC
 */
public class TimPhieuDatFrm extends javax.swing.JFrame {

    private ArrayList <PhieuDat> dspd;
    private DefaultTableModel bang;
    private NguoiDung nd;
    public TimPhieuDatFrm(NguoiDung nd) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        txtTenKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnTao.setBackground(new Color(0, 0, 0, 0));
        btnTimKiem.setBackground(new Color(0, 0, 0, 0));
        btnThuNho.setBackground(new Color(0, 0, 0, 0));
        btnQuayLai.setBackground(new Color(0, 0, 0, 0));
        
        tblPhieuDat.getTableHeader().setFont(new Font("Arial", 1 , 22));
        
        this.nd = nd;
        bang = (DefaultTableModel) tblPhieuDat.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuDat = new javax.swing.JTable();
        txtTenKhachHang = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnTao = new javax.swing.JButton();
        btnThuNho = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 724));
        getContentPane().setLayout(null);

        tblPhieuDat.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        tblPhieuDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu", "Tên khách hàng", "Số điện thoại", "Ngày đặt", "Trạng thái"
            }
        ));
        tblPhieuDat.setRowHeight(35);
        tblPhieuDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPhieuDatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPhieuDat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 220, 990, 450);

        txtTenKhachHang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTenKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        txtTenKhachHang.setBorder(null);
        getContentPane().add(txtTenKhachHang);
        txtTenKhachHang.setBounds(334, 146, 310, 50);

        btnTimKiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(btnTimKiem);
        btnTimKiem.setBounds(698, 145, 172, 61);

        btnTao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTao);
        btnTao.setBounds(917, 145, 150, 61);

        btnThuNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThuNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuNhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnThuNho);
        btnThuNho.setBounds(1173, 30, 40, 40);

        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai);
        btnQuayLai.setBounds(1237, 30, 40, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 26.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1320, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        try {
            PhieuDatDAO pdDAO = new PhieuDatDAO();
            String ten = txtTenKhachHang.getText().trim();
            if(ten.length() == 0) throw new exception.DeTrong();
            dspd = new PhieuDatDAO().timPhieuDat(ten);
            
            while(bang.getRowCount() > 0)
                bang.removeRow(0);
            for (PhieuDat pd : dspd)
                bang.addRow(pd.toObject());
        } catch (DeTrong ex) {
            JOptionPane.showMessageDialog(this, "chưa nhập tên khách");
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void tblPhieuDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPhieuDatMouseClicked
        int row = tblPhieuDat.getSelectedRow();
        if(row < 0 || row >= tblPhieuDat.getRowCount()){
            JOptionPane.showMessageDialog(this, "chưa chọn phiếu");
            return;
        }
                
        PhieuDat pd = dspd.get(row);
       // pd.setNvNhan(nd);
        (new view.slot.DSSlotDatFrm(pd)).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_tblPhieuDatMouseClicked

    private void btnTaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoActionPerformed
        
        (new view.slot.TimSlotFrm(nd)).setVisible(true);
                    this.dispose();
    }//GEN-LAST:event_btnTaoActionPerformed

    private void btnThuNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuNhoActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnThuNhoActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        (new view.nguoidung.NhanVienFrm(nd)).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnTao;
    private javax.swing.JButton btnThuNho;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhieuDat;
    private javax.swing.JTextField txtTenKhachHang;
    // End of variables declaration//GEN-END:variables
}
