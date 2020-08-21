/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author My PC
 */
public class DichVuDung implements Serializable, NhapBang{
    private int ma;
    private float gia;
    private DichVuChiTiet dv;
    private int khuyenmai;
    private ArrayList <CongLam> dscong;

    public DichVuDung(int ma, float gia, DichVuChiTiet dv, int khuyenmai, ArrayList <CongLam> dscong) {
        this.ma = ma;
        this.gia = gia;
        this.dv = dv;
        this.khuyenmai = khuyenmai;
        this.dscong = dscong;
    }
    
    

    public DichVuDung() {
        dscong = new ArrayList<CongLam>();
    }
    
    

    public ArrayList<CongLam> getDscong() {
        return dscong;
    }

    public void setDscong(ArrayList<CongLam> dscong) {
        this.dscong = dscong;
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

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public DichVuChiTiet getDv() {
        return dv;
    }

    public void setDv(DichVuChiTiet dv) {
        this.dv = dv;
    }
    
    public Object[] toObject() {
        
        return new Object[]{dv.getTen(), gia, khuyenmai, "1", tinhtien()};    
    }
    
    public float tinhtien(){
        return this.gia*(100-this.khuyenmai)/100;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.ma;
        hash = 89 * hash + Float.floatToIntBits(this.gia);
        hash = 89 * hash + Objects.hashCode(this.dv);
        hash = 89 * hash + this.khuyenmai;
        hash = 89 * hash + Objects.hashCode(this.dscong);
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
        final DichVuDung other = (DichVuDung) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (Float.floatToIntBits(this.gia) != Float.floatToIntBits(other.gia)) {
            return false;
        }
        if (this.khuyenmai != other.khuyenmai) {
            return false;
        }
        if (!this.dv.equals(other.dv)) {
            return false;
        }
        if(this.dscong == null && other.dscong != null )
            return false;
        else if(this.dscong != null && other.dscong == null )
            return false;
        else if( this.dscong == null && other.dscong == null)
            return true;
        if (!Arrays.equals(this.dscong.toArray(), other.dscong.toArray())) {
            return false;
        }
        
        return true;
    }
    
    

}
