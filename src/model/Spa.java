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
public class Spa implements Serializable, NhapBang{
    private int ma;
    private String ten, diaChi;
    private int soDienThoai;

    public Spa() {
    }

    public Spa(int ma, String ten, String diaChi, int soDienThoai) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
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

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.ma;
        hash = 61 * hash + Objects.hashCode(this.ten);
        hash = 61 * hash + Objects.hashCode(this.diaChi);
        hash = 61 * hash + this.soDienThoai;
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
        final Spa other = (Spa) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (this.soDienThoai != other.soDienThoai) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.diaChi.equals(other.diaChi)) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
