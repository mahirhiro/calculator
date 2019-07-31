package Model;

public class Calculations {

    public Expressions calc = new Expressions();
    private String s;
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Calculations() {

    }

    public String resetI() {
        return " ";
    }

    public void symbolAcceptor(String s) {
        this.s = s;
    }

    public String getSymbolAcceptor() {
        return s;
    }

}
