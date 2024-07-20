package quanlyhocsinh.model;

public class SanPham implements Cloneable {
    private int maSanPham;
    private String tenSanPham;
    private int soLuong;
    private double giaCa;

    public SanPham(int maSanPham, String tenSanPham, int soLuong, double giaCa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.soLuong = soLuong;
        this.giaCa = giaCa;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getGiaCa() {
        return giaCa;
    }

    @Override
    public String toString() {
        return "SanPham [maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", soLuong=" + soLuong + ", giaCa=" + giaCa + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
