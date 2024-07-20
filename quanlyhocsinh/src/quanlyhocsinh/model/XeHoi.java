package quanlyhocsinh.model;

import java.util.ArrayList;
import java.util.List;

public class XeHoi extends SanPham implements Cloneable {
    private DongCo dongCo;
    private List<BanhXe> dsbx;
    private double giaXe;

    public XeHoi(int maSanPham, String tenSanPham, int soLuong, double giaCa, DongCo dongCo, List<BanhXe> banhXeList) {
        super(maSanPham, tenSanPham, soLuong, giaCa);
        this.dongCo = dongCo;
    }

	public DongCo getDongCo() {
        return dongCo;
    }

    public void setDongCo(DongCo dongCo) {
        this.dongCo = dongCo;
    }

    public List<BanhXe> getDsBanhXe() {
		return getDsBanhXe();
    }

    public void setDsbx(List<BanhXe> dsbx) {
        this.dsbx = dsbx;
    }
   

    public double getGiaXe() {
        return giaXe;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "XeHoi{" +
                "maSanPham=" + getMaSanPham() +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", soLuong=" + getSoLuong() +
                ", giaCa=" + getGiaCa() +
                ", dongCo=" + dongCo +
                ", dsbx=" + dsbx +
                '}';
    }

	public String getMaXe() {
		// TODO Auto-generated method stub
		return null;
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

	

    
}
