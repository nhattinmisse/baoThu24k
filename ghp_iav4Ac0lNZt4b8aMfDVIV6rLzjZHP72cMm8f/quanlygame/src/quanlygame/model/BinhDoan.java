package quanlygame.model;

public class BinhDoan implements Cloneable{
	private int mabinhdoan;
    private boolean giap;

    public BinhDoan(int mabinhdoan, boolean giap) {
        this.mabinhdoan = mabinhdoan;
        this.giap = giap;
    }

    public int getMabinhdoan() {
        return mabinhdoan;
    }

    public void setMabinhdoan(int mabinhdoan) {
        this.mabinhdoan = mabinhdoan;
    }

    public boolean isGiap() {
        return giap;
    }

    public void setGiap(boolean giap) {
        this.giap = giap;
    }

    @Override
    public String toString() {
        return "BinhDoan{" + "mabinhdoan=" + mabinhdoan + ", giap=" + giap + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }    
}
