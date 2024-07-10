package quanlyhocsinh.model;

public class SanPham {
	private int maSanPham;
	private String tenSanPham;
	private int soLuong;
	private double giaCa;
	private HoaDon hoaDon;
	
	public SanPham(int maSanPham, String tenSanPham, int soLuong, double giaCa, HoaDon hoaDon) {
		super();
		this.maSanPham = maSanPham;
		this.tenSanPham = tenSanPham;
		this.soLuong = soLuong;
		this.giaCa = giaCa;
		this.hoaDon = hoaDon;
	}

	public int getMaSanPham() {
		return maSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		this.maSanPham = maSanPham;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public double getGiaCa() {
		return giaCa;
	}

	public void setGiaCa(double giaCa) {
		this.giaCa = giaCa;
	}

	public HoaDon getHoaDon() {
		return hoaDon;
	}

	public void setHoaDon(HoaDon hoaDon) {
		this.hoaDon = hoaDon;
	}

	@Override
	public String toString() {
		return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaCa="
				+ giaCa + ", hoaDon=" + hoaDon + "]";
	}
	
	
}
