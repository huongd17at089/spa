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
public class NVDichVu implements Serializable, NhapBang{
    private int ma;
    private String ten;
    private String caLam;

    public NVDichVu() {
    }

    public NVDichVu(int ma, String ten, String caLam) {
        this.ma = ma;
        this.ten = ten;
        this.caLam = caLam;
    }

    public String getCaLam() {
        return caLam;
    }

    public void setCaLam(String caLam) {
        this.caLam = caLam;
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

    public Object[] toObject() {
        
        return new Object[]{ma, ten, caLam};    
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.ma;
        hash = 71 * hash + Objects.hashCode(this.ten);
        hash = 71 * hash + Objects.hashCode(this.caLam);
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
        final NVDichVu other = (NVDichVu) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (!this.ten.equals(other.ten)) {
            return false;
        }
        if (!this.caLam.equals(other.caLam)) {
            return false;
        }
        return true;
    }
    
    
    
}
