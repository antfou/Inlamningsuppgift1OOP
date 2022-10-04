package Inlämning1;

public abstract class Växt implements VäxtNäring{
    private double höjd; //Allt är private med för inkapsling
    private String namn;
    private double mängdNäring;
    private EnumNäring växtNäring;
    protected
    Växt(double höjd, String namn){
        this.höjd = höjd;
        this.namn = namn;
    }

    public void setVäxtNäring(EnumNäring växtNäring) {
        this.växtNäring = växtNäring;
    } //Eftersom att jag inkapslat med private måste jag använda getters och setters

    public void setMängdNäring(double mängdNäring) {
        this.mängdNäring = mängdNäring;
    }

    public double getHöjd() {
        return höjd;
    }

    public double getMängdNäring() {
        return mängdNäring;
    }

    public EnumNäring getVäxtNäring() {
        return växtNäring;
    }

    @Override
    public String getNäring() {
        return namn + " behöver " + mängdNäring + " liter ";
    }

    @Override
    public void beräknaNäring() {}

    public String getNamn() {return namn;}
}