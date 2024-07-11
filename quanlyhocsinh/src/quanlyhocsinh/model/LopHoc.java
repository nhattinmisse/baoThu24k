package quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.List;

public class LopHoc implements Cloneable{
	private String tenLop;
    private List<SinhVien> dssv;

    public LopHoc(String tenLop) {
        this.tenLop = tenLop;
        this.dssv = new ArrayList<>();
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public List<SinhVien> getDssv() {
        return dssv;
    }

    public void addSinhVien(SinhVien sv) {
        dssv.add(sv);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        LopHoc cloned = (LopHoc) super.clone();
        cloned.dssv = new ArrayList<>(dssv);
        return cloned;
    }

    @Override
    public String toString() {
        return "LopHoc{" + "tenLop='" + tenLop + '\'' + '}';
    }
	
}
