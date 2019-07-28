package View.Buttons;


import Controller.ButtonEightAction;

import javax.swing.*;
import java.awt.*;

public class ButtonEight extends JButton {
    public ButtonEight() {
        super(new ButtonEightAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(85, 155);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}