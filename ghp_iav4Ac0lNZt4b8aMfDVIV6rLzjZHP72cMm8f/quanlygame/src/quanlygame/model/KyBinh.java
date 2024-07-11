package quanlygame.model;

import java.util.List;

public class KyBinh  extends NhanVat{
    private boolean kiem;
    private boolean giap;
    private boolean ngua;
    private List<BinhDoan> dsbd;

    public KyBinh(boolean kiem, boolean giap, boolean ngua, String ten, int capdo, double sucmanh) {
        super(ten, capdo, sucmanh);
        this.kiem = kiem;
        this.giap = giap;
        this.ngua = ngua;
    }

    public boolean isKiem() {
        return kiem;
    }

    public void setKiem(boolean kiem) {
        this.kiem = kiem;
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    public boolean isNgua() {
        return ngua;
    }

    public void setNgua(boolean ngua) {
        this.ngua = ngua;
    }
    
      public void addBinhDoan(BinhDoan bd) throws CloneNotSupportedException {
        this.dsbd.add((BinhDoan) bd.clone());
    }

    @Override
    public void hanhdong() {
        if(kiem==true){
            System.out.println("ky binh su dung kiem");
        }else{
            System.out.println("ky binh su dung khien");
        }
    }

    @Override
    public void sucmanh() {
        double chienluc = this.getSucmanh()*this.getCapdo();
        System.out.println("chien lcu cua nhan vat"+chienluc);
    }

    
    
    
    
    
   
    

}
