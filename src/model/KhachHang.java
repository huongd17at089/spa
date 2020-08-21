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
public class KhachHang implements Serializable, NhapBang{
    private int ma;
    private String ten, diaChi, email, ghiChu;
    private int soDienThoai;

    public KhachHang() {
    }

    public KhachHang(int ma, String ten, String diaChi, String email, int soDienThoai, String ghichu) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.email = email;
        this.soDienThoai = soDienThoai;
        this.ghiChu = ghichu;
    }

    public String getGhichu() {
        return ghiChu;
    }

    public void setGhichu(String ghichu) {
        this.ghiChu = ghichu;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    
    public Object[] toObject() {
        
        return new Object[]{ma, ten, diaChi, email,soDienThoai, ghiChu};    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.ma;
        hash = 83 * hash + Objects.hashCode(this.ten);
        hash = 83 * hash + Objects.hashCode(this.diaChi);
        hash = 83 * hash + Objects.hashCode(this.email);
        hash = 83 * hash + Objects.hashCode(this.ghiChu);
        hash = 83 * hash + this.soDienThoai;
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
        final KhachHang other = (KhachHang) obj;
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
        if (!this.email.equals(other.email)) {
            return false;
        }
//        if (!this.ghiChu.equals(other.ghiChu)) {
//            return false;
//        }
        return true;
    }
    
    
    
}
