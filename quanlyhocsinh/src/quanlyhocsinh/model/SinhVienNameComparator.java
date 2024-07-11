package quanlyhocsinh.model;

import java.util.Comparator;

public class SinhVienNameComparator implements Comparator<SinhVien> {

	@Override
	public int compare(SinhVien sv1, SinhVien sv2) {
		// TODO Auto-generated method stub
		return sv1.getHoTen().compareTo(sv2.getHoTen());
	}

}
