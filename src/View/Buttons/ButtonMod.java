package View.Buttons;


import Controller.ButtonModAction;

import javax.swing.*;
import java.awt.*;

public class ButtonMod extends JButton {
    public ButtonMod() {
        super(new ButtonModAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 95);
        setFont(new Font("Helvetica", Font.PLAIN, 25));
        setForeground(Color.BLACK);
        setBackground(new Color(165, 165, 165));
        setLayout(null);
    }
}
