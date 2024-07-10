package quanlyhocsinh.model;

import java.util.List;

public class XeHoi extends SanPham {
	private DongCo dongCo;
	private List<BanhXe> dsbx;
	public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, HoaDon hoaDon, DongCo dongCo,
			List<BanhXe> dsbx) {
		super(maSanPham, tenSanPham, soLuong, giaCa, hoaDon);
		this.dongCo = dongCo;
		this.dsbx = dsbx;
	}
	public DongCo getDongCo() {
		return dongCo;
	}
	public void setDongCo(DongCo dongCo) {
		this.dongCo = dongCo;
	}
	public List<BanhXe> getDsbx() {
		return dsbx;
	}
	public void setDsbx(List<BanhXe> dsbx) {
		this.dsbx = dsbx;
	}
	@Override
	public String toString() {
		return "XeHoi [dongCo=" + dongCo + ", dsbx=" + dsbx + "]";
	}
	
	
}
