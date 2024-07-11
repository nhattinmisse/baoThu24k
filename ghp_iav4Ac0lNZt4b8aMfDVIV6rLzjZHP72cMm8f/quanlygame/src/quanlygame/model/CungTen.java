package quanlygame.model;

public class CungTen extends VuKhi {
    private double congvatly;
    private double tamban;

    public CungTen(double congvatly, double tamban) {
        this.congvatly = congvatly;
        this.tamban = tamban;
    }

    public double getCongvatly() {
        return congvatly;
    }

    public void setCongvatly(double congvatly) {
        this.congvatly = congvatly;
    }

    public double getTamban() {
        return tamban;
    }

    public void setTamban(double tamban) {
        this.tamban = tamban;
    }

    @Override
    public String toString() {
        return "CungTen{" + "congvatly=" + congvatly + ", tamban=" + tamban + '}';
    }

    @Override
    public double tinhSucTanCong() {
        return this.congvatly*this.tamban;
    }
    
    
   
    
    
    
    

	
}
