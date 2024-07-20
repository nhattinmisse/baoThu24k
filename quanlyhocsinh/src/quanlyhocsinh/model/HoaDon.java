package quanlyhocsinh.model;

import java.util.List;

public class HoaDon implements Cloneable{
	private int soHoaDon;
    private List<SanPham> dssp;

    public HoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public int getSoHoaDon() {
        return soHoaDon;
    }

    public void setSoHoaDon(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    public List<SanPham> getDssp() {
        return dssp;
    }

    public void setDssp(List<SanPham> dssp) {
        this.dssp = dssp;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "HoaDon{" + "soHoaDon=" + soHoaDon + '}';
    }
}
