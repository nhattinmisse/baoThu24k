package quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;
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

public class QuanLySinhVien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// Nhập - Xuất dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên sinh viên: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        String tenLop = scanner.nextLine();
        LopHoc lopHoc = new LopHoc(tenLop);
        SinhVien sinhVien = new SinhVien(hoTen, lopHoc);

        // Thêm SinhVien vào LopHoc
        lopHoc.addSinhVien(sinhVien);

        // Xuất SinhVien
        System.out.println("Thông tin sinh viên: " + sinhVien);

        // Sắp xếp dữ liệu
        List<SinhVien> sinhVienList = new ArrayList<>();
        sinhVienList.add(new SinhVien("Nguyen Van Tai", new LopHoc("Lop IT")));
        sinhVienList.add(new SinhVien("Nguyen Van Bao", new LopHoc("Lop CN")));
        Collections.sort(sinhVienList, new SinhVienNameComparator());
        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }

        // Tìm kiếm dữ liệu
        Predicate<SinhVien> byName = sv -> sv.getHoTen().equals("Nguyen Van Tai");
        List<SinhVien> result = sinhVienList.stream().filter(byName).collect(Collectors.toList());
        for (SinhVien sv : result) {
            System.out.println(sv);
        }

        // Sử dụng kỹ thuật Deep Cloning
        try {
            SinhVien clonedSinhVien = (SinhVien) sinhVien.clone();
            System.out.println("Cloned SinhVien: " + clonedSinhVien);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

