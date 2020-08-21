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
import java.util.Vector;

/**
 *
 * @author My PC
 */
public class SlotDat implements Serializable, NhapBang, Comparable{
    private int ma;
    private Slot slot;
    private Date ngayGio;
    private String ghiChu;
    private ArrayList <DichVuDung> dsdv;
    private ArrayList <NguyenLieuDung> dsnl;

    public SlotDat() {
        dsdv = new ArrayList<DichVuDung>();
        dsnl = new ArrayList<NguyenLieuDung>();
    }

    public SlotDat(int ma, Slot slot, Date ngayGio, String ghiChu, ArrayList <DichVuDung> dsdv, ArrayList <NguyenLieuDung> dsnl) {
        this.ma = ma;
        this.slot = slot;
        this.ngayGio = ngayGio;
        this.ghiChu = ghiChu;
        this.dsdv = dsdv;
        this.dsnl = dsnl;
    }

    public ArrayList<DichVuDung> getDsdv() {
        return dsdv;
    }

    public void setDsdv(ArrayList<DichVuDung> dsdv) {
        this.dsdv = dsdv;
    }

    public ArrayList<NguyenLieuDung> getDsnl() {
        return dsnl;
    }

    public void setDsnl(ArrayList<NguyenLieuDung> dsnl) {
        this.dsnl = dsnl;
    }
    
    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public Date getNgayGio() {
        return ngayGio;
    }

    public void setNgayGio(Date ngayGio) {
        this.ngayGio = ngayGio;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public Object[] toObject() {
        
        return new Object[]{slot.getMa(), slot.getDichVu().getTen(), slot.getSpa().getTen(),new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(ngayGio), ghiChu};    
    }
    
    public float tinhtien(){
        float tien = 0;
        for(NguyenLieuDung nl: this.dsnl)
            tien += nl.tinhTien();
        
        for(DichVuDung dv: this.dsdv)
            tien += dv.tinhtien();
        return tien;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.ma;
        hash = 79 * hash + Objects.hashCode(this.slot);
        hash = 79 * hash + Objects.hashCode(this.ngayGio);
        hash = 79 * hash + Objects.hashCode(this.ghiChu);
        hash = 79 * hash + Objects.hashCode(this.dsdv);
        hash = 79 * hash + Objects.hashCode(this.dsnl);
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
        final SlotDat other = (SlotDat) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (!this.ghiChu.equals(other.ghiChu)) {
            return false;
        }
        if (!this.slot.equals(other.slot)) {
            return false;
        }
        if (this.ngayGio.getTime() != other.ngayGio.getTime()) {
            return false;
        }
        if (!Arrays.equals(this.dsdv.toArray(), other.dsdv.toArray())) {
            return false;
        }
        if (!Arrays.equals(this.dsnl.toArray(), other.dsnl.toArray())) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        SlotDat other = (SlotDat)o;
        int b1 =  this.getSlot().getMa();
        int b2 = other.getSlot().getMa();
        int date = this.ngayGio.compareTo(other.getNgayGio());
        return b1-b2+date;
    }
    
    
    
    
}
