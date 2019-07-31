package Model;

import View.Panel;

public class Calculations {
    private Panel panel;
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

        //System.out.println(""calc.make("3*4"));
        //calc.print();
        //System.out.println(calc.convertArrayToChar(calc.getOutput()));
        // calc.postflixConvertToBinaryTree();
    }

    public Calculations(Panel panel) {
        this.panel = panel;

    }

    public String resetI() {
        return " ";
    }
}
