package quanlyhocsinh.model;

public class LapTop extends SanPham {
    private int ram;
    private String cpu;

    public LapTop(int maSanPham, String tenSanPham, int soLuong, double giaCa, int ram, String cpu) {
        super(maSanPham, tenSanPham, soLuong, giaCa);
        this.ram = ram;
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "maSanPham=" + getMaSanPham() +
                ", tenSanPham='" + getTenSanPham() + '\'' +
                ", soLuong=" + getSoLuong() +
                ", giaCa=" + getGiaCa() +
                ", ram=" + ram +
                ", cpu='" + cpu + '\'' +
                '}';
    }
}
