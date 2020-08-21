/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author My PC
 */
public class CongLam implements Serializable, NhapBang{
    private NVDichVu nv;
    private Date ngaygio;

    public CongLam() {
    }

    public CongLam(NVDichVu nv, Date ngaygio) {
        this.nv = nv;
        this.ngaygio = ngaygio;
    }

    public NVDichVu getNv() {
        return nv;
    }

    public void setNv(NVDichVu nv) {
        this.nv = nv;
    }

    public Date getNgaygio() {
        return ngaygio;
    }

    public void setNgaygio(Date ngaygio) {
        this.ngaygio = ngaygio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nv);
        hash = 31 * hash + Objects.hashCode(this.ngaygio);
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
        final CongLam other = (CongLam) obj;
        if (!this.nv.equals(other.nv)) {
            return false;
        }
        if (this.ngaygio.getTime() == other.ngaygio.getTime()) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
