package quanlyhocsinh.model;

import java.util.List;

public class LopHoc implements Cloneable{
	private String tenLop;
	private List<SinhVien> dssv;
	
	public LopHoc(String tenLop, List<SinhVien> dssv) {
		super();
		this.tenLop = tenLop;
		this.dssv = dssv;
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

	public void setDssv(List<SinhVien> dssv) {
		this.dssv = dssv;
	}

	@Override
	public String toString() {
		return "LopHoc [tenLop=" + tenLop + ", dssv=" + dssv + "]";
	}
	
	
}
