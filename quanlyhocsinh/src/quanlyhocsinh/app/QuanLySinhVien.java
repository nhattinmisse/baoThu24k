package quanlyhocsinh.app;



import java.util.*;

import quanlyhocsinh.model.BanhXe;
import quanlyhocsinh.model.DongCo;
import quanlyhocsinh.model.HoaDon;
import quanlyhocsinh.model.LapTop;
import quanlyhocsinh.model.LopHoc;
import quanlyhocsinh.model.SanPham;
import quanlyhocsinh.model.SinhVien;
import quanlyhocsinh.model.SinhVienNameComparator;
import quanlyhocsinh.model.XeHoi;
import quanlyhocsinh.model.DBConnection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class QuanLySinhVien {

	private static List<SinhVien> sinhVienList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===============================================");
            System.out.println("==      CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN        ==");
            System.out.println("==    1. Nhập – Xuất dữ liệu từ bàn phím     ==");
            System.out.println("==    2. Sắp xếp dữ liệu                     ==");
            System.out.println("==    3. Tìm kiếm dữ liệu                    ==");
            System.out.println("==    4. Sử dụng kỹ thuật Deep Cloning       ==");
            System.out.println("==    5. Thoát                               ==");
            System.out.println("===============================================");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Đọc ký tự newline

            switch (choice) {
                case 1:
                    nhapXuatDuLieu(scanner);
                    break;
                case 2:
                    sapXepDuLieu();
                    break;
                case 3:
                    timKiemDuLieu(scanner);
                    break;
                case 4:
                    suDungDeepCloning();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    private static void nhapXuatDuLieu(Scanner scanner) {
        List<SinhVien> tempSinhVienList = new ArrayList<>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("==   Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("==   Nhập tên sinh viên:");
            String hoTen = scanner.nextLine();
            System.out.print("==   Nhập tên lớp:");
            String tenLop = scanner.nextLine();
            LopHoc lopHoc = new LopHoc(tenLop);
            SinhVien sinhVien = new SinhVien(hoTen, lopHoc);
            tempSinhVienList.add(sinhVien);
        }

        sinhVienList.addAll(tempSinhVienList);

        System.out.println("==            Thông tin 5 sinh viên vừa nhập:           ==");
        for (SinhVien sv : tempSinhVienList) {
            System.out.println(sv);
        }
        System.out.println("==------------------------------------------------------==");
    }

    private static void sapXepDuLieu() {
        if (sinhVienList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống! Vui lòng nhập thông tin trước khi sắp xếp.");
            System.out.println("------------------------------------------------------------------");
            return;
        }

        Collections.sort(sinhVienList, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return sv1.getHoTen().compareTo(sv2.getHoTen());
            }
        });

        System.out.println("Danh sách sinh viên sau khi sắp xếp theo tên:");
        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
        System.out.println("------------------------------------------------------------------");
    }

    private static void timKiemDuLieu(Scanner scanner) {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();
        Predicate<SinhVien> byName = sv -> sv.getHoTen().equals(name);
        List<SinhVien> result = sinhVienList.stream().filter(byName).collect(Collectors.toList());
        if (result.isEmpty()) {
            System.out.println("Không tìm thấy sinh viên với tên: " + name);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (SinhVien sv : result) {
                System.out.println(sv);
            }
        }
        System.out.println("------------------------------------------------------------------");
    }

    private static void suDungDeepCloning() {
        if (sinhVienList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống! Vui lòng nhập thông tin trước khi sử dụng Deep Cloning.");
            System.out.println("------------------------------------------------------------------");
            return;
        }

        try {
            List<SinhVien> clonedList = new ArrayList<>();
            for (SinhVien sv : sinhVienList) {
                clonedList.add((SinhVien) sv.clone());
            }

            System.out.println("Danh sách sinh viên sao chép:");
            for (SinhVien sv : clonedList) {
                System.out.println(sv);
            }
            System.out.println("------------------------------------------------------------------");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}