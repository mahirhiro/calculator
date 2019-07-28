package View.Buttons;

import Controller.ButtonACAction;

import javax.swing.*;
import java.awt.*;

public class ButtonAC extends JButton {
    public ButtonAC() {
        super(new ButtonACAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(115, 50);
        setLocation(20, 95);
        setFont(new Font("Helvetica", Font.PLAIN, 25));
        setForeground(Color.BLACK);
        setBackground(new Color(165, 165, 165));
    }
}
