/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author My PC
 */
public class PhieuDat implements Serializable, NhapBang{
    private int ma;
    private NguoiDung nvDat, nvThanhToan;
  //  private NguoiDung nvNhan;
    private ArrayList <SlotDat> dsSlot;
    private Date NgayDat;
    private Date NgayThanhToan;
    private KhachHang kh;
    private String ghiChu;
    private int khuyenMai;

    public PhieuDat() {
        dsSlot = new ArrayList<SlotDat>();
    }

    public PhieuDat(int ma, NguoiDung nvDat, NguoiDung nvThanhToan, ArrayList<SlotDat> dsSlot, Date NgayDat, Date NgayThanhToan, KhachHang kh, String ghiChu, int khuyenMai) {
        this.ma = ma;
        this.nvDat = nvDat;
        //this.nvNhan = nvNhan;
        this.nvThanhToan = nvThanhToan;
        this.dsSlot = dsSlot;
        this.NgayDat = NgayDat;
        this.NgayThanhToan = NgayThanhToan;
        this.kh = kh;
        this.ghiChu = ghiChu;
        this.khuyenMai = khuyenMai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public NguoiDung getNvDat() {
        return nvDat;
    }

    public void setNvDat(NguoiDung nvDat) {
        this.nvDat = nvDat;
    }

//    public NguoiDung getNvNhan() {
//        return nvNhan;
//    }
//
//    public void setNvNhan(NguoiDung nvNhan) {
//        this.nvNhan = nvNhan;
//    }

    public NguoiDung getNvThanhToan() {
        return nvThanhToan;
    }

    public void setNvThanhToan(NguoiDung nvThanhToan) {
        this.nvThanhToan = nvThanhToan;
    }

    public ArrayList<SlotDat> getDsSlot() {
        return dsSlot;
    }

    public void setDsSlot(ArrayList<SlotDat> dsSlot) {
        this.dsSlot = dsSlot;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }

    public Date getNgayThanhToan() {
        return NgayThanhToan;
    }

    public void setNgayThanhToan(Date NgayThanhToan) {
        this.NgayThanhToan = NgayThanhToan;
    }

    public KhachHang getKh() {
        return kh;
    }

    public void setKh(KhachHang kh) {
        this.kh = kh;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(int khuyenMai) {
        this.khuyenMai = khuyenMai;
    }
    
    public Object[] toObject() {
        
        return new Object[]{ma, kh.getTen(),kh.getSoDienThoai(), new SimpleDateFormat("dd-MM-yyyy H:mm:ss").format(NgayDat), ghiChu};    
    }
    
    public float tinhTien(){
        float tien =0;
        for(SlotDat sl : this.dsSlot)
            tien += sl.tinhtien();
        return tien;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ma;
        hash = 79 * hash + Objects.hashCode(this.nvDat);
        hash = 79 * hash + Objects.hashCode(this.nvThanhToan);
        hash = 79 * hash + Objects.hashCode(this.dsSlot);
        hash = 79 * hash + Objects.hashCode(this.NgayDat);
        hash = 79 * hash + Objects.hashCode(this.NgayThanhToan);
        hash = 79 * hash + Objects.hashCode(this.kh);
        hash = 79 * hash + Objects.hashCode(this.ghiChu);
        hash = 79 * hash + this.khuyenMai;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PhieuDat other = (PhieuDat) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (this.khuyenMai != other.khuyenMai) {
            return false;
        }
        if (!this.ghiChu.equals(other.ghiChu)) {
            return false;
        }
        if (!this.nvDat.equals(other.nvDat)) {
            return false;
        }
        if (!this.nvThanhToan.equals(other.nvThanhToan)) {
            return false;
        }
        if (!Arrays.equals(this.dsSlot.toArray(), other.dsSlot.toArray())) {
            return false;
        }
        if (this.NgayDat.getTime() != other.NgayDat.getTime()) {
            return false;
        }
        if (this.NgayThanhToan.getTime() != other.NgayThanhToan.getTime()) {
            return false;
        }
        if (!this.kh.equals(other.kh)) {
            return false;
        }
        return true;
    }

    
    
}
