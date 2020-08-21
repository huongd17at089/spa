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
public class ThietBi implements Serializable, NhapBang{
    private  int ma;
    private String ten, xuatXu, moTa;
    private int soLuong;

    public ThietBi() {
    }

    public ThietBi(int ma, String ten, String xuatXu, String moTa, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.moTa = moTa;
        this.soLuong = soLuong;
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

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.ma;
        hash = 29 * hash + Objects.hashCode(this.ten);
        hash = 29 * hash + Objects.hashCode(this.xuatXu);
        hash = 29 * hash + Objects.hashCode(this.moTa);
        hash = 29 * hash + this.soLuong;
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
        final ThietBi other = (ThietBi) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.xuatXu.equals(other.xuatXu)) {
            return false;
        }
        if (!this.moTa.equals(other.moTa)) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
