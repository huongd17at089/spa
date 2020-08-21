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
public class ChuyenMon implements Serializable, NhapBang{
    private int ma;
    private NVDichVu nv;
    private DichVuChiTiet dv;
    private int diem;

    public ChuyenMon() {
    }

    public ChuyenMon(int ma, NVDichVu nv, DichVuChiTiet dv, int diem) {
        this.ma = ma;
        this.nv = nv;
        this.dv = dv;
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public NVDichVu getNv() {
        return nv;
    }

    public void setNv(NVDichVu nv) {
        this.nv = nv;
    }

    public DichVuChiTiet getDv() {
        return dv;
    }

    public void setDv(DichVuChiTiet dv) {
        this.dv = dv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.ma;
        hash = 67 * hash + Objects.hashCode(this.nv);
        hash = 67 * hash + Objects.hashCode(this.dv);
        hash = 67 * hash + this.diem;
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
        final ChuyenMon other = (ChuyenMon) obj;
        if (this.ma != other.ma) {
            return false;
        }
        if (this.diem != other.diem) {
            return false;
        }
        if (!this.nv.equals(other.nv)) {
            return false;
        }
        if (!this.dv.equals(other.dv)) {
            return false;
        }
        return true;
    }

    @Override
    public Object[] toObject() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
