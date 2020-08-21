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
public class Slot implements Serializable, NhapBang{
    private int ma;
    private Spa spa;
    private  DichVu dichVu;
    private String ghichu;

    public Slot() {
    }

    public Slot(int ma, Spa spa, DichVu dichVu, String ghichu) {
        this.ma = ma;
        this.spa = spa;
        this.dichVu = dichVu;
        this.ghichu = ghichu;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
    

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public Spa getSpa() {
        return spa;
    }

    public void setSpa(Spa spa) {
        this.spa = spa;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }
    
    
    public Object[] toObject() {
        
        return new Object[]{ma, dichVu.getTen(), spa.getTen(), ghichu};    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.ma;
        hash = 71 * hash + Objects.hashCode(this.spa);
        hash = 71 * hash + Objects.hashCode(this.dichVu);
        hash = 71 * hash + Objects.hashCode(this.ghichu);
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
        final Slot other = (Slot) obj;
        if (this.ma != other.ma) {
            return false;
        }
//        if (!this.ghichu.equals(other.ghichu)) {
//            return false;
//        }
        if (!this.spa.equals(other.spa)) {
            return false;
        }
        if (!this.dichVu.equals(other.dichVu)) {
            return false;
        }
        return true;
    }
    
    

}
