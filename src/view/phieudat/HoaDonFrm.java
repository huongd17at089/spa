/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.phieudat;

import dao.PhieuDatDAO;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DichVuDung;
import model.NguoiDung;
import model.NguyenLieuDung;
import model.PhieuDat;
import model.SlotDat;
import view.nguoidung.NhanVienFrm;

/**
 *
 * @author My PC
 */
public class HoaDonFrm extends javax.swing.JFrame {
    
    private PhieuDat pd;
    private DefaultTableModel bang;
    
    public HoaDonFrm(PhieuDat pd) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        setLocationRelativeTo(null);
        
        btnChinhSua.setBackground(new Color(0, 0, 0, 0));
        btnQuayLai.setBackground(new Color(0, 0, 0, 0));
        btnThanhToan.setBackground(new Color(0, 0, 0, 0));
        btnThuNho.setBackground(new Color(0, 0, 0, 0));
        txtSoDienThoai.setBackground(new Color(0, 0, 0, 0));
        txtSoSlotDat.setBackground(new Color(0, 0, 0, 0));
        txtTenKhachHang.setBackground(new Color(0, 0, 0, 0));
        txtTongTien.setBackground(new Color(0, 0, 0, 0));
        
        tblDanhSach.getTableHeader().setFont(new Font("Arial", 1 , 20));
        tblDanhSach.getTableHeader().setBackground(Color.red);
        this.pd = pd;
        txtTenKhachHang.setText(pd.getKh().getTen());
        txtSoDienThoai.setText(String.valueOf(pd.getKh().getSoDienThoai()));
        txtSoSlotDat.setText(String.valueOf(pd.getDsSlot().size()));
        bang = (DefaultTableModel) tblDanhSach.getModel();
        
        capNhat();
//        //float tongTien = 0;
//        for(SlotDat slot: pd.getDsSlot()){
//            for(DichVuDung dv: slot.getDsdv()){
//                bang.addRow(dv.toObject());
//              //  tongTien += dv.getGia();
//            }
//                
//        }
//        
//        while(bang.getRowCount() > 0)
//                bang.removeRow(0);
//        
//        for(SlotDat slot: pd.getDsSlot()){
//            for(NguyenLieuDung nl: slot.getDsnl()){
//                bang.addRow(nl.toObject());
//               // tongTien += nl.tinhTien();
//            }
//                
//        }
//        
//        txtTongTien.setText(String.valueOf(pd.tinhTien()));
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSach = new javax.swing.JTable();
        btnThanhToan = new javax.swing.JButton();
        btnChinhSua = new javax.swing.JButton();
        txtTongTien = new javax.swing.JTextField();
        txtSoSlotDat = new javax.swing.JTextField();
        btnThuNho = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        backGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1320, 725));
        getContentPane().setLayout(null);

        txtTenKhachHang.setEditable(false);
        txtTenKhachHang.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtTenKhachHang.setBorder(null);
        txtTenKhachHang.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtTenKhachHang);
        txtTenKhachHang.setBounds(500, 104, 310, 41);

        txtSoDienThoai.setEditable(false);
        txtSoDienThoai.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSoDienThoai.setBorder(null);
        txtSoDienThoai.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSoDienThoai);
        txtSoDienThoai.setBounds(1040, 104, 190, 41);

        tblDanhSach.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tblDanhSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên", "Giá", "Khuyến mại", "Số lượng", "Thành tiền"
            }
        ));
        tblDanhSach.setRowHeight(30);
        jScrollPane1.setViewportView(tblDanhSach);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 230, 980, 380);

        btnThanhToan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnThanhToan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });
        getContentPane().add(btnThanhToan);
        btnThanhToan.setBounds(844, 625, 145, 54);

        btnChinhSua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnChinhSua.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnChinhSua);
        btnChinhSua.setBounds(1003, 625, 145, 54);

        txtTongTien.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtTongTien.setForeground(new java.awt.Color(255, 255, 255));
        txtTongTien.setBorder(null);
        txtTongTien.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTongTien.setEnabled(false);
        getContentPane().add(txtTongTien);
        txtTongTien.setBounds(500, 625, 300, 53);

        txtSoSlotDat.setEditable(false);
        txtSoSlotDat.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSoSlotDat.setBorder(null);
        txtSoSlotDat.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtSoSlotDat);
        txtSoSlotDat.setBounds(500, 166, 110, 40);

        btnThuNho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThuNho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuNhoActionPerformed(evt);
            }
        });
        getContentPane().add(btnThuNho);
        btnThuNho.setBounds(1177, 40, 40, 40);

        btnQuayLai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai);
        btnQuayLai.setBounds(1237, 40, 40, 40);

        backGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Group 40.png"))); // NOI18N
        getContentPane().add(backGround);
        backGround.setBounds(0, 0, 1320, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
       (new view.slot.DSSlotThanhToanFrm(pd, this)).setVisible(true);
        this.setVisible(false);
                      
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        pd.setGhiChu("Đã thanh toán");
        PhieuDatDAO pdDAO = new PhieuDatDAO();
        pdDAO.luuThanhToan(pd);
        JOptionPane.showMessageDialog(this, "Đã thanh toán");
        (new NhanVienFrm(pd.getNvDat())).setVisible(true);
                this.dispose();
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnThuNhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuNhoActionPerformed
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnThuNhoActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        (new view.phieudat.TimPhieuThanhToanFrm(pd.getNvThanhToan())).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed
    
    public void capNhat() {
        while(bang.getRowCount() > 0)
            bang.removeRow(0);
      //  float tongTien = 0;
        for(SlotDat slot: pd.getDsSlot()){
            for(DichVuDung dv: slot.getDsdv()){
                bang.addRow(dv.toObject());
             //   tongTien += dv.getGia();
            }
                
        }
        
        
        for(SlotDat slot: pd.getDsSlot()){
            for(NguyenLieuDung nl: slot.getDsnl()){
                bang.addRow(nl.toObject());
             //   tongTien += nl.tinhTien();
            }
                
        }
        
        txtTongTien.setText(String.valueOf(pd.tinhTien()));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backGround;
    private javax.swing.JButton btnChinhSua;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThuNho;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhSach;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtSoSlotDat;
    private javax.swing.JTextField txtTenKhachHang;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables

    
}