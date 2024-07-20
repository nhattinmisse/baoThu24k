package quanlyhocsinh.app;

import java.util.function.Predicate;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;
import quanlyhocsinh.model.XeHoi;

class SinhVienPredicate implements Predicate<SinhVien> {
    private String tenSinhVien;

    public SinhVienPredicate(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    @Override
    public boolean test(SinhVien sinhVien) {
        return sinhVien.getHoTen().equalsIgnoreCase(tenSinhVien);
    }
}

class SanPhamPredicate implements Predicate<SanPham> {
    private String tenSanPham;

    public SanPhamPredicate(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    @Override
    public boolean test(SanPham sanPham) {
        return sanPham.getTenSanPham().equalsIgnoreCase(tenSanPham);
    }
}

class HoaDonPredicate implements Predicate<HoaDon> {
    private int soHoaDon;

    public HoaDonPredicate(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    @Override
    public boolean test(HoaDon hoaDon) {
        return hoaDon.getSoHoaDon() == soHoaDon;
    }
}

class BanhXePredicate implements Predicate<BanhXe> {
    private String loaiBanhXe;

    public BanhXePredicate(String loaiBanhXe) {
        this.loaiBanhXe = loaiBanhXe;
    }

    @Override
    public boolean test(BanhXe banhXe) {
        return banhXe.getLoaiBanhXe().equalsIgnoreCase(loaiBanhXe);
    }
}

class DongCoPredicate implements Predicate<DongCo> {
    private String loaiDongCo;

    public DongCoPredicate(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public boolean test(DongCo dongCo) {
        return dongCo.getLoaiDongCo().equalsIgnoreCase(loaiDongCo);
    }
}

class XeHoiPredicate implements Predicate<XeHoi> {
    private String tenXe;

    public XeHoiPredicate(String tenXe) {
        this.tenXe = tenXe.toLowerCase(); // Chuyển thành chữ thường để không phân biệt hoa thường
    }

    @Override
    public boolean test(XeHoi xeHoi) {
        return xeHoi.getTenXe().toLowerCase().contains(tenXe);
    }
}