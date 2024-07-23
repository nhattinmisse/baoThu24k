package quanlyhocsinh.app;

import java.util.function.Predicate;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;
import quanlyhocsinh.model.XeHoi;

class SinhVienPredicate implements Predicate<SinhVien> {
    private String keyword;

    public SinhVienPredicate(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean test(SinhVien sv) {
        return sv.getHoTen().equalsIgnoreCase(keyword);
    }
}

class SanPhamPredicate implements Predicate<SanPham> {
    private int maSanPham;

    public SanPhamPredicate(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    @Override
    public boolean test(SanPham sp) {
        return sp.getMaSanPham() == maSanPham;
    }
}

class HoaDonPredicate implements Predicate<HoaDon> {
    private int soHoaDon;

    public HoaDonPredicate(int soHoaDon) {
        this.soHoaDon = soHoaDon;
    }

    @Override
    public boolean test(HoaDon hd) {
        return hd.getSoHoaDon() == soHoaDon;
    }
}

class BanhXePredicate implements Predicate<BanhXe> {
    private double banKinh;

    public BanhXePredicate(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public boolean test(BanhXe bx) {
        return bx.getBanKinh() == banKinh;
    }
}

class DongCoPredicate implements Predicate<DongCo> {
    private double congSuat;

    public DongCoPredicate(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public boolean test(DongCo dc) {
        return dc.getCongSuat() == congSuat;
    }
}

class XeHoiPredicate implements Predicate<XeHoi> {
    private int id;

    public XeHoiPredicate(int id) {
        this.id = id;
    }

    @Override
    public boolean test(XeHoi xh) {
        return xh.getId() == id;
    }
}