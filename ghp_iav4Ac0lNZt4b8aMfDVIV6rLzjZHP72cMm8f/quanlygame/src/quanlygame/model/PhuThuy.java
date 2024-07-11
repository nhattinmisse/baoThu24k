package quanlygame.model;

public class PhuThuy  extends NhanVat{
    private boolean gayphep;
    private boolean giap;

    public PhuThuy(boolean gayphep, boolean giap, String ten, int capdo, double sucmanh, Choi choi) {
        super(ten, capdo, sucmanh);
        this.gayphep = gayphep;
        this.giap = giap;
    }

    public boolean isGayphep() {
        return gayphep;
    }

    public void setGayphep(boolean gayphep) {
        this.gayphep = gayphep;
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    @Override
    public void sucmanh() {
       double chienluc = this.getCapdo()*this.getSucmanh();
        System.out.println("chien luc cua phu thuy la"+chienluc);
    }

    @Override
    public void hanhdong() {
       if(gayphep==true){
           System.out.println("phu thuy su dung gay");
       }else{
           System.out.println("phu thuy su dung co bap");
       }
    }
    

}
