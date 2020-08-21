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
public class NguoiDung implements Serializable, NhapBang{
    private int ma;
    private String  tenDangNhap, matKhau,ten, viTri ;

    public NguoiDung() {
    }

    public NguoiDung(int ma, String tenDangNhap, String matKhau, String ten, String viTri) {
        this.ma = ma;
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
        this.ten = ten;
        this.viTri = viTri;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenDangNhap() {
        return tenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.tenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.ma;
        hash = 59 * hash + Objects.hashCode(this.tenDangNhap);
        hash = 59 * hash + Objects.hashCode(this.matKhau);
        hash = 59 * hash + Objects.hashCode(this.ten);
        hash = 59 * hash + Objects.hashCode(this.viTri);
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
        final NguoiDung other = (NguoiDung) obj;
        if (this.ma != other.ma) {
            return false;
        }
//        if (!this.tenDangNhap.equals(other.tenDangNhap)) {
//            return false;
//        }
//        if (!this.matKhau.equals(other.matKhau)) {
//            return false;
//        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.viTri.equals(other.viTri)) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
