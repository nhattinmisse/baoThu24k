package quanlygame.model;

public class NhanVat {
	private String ten;
    private int capdo;
    private double sucmanh; 

    public NhanVat(String ten, int capdo, double sucmanh) {
        this.ten = ten;
        this.capdo = capdo;
        this.sucmanh = sucmanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getCapdo() {
        return capdo;
    }

    public void setCapdo(int capdo) {
        this.capdo = capdo;
    }

    public double getSucmanh() {
        return sucmanh;
    }

    public void setSucmanh(double sucmanh) {
        this.sucmanh = sucmanh;
    }
    
    public void hanhdong(){
        System.out.println("su dung nhan vat nay");
    }
    
    public void sucmanh(){
        System.out.println("chien luc nhan vat");
    }
    
    @Override
    public String toString() {
        return "NhanVat{" + "ten=" + ten + ", capdo=" + capdo + ", sucmanh=" + sucmanh + '}';
    }
}
