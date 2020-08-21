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
public class DichVu implements Serializable{
    private int ma;
    private String ten, moTa;

    public DichVu() {
    }

    public DichVu(int ma, String ten, String moTa) {
        this.ma = ma;
        this.ten = ten;
        this.moTa = moTa;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.ma;
        hash = 59 * hash + Objects.hashCode(this.ten);
        hash = 59 * hash + Objects.hashCode(this.moTa);
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
        final DichVu other = (DichVu) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.moTa.equals(other.moTa)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
