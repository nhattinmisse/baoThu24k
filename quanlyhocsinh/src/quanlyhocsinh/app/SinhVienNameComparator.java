package quanlyhocsinh.app;

import java.util.Comparator;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;
import quanlyhocsinh.model.XeHoi;

class SinhVienComparator implements Comparator<SinhVien> {
    @Override
    public int compare(SinhVien sv1, SinhVien sv2) {
        return sv1.getHoTen().compareTo(sv2.getHoTen()); // Sắp xếp theo tên sinh viên
    }
}

class SanPhamComparator implements Comparator<SanPham> {
    @Override
    public int compare(SanPham sp1, SanPham sp2) {
        return Double.compare(sp1.getGiaCa(), sp2.getGiaCa()); // Sắp xếp theo giá sản phẩm
    }
}

class HoaDonComparator implements Comparator<HoaDon> {
    @Override
    public int compare(HoaDon hd1, HoaDon hd2) {
        return Integer.compare(hd1.getSoHoaDon(), hd2.getSoHoaDon()); // Sắp xếp theo số hóa đơn
    }
}

class BanhXeComparator implements Comparator<BanhXe> {
    @Override
    public int compare(BanhXe bx1, BanhXe bx2) {
        return Double.compare(bx1.getBanKinh(), bx2.getBanKinh()); // Sắp xếp theo bán kính bánh xe
    }
}

class DongCoComparator implements Comparator<DongCo> {
    @Override
    public int compare(DongCo dc1, DongCo dc2) {
        return Double.compare(dc1.getCongSuat(), dc2.getCongSuat()); // Sắp xếp theo công suất động cơ
    }
}

class XeHoiComparator implements Comparator<XeHoi> {
    @Override
    public int compare(XeHoi xh1, XeHoi xh2) {
        return Double.compare(xh1.getGiaXe(), xh2.getGiaXe()); // Sắp xếp theo giá xe
    }
}
