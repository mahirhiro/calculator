package Model;

import View.Panel;

public class Calculations {
    private Panel panel;

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public Calculations() {

    }

    public Calculations(Panel panel) {
        this.panel = panel;

    }

    public String resetI() {
        return " ";
    }
}
