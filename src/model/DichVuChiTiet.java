/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author My PC
 */
public class DichVuChiTiet implements Serializable, NhapBang{
    private int ma;
    private String ten, moTa;
    private float gia;
    private DichVu dichVu;

    public DichVuChiTiet(int ma, String ten, String moTa, float gia, DichVu dichVu) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
        this.gia = gia;
        this.dichVu = dichVu;
    }

    public DichVuChiTiet() {
    }

    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
    
    public Object[] toObject() {
        
        return new Object[]{ten, dichVu.getTen(), gia};    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + this.ma;
        hash = 41 * hash + Objects.hashCode(this.ten);
        hash = 41 * hash + Objects.hashCode(this.moTa);
        hash = 41 * hash + Float.floatToIntBits(this.gia);
        hash = 41 * hash + Objects.hashCode(this.dichVu);
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
        final DichVuChiTiet other = (DichVuChiTiet) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (Float.floatToIntBits(this.gia) != Float.floatToIntBits(other.gia)) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.moTa.equals(other.moTa)) {
            return false;
        }
        if (!this.dichVu.equals(other.dichVu)) {
            return false;
        }
        return true;
    }
    
    
    
}
    
   
