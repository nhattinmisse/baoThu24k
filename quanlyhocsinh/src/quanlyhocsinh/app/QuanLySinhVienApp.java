package quanlyhocsinh.app;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.LapTop;
import quanlyhocsinh.model.LopHoc;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;
import quanlyhocsinh.model.XeHoi;

import java.util.stream.Collectors;

public class QuanLySinhVienApp {

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
                case 2:
                    sapXepDuLieu(scanner);
                    break;
                case 3:
                    timKiemDuLieu(scanner);
                    break;
                case 4:
                	xoaDuLieu(scanner);
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
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void showMenu() {
        System.out.println("===============================================");
        System.out.println("==      CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN        ==");
        System.out.println("==    1. Nhập dữ liệu                         ==");
        System.out.println("==    2. Sắp xếp dữ liệu                      ==");
        System.out.println("==    3. Tìm kiếm dữ liệu                     ==");
        System.out.println("==    4. Xóa dữ liệu                          ==");
        System.out.println("==    5. Xuất tất cả thông tin                ==");
        System.out.println("==    6. Sử dụng kỹ thuật Deep Cloning        ==");
        System.out.println("==    7. Thoát                                ==");
        System.out.println("===============================================");
        System.out.print("Chọn chức năng: ");
    }

    private static void nhapDuLieu(Scanner scanner) {
        System.out.println("==    Chọn loại dữ liệu cần nhập:                  ==");
        System.out.println("==    1. Nhập dữ liệu sinh viên                    ==");
        System.out.println("==    2. Nhập dữ liệu sản phẩm                     ==");
        System.out.println("==    3. Nhập dữ liệu hóa đơn                      ==");
        System.out.println("==    4. Nhập dữ liệu bánh xe                      ==");
        System.out.println("==    5. Nhập dữ liệu động cơ                      ==");
        System.out.println("==    6. Nhập dữ liệu xe hơi                       ==");
        System.out.print("Chọn loại dữ liệu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        System.out.print("Nhập số lượng cần nhập: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        switch (choice) {
            case 1:
                nhapDuLieuSinhVien(scanner, soLuong);
                break;
            case 2:
                nhapDuLieuSanPham(scanner, soLuong);
                break;
            case 3:
                nhapDuLieuHoaDon(scanner, soLuong);
                break;
            case 4:
                nhapDuLieuBanhXe(scanner, soLuong);
                break;
            case 5:
                nhapDuLieuDongCo(scanner, soLuong);
                break;
            case 6:
                nhapDuLieuXeHoi(scanner, soLuong);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }

    private static void nhapDuLieuSinhVien(Scanner scanner, int soLuongSV) {
        for (int i = 0; i < soLuongSV; i++) {
            System.out.println("==   Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("==   Nhập tên sinh viên: ");
            String hoTen = scanner.nextLine();
            System.out.print("==   Nhập tên lớp: ");
            String tenLop = scanner.nextLine();
            LopHoc lopHoc = new LopHoc(tenLop);
            SinhVien sinhVien = new SinhVien(hoTen, lopHoc, i);
            sinhVienList.add(sinhVien);
        }

        System.out.println("==            Thông tin sinh viên vừa nhập:           ==");
        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
        System.out.println("==----------------------------------------------------==");
    }

    private static void nhapDuLieuSanPham(Scanner scanner, int soLuongSP) {
        for (int i = 0; i < soLuongSP; i++) {
            System.out.println("==   Nhập thông tin sản phẩm thứ " + (i + 1) + ":");
            System.out.print("==   Nhập mã sản phẩm: ");
            int maSanPham = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự newline
            System.out.print("==   Nhập tên sản phẩm: ");
            String tenSanPham = scanner.nextLine();
            System.out.print("==   Nhập số lượng: ");
            int soLuong = scanner.nextInt();
            System.out.print("==   Nhập giá cả: ");
            double giaCa = scanner.nextDouble();
            scanner.nextLine(); // Đọc ký tự newline

            SanPham sanPham = new SanPham(maSanPham, tenSanPham, soLuong, giaCa);
            sanPhamList.add(sanPham);
            System.out.println("Đã thêm sản phẩm: " + sanPham);
        }

        System.out.println("==            Thông tin sản phẩm vừa nhập:           ==");
        for (SanPham sp : sanPhamList) {
            System.out.println(sp);
        }
        System.out.println("==----------------------------------------------------==");
    }

    private static void nhapDuLieuHoaDon(Scanner scanner, int soLuongHD) {
        for (int i = 0; i < soLuongHD; i++) {
            System.out.println("==   Nhập thông tin hóa đơn thứ " + (i + 1) + ":");
            System.out.print("==   Nhập số hóa đơn: ");
            int soHoaDon = scanner.nextInt();
            HoaDon hoaDon = new HoaDon(soHoaDon);
            hoaDonList.add(hoaDon);
            System.out.println("Đã thêm hóa đơn: " + hoaDon);
        }

        System.out.println("==            Thông tin hóa đơn vừa nhập:            ==");
        for (HoaDon hd : hoaDonList) {
            System.out.println(hd);
        }
        System.out.println("==----------------------------------------------------==");
    }

    private static void nhapDuLieuBanhXe(Scanner scanner, int soLuongBX) {
        for (int i = 0; i < soLuongBX; i++) {
            System.out.println("==   Nhập thông tin bánh xe thứ " + (i + 1) + ":");
            System.out.print("==   Nhập loại bánh xe: ");
            String loaiBanhXe = scanner.nextLine();
            System.out.print("==   Nhập bán kính bánh xe: ");
            double banKinh = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline

            BanhXe banhXe = new BanhXe(loaiBanhXe, banKinh);
            banhXeList.add(banhXe);
            System.out.println("Đã thêm bánh xe: " + banhXe);
        }

        System.out.println("==            Thông tin bánh xe vừa nhập:            ==");
        for (BanhXe bx : banhXeList) {
            System.out.println(bx);
        }
        System.out.println("==----------------------------------------------------==");
    }

    private static void nhapDuLieuDongCo(Scanner scanner, int soLuongDC) {
        for (int i = 0; i < soLuongDC; i++) {
            System.out.println("==   Nhập thông tin động cơ thứ " + (i + 1) + ":");
            System.out.print("==   Nhập loại động cơ: ");
            String loaiDongCo = scanner.nextLine();
            System.out.print("==   Nhập công suất động cơ: ");
            double congSuat = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline

            DongCo dongCo = new DongCo(loaiDongCo, congSuat);
            dongCoList.add(dongCo);
            System.out.println("Đã thêm động cơ: " + dongCo);
        }

        System.out.println("==            Thông tin động cơ vừa nhập:            ==");
        for (DongCo dc : dongCoList) {
            System.out.println(dc);
        }
        System.out.println("==----------------------------------------------------==");
    }

    private static void nhapDuLieuXeHoi(Scanner scanner, int soLuongXH) {
        for (int i = 0; i < soLuongXH; i++) {
            System.out.println("==   Nhập thông tin xe hơi thứ " + (i + 1) + ":");
            System.out.print("==   Nhập mã xe: ");
            int maXe = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự newline
            System.out.print("==   Nhập tên xe: ");
            String tenXe = scanner.nextLine();
            System.out.print("==   Nhập năm sản xuất: ");
            int namSanXuat = scanner.nextInt();
            System.out.print("==   Nhập giá xe: ");
            double giaXe = scanner.nextDouble();
            scanner.nextLine();  // Đọc ký tự newline

            DongCo dongCo = null;
            if (!dongCoList.isEmpty()) {
                System.out.println("Chọn động cơ cho xe:");
                for (int j = 0; j < dongCoList.size(); j++) {
                    System.out.println(j + 1 + ". " + dongCoList.get(j));
                }
                int chonDongCo = scanner.nextInt() - 1;
                dongCo = dongCoList.get(chonDongCo);
                scanner.nextLine();  // Đọc ký tự newline
            }

            List<BanhXe> dsbx = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                if (!banhXeList.isEmpty()) {
                    System.out.println("Chọn bánh xe thứ " + (j + 1) + " cho xe:");
                    for (int k = 0; k < banhXeList.size(); k++) {
                        System.out.println(k + 1 + ". " + banhXeList.get(k));
                    }
                    int chonBanhXe = scanner.nextInt() - 1;
                    dsbx.add(banhXeList.get(chonBanhXe));
                    scanner.nextLine();  // Đọc ký tự newline
                }
            }

            XeHoi xeHoi = new XeHoi(maXe, tenXe, namSanXuat, giaXe, dongCo, dsbx, namSanXuat, tenXe, namSanXuat, giaXe);
            xeHoiList.add(xeHoi);
            System.out.println("Đã thêm xe hơi: " + xeHoi);
        }

        System.out.println("==            Thông tin xe hơi vừa nhập:            ==");
        for (XeHoi xh : xeHoiList) {
            System.out.println(xh);
        }
        System.out.println("==----------------------------------------------------==");
    }
    
    private static void xoaDuLieu(Scanner scanner) {
        System.out.println("==    Chọn loại dữ liệu cần xóa:                ==");
        System.out.println("==    1. Xóa sinh viên theo tên                 ==");
        System.out.println("==    2. Xóa sản phẩm theo mã sản phẩm          ==");
        System.out.println("==    3. Xóa hóa đơn theo số hóa đơn            ==");
        System.out.println("==    4. Xóa bánh xe theo loại                  ==");
        System.out.println("==    5. Xóa động cơ theo loại                  ==");
        System.out.println("==    6. Xóa xe hơi theo mã xe                  ==");
        System.out.print("Chọn loại dữ liệu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        switch (choice) {
            case 1:
                System.out.print("==    Nhập tên sinh viên cần xóa: ");
                String tenSV = scanner.nextLine();
                sinhVienList.removeIf(sv -> sv.getHoTen().equalsIgnoreCase(tenSV));
                break;
            case 2:
                System.out.print("==    Nhập mã sản phẩm cần xóa: ");
                int maSP = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                sanPhamList.removeIf(sp -> sp.getMaSanPham() == maSP);
                break;
            case 3:
                System.out.print("==    Nhập số hóa đơn cần xóa: ");
                int soHD = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                hoaDonList.removeIf(hd -> hd.getSoHoaDon() == soHD);
                break;
            case 4:
                System.out.print("==    Nhập loại bánh xe cần xóa: ");
                String loaiBX = scanner.nextLine();
                banhXeList.removeIf(bx -> bx.getLoaiBanhXe().equalsIgnoreCase(loaiBX));
                break;
            case 5:
                System.out.print("==    Nhập loại động cơ cần xóa: ");
                String loaiDC = scanner.nextLine();
                dongCoList.removeIf(dc -> dc.getLoaiDongCo().equalsIgnoreCase(loaiDC));
                break;
            case 6:
                System.out.print("==    Nhập mã xe cần xóa: ");
                int maXe = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                xeHoiList.removeIf(xh -> xh.getId() == maXe);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }

        System.out.println("==   Dữ liệu sau khi xóa: ");
        xuatTatCaThongTin();
    
}

    private static void sapXepDuLieu(Scanner scanner) {
        System.out.println("==    Chọn loại dữ liệu cần sắp xếp:                 ==");
        System.out.println("==    1. Sắp xếp sinh viên theo tên                  ==");
        System.out.println("==    2. Sắp xếp sản phẩm theo mã sản phẩm           ==");
        System.out.println("==    3. Sắp xếp hóa đơn theo số hóa đơn             ==");
        System.out.println("==    4. Sắp xếp bánh xe theo bán kính               ==");
        System.out.println("==    5. Sắp xếp động cơ theo công suất              ==");
        System.out.println("==    6. Sắp xếp xe hơi theo mã xe                   ==");
        System.out.print("Chọn loại dữ liệu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        switch (choice) {
        case 1:
        	if (sinhVienList.size() < 3) {
                System.out.println("Danh sách sinh viên phải có ít nhất 3 sinh viên để sắp xếp.");
            } else {
                Collections.sort(sinhVienList, new SinhVienComparator());
                System.out.println("==   Danh sách sinh viên sau khi sắp xếp:            ==");
                for (SinhVien sv : sinhVienList) {
                    System.out.println(sv);
                }
            }
            break;
        		
            case 2:
                Collections.sort(sanPhamList, new SanPhamComparator());
                System.out.println("==   Danh sách sản phẩm sau khi sắp xếp:             ==");
                for (SanPham sp : sanPhamList) {
                    System.out.println(sp);
                }
                break;
            case 3:
                Collections.sort(hoaDonList, new HoaDonComparator());
                System.out.println("==   Danh sách hóa đơn sau khi sắp xếp:              ==");
                for (HoaDon hd : hoaDonList) {
                    System.out.println(hd);
                }
                break;
            case 4:
                Collections.sort(banhXeList, new BanhXeComparator());
                System.out.println("==   Danh sách bánh xe sau khi sắp xếp:              ==");
                for (BanhXe bx : banhXeList) {
                    System.out.println(bx);
                }
                break;
            case 5:
                Collections.sort(dongCoList, new DongCoComparator());
                System.out.println("==   Danh sách động cơ sau khi sắp xếp:              ==");
                for (DongCo dc : dongCoList) {
                    System.out.println(dc);
                }
                break;
            case 6:
            	if (xeHoiList.size() < 3) {
                    System.out.println("Danh sách xe hơi phải có ít nhất 3 xe để sắp xếp.");
                } else {
                    Collections.sort(xeHoiList, new XeHoiComparator());
                    System.out.println("==   Danh sách xe hơi sau khi sắp xếp:               ==");
                    for (XeHoi xh : xeHoiList) {
                        System.out.println(xh);
                    }
                }
                    
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
               
        }
    }
    private static void timKiemDuLieu(Scanner scanner) {
        System.out.println("==    Chọn loại dữ liệu cần tìm kiếm:               ==");
        System.out.println("==    1. Tìm kiếm sinh viên theo tên                ==");
        System.out.println("==    2. Tìm kiếm sản phẩm theo mã sản phẩm         ==");
        System.out.println("==    3. Tìm kiếm hóa đơn theo số hóa đơn           ==");
        System.out.println("==    4. Tìm kiếm bánh xe theo bán kính             ==");
        System.out.println("==    5. Tìm kiếm động cơ theo công suất            ==");
        System.out.println("==    6. Tìm kiếm xe hơi theo mã xe                 ==");
        System.out.print("Chọn loại dữ liệu: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự newline

        switch (choice) {
            case 1:
                System.out.print("Nhập tên sinh viên: ");
                String tenSinhVien = scanner.nextLine();
                sinhVienList.stream().filter(new SinhVienPredicate(tenSinhVien)).forEach(System.out::println);
                break;
            case 2:
                System.out.print("Nhập mã sản phẩm: ");
                int maSanPham = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                sanPhamList.stream().filter(new SanPhamPredicate(maSanPham)).forEach(System.out::println);
                break;
            case 3:
                System.out.print("Nhập số hóa đơn: ");
                int soHoaDon = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                hoaDonList.stream().filter(new HoaDonPredicate(soHoaDon)).forEach(System.out::println);
                break;
            case 4:
                System.out.print("Nhập bán kính bánh xe: ");
                double banKinh = scanner.nextDouble();
                scanner.nextLine(); // Đọc ký tự newline
                banhXeList.stream().filter(new BanhXePredicate(banKinh)).forEach(System.out::println);
                break;
            case 5:
                System.out.print("Nhập công suất động cơ: ");
                double congSuat = scanner.nextDouble();
                scanner.nextLine(); // Đọc ký tự newline
                dongCoList.stream().filter(new DongCoPredicate(congSuat)).forEach(System.out::println);
                break;
         
            case 6:
                System.out.print("Nhập mã xe: ");
                int maXe = scanner.nextInt();
                scanner.nextLine(); // Đọc ký tự newline
                xeHoiList.stream().filter(new XeHoiPredicate(maXe)).forEach(System.out::println);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ!");
        }
    }
    private static void xuatTatCaThongTin() {
        System.out.println("==            Thông tin tất cả sinh viên đã nhập:           ==");
        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
        System.out.println("==----------------------------------------------------------==");

        System.out.println("==            Thông tin tất cả sản phẩm đã nhập:            ==");
        for (SanPham sp : sanPhamList) {
            System.out.println(sp);
        }
        System.out.println("==----------------------------------------------------------==");

        System.out.println("==            Thông tin tất cả hóa đơn đã nhập:             ==");
        for (HoaDon hd : hoaDonList) {
            System.out.println(hd);
        }
        System.out.println("==----------------------------------------------------------==");

        System.out.println("==            Thông tin tất cả bánh xe đã nhập:             ==");
        for (BanhXe bx : banhXeList) {
            System.out.println(bx);
        }
        System.out.println("==----------------------------------------------------------==");

        System.out.println("==            Thông tin tất cả động cơ đã nhập:             ==");
        for (DongCo dc : dongCoList) {
            System.out.println(dc);
        }
        System.out.println("==----------------------------------------------------------==");

        System.out.println("==            Thông tin tất cả xe hơi đã nhập:              ==");
        for (XeHoi xh : xeHoiList) {
            System.out.println(xh);
        }
        System.out.println("==----------------------------------------------------------==");
    }

    private static void suDungDeepCloning() {
        if (sinhVienList.isEmpty() && sanPhamList.isEmpty()) {
            System.out.println("Danh sách sinh viên và sản phẩm trống! Vui lòng nhập thông tin trước khi sử dụng Deep Cloning.");
            System.out.println("------------------------------------------------------------------");
            return;
        }

        try {
            List<SinhVien> clonedSinhVienList = new ArrayList<>();
            for (SinhVien sv : sinhVienList) {
                clonedSinhVienList.add((SinhVien) sv.clone());
            }

            List<SanPham> clonedSanPhamList = new ArrayList<>();
            for (SanPham sp : sanPhamList) {
                clonedSanPhamList.add((SanPham) sp.clone());
            }

            List<HoaDon> clonedHoaDonList = new ArrayList<>();
            for (HoaDon hd : hoaDonList) {
                clonedHoaDonList.add((HoaDon) hd.clone());
            }

            List<BanhXe> clonedBanhXeList = new ArrayList<>();
            for (BanhXe bx : banhXeList) {
                clonedBanhXeList.add((BanhXe) bx.clone());
            }

            List<DongCo> clonedDongCoList = new ArrayList<>();
            for (DongCo dc : dongCoList) {
                clonedDongCoList.add((DongCo) dc.clone());
            }

            List<XeHoi> clonedXeHoiList = new ArrayList<>();
            for (XeHoi xh : xeHoiList) {
                clonedXeHoiList.add((XeHoi) xh.clone());
            }

            System.out.println("Danh sách sinh viên sao chép:");
            for (SinhVien sv : clonedSinhVienList) {
                System.out.println(sv);
            }
            System.out.println("------------------------------------------------------------------");

            System.out.println("Danh sách sản phẩm sao chép:");
            for (SanPham sp : clonedSanPhamList) {
                System.out.println(sp);
            }
            System.out.println("------------------------------------------------------------------");

            System.out.println("Danh sách hóa đơn sao chép:");
            for (HoaDon hd : clonedHoaDonList) {
                System.out.println(hd);
            }
            System.out.println("------------------------------------------------------------------");

            System.out.println("Danh sách bánh xe sao chép:");
            for (BanhXe bx : clonedBanhXeList) {
                System.out.println(bx);
            }
            System.out.println("------------------------------------------------------------------");

            System.out.println("Danh sách động cơ sao chép:");
            for (DongCo dc : clonedDongCoList) {
                System.out.println(dc);
            }
            System.out.println("------------------------------------------------------------------");

            System.out.println("Danh sách xe hơi sao chép:");
            for (XeHoi xh : clonedXeHoiList) {
                System.out.println(xh);
            }
            System.out.println("------------------------------------------------------------------");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}     


