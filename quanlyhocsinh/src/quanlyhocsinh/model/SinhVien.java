package quanlyhocsinh.model;

import java.util.List;

public class SinhVien implements Cloneable {
	private String hoTen;
    private LopHoc lop;
    private List<HoaDon> dshd;

    public SinhVien(String hoTen, LopHoc lop) {
        this.hoTen = hoTen;
        this.lop = lop;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LopHoc getLop() {
        return lop;
    }

    public void setLop(LopHoc lop) {
        this.lop = lop;
    }

    public List<HoaDon> getDshd() {
        return dshd;
    }

    public void setDshd(List<HoaDon> dshd) {
        this.dshd = dshd;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        SinhVien cloned = (SinhVien) super.clone();
        cloned.lop = (LopHoc) lop.clone(); // deep clone LopHoc
        return cloned;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "hoTen='" + hoTen + '\'' + ", lop=" + lop + '}';
    }
}
