/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;

/**
 *
 * @author My PC
 */
public class ThongKeDichVu extends DichVu implements  NhapBang{
    private int soLuongDat;
    private float doanhThu;

    public ThongKeDichVu(int soLuongDat, float doanhThu) {
        super();
        this.soLuongDat = soLuongDat;
        this.doanhThu = doanhThu;
    }

    public ThongKeDichVu() {
        super();
    }

    public int getSoLuongDat() {
        return soLuongDat;
    }

    public void setSoLuongDat(int soLuongDat) {
        this.soLuongDat = soLuongDat;
    }

    public float getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(float doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public Object[] toObject() {
        
        return  new Object[]{super.getMa(), super.getTen(),super.getMoTa(), doanhThu, soLuongDat};    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.soLuongDat;
        hash = 67 * hash + Float.floatToIntBits(this.doanhThu);
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
        final ThongKeDichVu other = (ThongKeDichVu) obj;
        if (this.soLuongDat != other.soLuongDat) {
            return false;
        }
        if (Float.floatToIntBits(this.doanhThu) != Float.floatToIntBits(other.doanhThu)) {
            return false;
        }
        return true;
    }
    
    
    
}
