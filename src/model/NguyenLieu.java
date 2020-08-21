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
public class NguyenLieu implements Serializable, NhapBang{
    private int ma;
    private String ten;
    private float giaNhap, giaBan, dungTich;

    public float getDungTich() {
        return dungTich;
    }

    public void setDungTich(float dungTich) {
        this.dungTich = dungTich;
    }
    private String donVi;

    public NguyenLieu() {
    }

    public NguyenLieu(int ma, String ten, float giaNhap, float giaBan, String donVi) {
        this.ma = ma;
        this.ten = ten;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.donVi = donVi;
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

    public float getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(float giaNhap) {
        this.giaNhap = giaNhap;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }
    
    public Object[] toObject() {
        
        return new Object[]{ma, ten, donVi, dungTich, giaBan};    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.ma;
        hash = 97 * hash + Objects.hashCode(this.ten);
        hash = 97 * hash + Float.floatToIntBits(this.giaNhap);
        hash = 97 * hash + Float.floatToIntBits(this.giaBan);
        hash = 97 * hash + Float.floatToIntBits(this.dungTich);
        hash = 97 * hash + Objects.hashCode(this.donVi);
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
        final NguyenLieu other = (NguyenLieu) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (Float.floatToIntBits(this.giaNhap) != Float.floatToIntBits(other.giaNhap)) {
            return false;
        }
        if (Float.floatToIntBits(this.giaBan) != Float.floatToIntBits(other.giaBan)) {
            return false;
        }
        if (Float.floatToIntBits(this.dungTich) != Float.floatToIntBits(other.dungTich)) {
            return false;
        }
        if (!this.donVi.equals(other.donVi)) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        return true;
    }
    
    

}
