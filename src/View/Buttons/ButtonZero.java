package View.Buttons;


import Controller.ButtonZeroAction;

import javax.swing.*;
import java.awt.*;

public class ButtonZero extends JButton {
    public ButtonZero() {
        super(new ButtonZeroAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(115, 50);
        setLocation(20, 250);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
    }
}
