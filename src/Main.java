import Model.Calculations;
import View.Frame;

import javax.swing.*;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        Calculations c = new Calculations();
        new Frame(c);
    }
}
