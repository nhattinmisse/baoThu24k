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
        return sv1.getHoTen().compareToIgnoreCase(sv2.getHoTen());
    }
}

class SanPhamComparator implements Comparator<SanPham> {
    @Override
    public int compare(SanPham sp1, SanPham sp2) {
        return Integer.compare(sp1.getMaSanPham(), sp2.getMaSanPham());
    }
}

class HoaDonComparator implements Comparator<HoaDon> {
    @Override
    public int compare(HoaDon hd1, HoaDon hd2) {
        return Integer.compare(hd1.getSoHoaDon(), hd2.getSoHoaDon());
    }
}

class BanhXeComparator implements Comparator<BanhXe> {
    @Override
    public int compare(BanhXe bx1, BanhXe bx2) {
        return Double.compare(bx1.getBanKinh(), bx2.getBanKinh());
    }
}

class DongCoComparator implements Comparator<DongCo> {
    @Override
    public int compare(DongCo dc1, DongCo dc2) {
        return Double.compare(dc1.getCongSuat(), dc2.getCongSuat());
    }
}


    public class XeHoiComparator implements Comparator<XeHoi> {
        @Override
        public int compare(XeHoi x1, XeHoi x2) {
            return Integer.compare(x1.getMaXe(), x2.getMaXe());
    }
}
