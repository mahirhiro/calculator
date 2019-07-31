package Model;

public class Calculations {

    public Expressions calc = new Expressions();
    private String s;
    private int i;

    public Calculations() {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void symbolAcceptor(String s) {
        this.s = s;
    }

    public String getSymbolAcceptor() {
        return s;
    }

}
