package quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham implements Cloneable {
	private int maXe;
	private String tenXe;
	private int namSanXuat;
	  private DongCo dongCo;
	    private List<BanhXe> dsbx;
	    private double giaXe;

	    

		public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongCo, List<BanhXe> dsbx, int maXe, String tenXe, int namSanXuat, double giaXe) {
			super(maSanPham, tenSanPham, soLuong, giaCa);
			this.maXe = maXe;
			this.tenXe = tenXe;
			this.namSanXuat = namSanXuat;
			this.dongCo = dongCo;
			this.dsbx = dsbx;
			this.giaXe = giaXe;
		}

		
	    
	    public DongCo getDongCo() {
			return dongCo;
		}



		public void setDongCo(DongCo dongCo) {
			this.dongCo = dongCo;
		}



		public List<BanhXe> getDsbx() {
			return dsbx;
		}



		public void setDsbx(List<BanhXe> dsbx) {
			this.dsbx = dsbx;
		}



		public double getGiaXe() {
			return giaXe;
		}



		public void setGiaXe(double giaXe) {
			this.giaXe = giaXe;
		}



		public void setMaXe(int maXe) {
			this.maXe = maXe;
		}



		public void setTenXe(String tenXe) {
			this.tenXe = tenXe;
		}



		public void setNamSanXuat(int namSanXuat) {
			this.namSanXuat = namSanXuat;
		}



		@Override
	    public Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	   
	    @Override
		public String toString() {
			return "XeHoi [maXe=" + maXe + ", tenXe=" + tenXe + ", namSanXuat=" + namSanXuat + ", dongCo=" + dongCo
					+ ", dsbx=" + dsbx + ", giaXe=" + giaXe + "]";
		}


		
	public int getMaXe() {
		// TODO Auto-generated method stub
		return maXe;
	}

	public String getTenXe() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getNamSanXuat() {
		// TODO Auto-generated method stub
		return null;
	}

	public BanhXe[] getDanhSachBanhXe() {
		// TODO Auto-generated method stub
		return null;
	}



	


	public int getId() {
		// TODO Auto-generated method stub
		return 0;
	}

	

    
}
