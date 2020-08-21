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
public class NguyenLieuDung implements Serializable, NhapBang{
    private int ma;
    private int soluong;
    private float gia;
    private NguyenLieu nl;
    private int khuyenmai;

    public NguyenLieuDung() {
    }

    public NguyenLieuDung(int ma, int soluong, float gia, NguyenLieu nl, int khuyenmai) {
        this.ma = ma;
        this.soluong = soluong;
        this.gia = gia;
        this.nl = nl;
        this.khuyenmai = khuyenmai;
    }

    public int getKhuyenmai() {
        return khuyenmai;
    }

    public void setKhuyenmai(int khuyenmai) {
        this.khuyenmai = khuyenmai;
    }
    
    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public NguyenLieu getNl() {
        return nl;
    }

    public void setNl(NguyenLieu nl) {
        this.nl = nl;
    }
    
    public float tinhTien(){
        return soluong*gia*(100-khuyenmai)/100;
    }
    
    
    public Object[] toObject() {
        
        return new Object[]{ nl.getTen(), gia, khuyenmai, soluong, tinhTien()};    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.ma;
        hash = 59 * hash + this.soluong;
        hash = 59 * hash + Float.floatToIntBits(this.gia);
        hash = 59 * hash + Objects.hashCode(this.nl);
        hash = 59 * hash + this.khuyenmai;
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
        final NguyenLieuDung other = (NguyenLieuDung) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (this.soluong != other.soluong) {
            return false;
        }
        if (Float.floatToIntBits(this.gia) != Float.floatToIntBits(other.gia)) {
            return false;
        }
        if (this.khuyenmai != other.khuyenmai) {
            return false;
        }
        if (!nl.equals(other.nl)) {
            return false;
        }
        return true;
    }
    
    

}
