package View.Buttons;

import Controller.ButtonACAction;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonAC extends JButton {
    public ButtonAC(Panel panel) {
        super(new ButtonACAction(panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(115, 50);
        setLocation(20, 10);
        setFont(new Font("Helvetica", Font.PLAIN, 25));
        setForeground(Color.BLACK);
        setBackground(new Color(165, 165, 165));
    }
}
