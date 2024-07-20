package quanlyhocsinh.app;



import java.util.*;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.LapTop;
import quanlyhocsinh.model.LopHoc;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;

import quanlyhocsinh.model.XeHoi;
import quanlyhocsinh.model.DBConnection;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QuanLySinhVien {

	private static List<SinhVien> sinhVienList = new ArrayList<>();
    private static List<SanPham> sanPhamList = new ArrayList<>();
    private static List<HoaDon> hoaDonList = new ArrayList<>();
    private static List<BanhXe> banhXeList = new ArrayList<>();
    private static List<DongCo> dongCoList = new ArrayList<>();
    private static List<XeHoi> xeHoiList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự newline

            switch (choice) {
                case 1:
                    nhapDuLieu(scanner);
                    break;
                case 3:
                    sapXepDuLieu(scanner);
                    break;
                case 4:
                    timKiemDuLieu(scanner);
                    break;
                case 5:
                    xuatTatCaThongTin();
                    break;
                case 6:
                    suDungDeepCloning();
                    break;
                case 7:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void showMenu() {
        System.out.println("===============================================");
        System.out.println("==      CHƯƠNG TRÌNH QUẢN LÝ TÀI SẢN SINH VIÊN ==");
        System.out.println("==    1. Nhập dữ liệu                          ==");
        System.out.println("==    3. Sắp xếp dữ liệu                       ==");
        System.out.println("==    4. Tìm kiếm dữ liệu                      ==");
        System.out.println("==    5. Xuất tất cả thông tin                 ==");
        System.out.println("==    6. Sử dụng kỹ thuật Deep Cloning         ==");
        System.out.println("==    7. Thoát                                 ==");
        System.out.println("===============================================");
        System.out.print("Chọn chức năng: ");
    }

    private static void nhapDuLieu(Scanner scanner) {
        // Nhập số lượng Sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int soLuongSinhVien = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự newline
        for (int i = 0; i < soLuongSinhVien; i++) {
            System.out.print("Nhập tên sinh viên: ");
            String tenSinhVien = scanner.nextLine();
            System.out.print("Nhập tên lớp: ");
            String tenLop = scanner.nextLine();
            LopHoc lopHoc = new LopHoc(tenLop);
            SinhVien sinhVien = new SinhVien(tenSinhVien, lopHoc);
            sinhVienList.add(sinhVien);
            System.out.println("Đã thêm sinh viên: " + sinhVien);
        }

        // Nhập số lượng Sản phẩm
        System.out.print("Nhập số lượng sản phẩm: ");
        int soLuongSanPham = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự newline
        for (int i = 0; i < soLuongSanPham; i++) {
            System.out.print("Nhập mã sản phẩm: ");
            int maSanPham = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự newline
            System.out.print("Nhập tên sản phẩm: ");
            String tenSanPham = scanner.nextLine();
            System.out.print("Nhập số lượng: ");
            int soLuong = scanner.nextInt();
            System.out.print("Nhập giá cả: ");
            double giaCa = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline

            SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, giaCa);
            sanPhamList.add(sanPham);
            System.out.println("Đã thêm sản phẩm: " + sanPham);
        }

        // Nhập số lượng Hóa đơn
        System.out.print("Nhập số lượng hóa đơn: ");
        int soLuongHoaDon = scanner.nextInt();
        for (int i = 0; i < soLuongHoaDon; i++) {
            System.out.print("Nhập số hóa đơn: ");
            int soHoaDon = scanner.nextInt();
            HoaDon hoaDon = new HoaDon(soHoaDon);
            hoaDonList.add(hoaDon);
            System.out.println("Đã thêm hóa đơn: " + hoaDon);
        }

        // Nhập số lượng Bánh xe
        System.out.print("Nhập số lượng bánh xe: ");
        int soLuongBanhXe = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự newline
        for (int i = 0; i < soLuongBanhXe; i++) {
            System.out.print("Nhập loại bánh xe: ");
            String loaiBanhXe = scanner.nextLine();
            System.out.print("Nhập bán kính bánh xe: ");
            double banKinh = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline
            BanhXe banhXe = new BanhXe(loaiBanhXe, banKinh);
            banhXeList.add(banhXe);
            System.out.println("Đã thêm bánh xe: " + banhXe);
        }

        // Nhập số lượng Động cơ
        System.out.print("Nhập số lượng động cơ: ");
        int soLuongDongCo = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự newline
        for (int i = 0; i < soLuongDongCo; i++) {
            System.out.print("Nhập loại động cơ: ");
            String loaiDongCo = scanner.nextLine();
            System.out.print("Nhập công suất động cơ: ");
            double congSuat = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline
            DongCo dongCo = new DongCo(loaiDongCo, congSuat);
            dongCoList.add(dongCo);
            System.out.println("Đã thêm động cơ: " + dongCo);
        }

        // Nhập số lượng Xe hơi
        System.out.print("Nhập số lượng xe hơi: ");
        int soLuongXeHoi = scanner.nextInt();
        scanner.nextLine();  // Đọc ký tự newline
        for (int i = 0; i < soLuongXeHoi; i++) {
            DongCo dongCo = null;
            if (!dongCoList.isEmpty()) {
                dongCo = dongCoList.get(0);
            }
            XeHoi xeHoi = new XeHoi(i, null, i, i, dongCo, banhXeList);
            List<BanhXe> dsbx = new ArrayList<>(banhXeList);
            xeHoi.setDsbx(dsbx);
            xeHoiList.add(xeHoi);
            System.out.println("Đã thêm xe hơi: " + xeHoi);
        }
    }

    private static void sapXepDuLieu(Scanner scanner) {
        System.out.println("Sắp xếp sinh viên theo tên:");
        Collections.sort(sinhVienList, Comparator.comparing(SinhVien::getHoTen));
        sinhVienList.forEach(System.out::println);
    }

    private static void timKiemDuLieu(Scanner scanner) {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tenSinhVien = scanner.nextLine();
        List<SinhVien> ketQua = sinhVienList.stream()
            .filter(sv -> sv.getHoTen().contains(tenSinhVien))
            .collect(Collectors.toList());
        ketQua.forEach(System.out::println);
    }

    private static void xuatTatCaThongTin() {
        System.out.println("Danh sách sinh viên:");
        sinhVienList.forEach(System.out::println);
        System.out.println("Danh sách sản phẩm:");
        sanPhamList.forEach(System.out::println);
        System.out.println("Danh sách hóa đơn:");
        hoaDonList.forEach(System.out::println);
        System.out.println("Danh sách bánh xe:");
        banhXeList.forEach(System.out::println);
        System.out.println("Danh sách động cơ:");
        dongCoList.forEach(System.out::println);
        System.out.println("Danh sách xe hơi:");
        xeHoiList.forEach(System.out::println);
    }

    private static void suDungDeepCloning() {
        if (!sinhVienList.isEmpty()) {
            try {
                SinhVien original = sinhVienList.get(0);
                SinhVien cloned = (SinhVien) original.clone();
                System.out.println("Original: " + original);
                System.out.println("Cloned: " + cloned);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
    }
    

}