package quanlyhocsinh.model;

import java.util.List;

public class XeHoi extends SanPham {
	private DongCo dongCo;
    private List<BanhXe> dsbx;

    public XeHoi(DongCo dongCo) {
        this.dongCo = dongCo;
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

    @Override
    public String toString() {
        return "XeHoi{" + "dongCo=" + dongCo + ", dsbx=" + dsbx + '}';
    }
	
	
}
