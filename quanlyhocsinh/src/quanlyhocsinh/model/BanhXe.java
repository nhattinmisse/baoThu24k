package quanlyhocsinh.model;

public class BanhXe implements Cloneable{
	private String loaiBanhXe;
    private double banKinh;

    public BanhXe(String loaiBanhXe, double banKinh) {
        this.loaiBanhXe = loaiBanhXe;
        this.banKinh = banKinh;
    }

    public String getLoaiBanhXe() {
        return loaiBanhXe;
    }

    public void setLoaiBanhXe(String loaiBanhXe) {
        this.loaiBanhXe = loaiBanhXe;
    }

    public BanhXe(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }
    
    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "BanhXe{" + "loaiBanhXe='" + loaiBanhXe + '\'' + ", banKinh=" + banKinh + '}';
    }
}
