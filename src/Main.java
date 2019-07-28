import View.Frame;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, UnsupportedLookAndFeelException, InstantiationException {
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        new Frame();
    }
}
