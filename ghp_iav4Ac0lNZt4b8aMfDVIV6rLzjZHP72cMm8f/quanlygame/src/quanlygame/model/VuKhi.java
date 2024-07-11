package quanlygame.model;

public abstract class VuKhi implements Cloneable{
	private double suctancong;
    public abstract double tinhSucTanCong();   

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
    

}
