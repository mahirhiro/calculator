package View.Buttons;


import Controller.ButtonSixAction;

import javax.swing.*;
import java.awt.*;

public class ButtonSix extends JButton {
    public ButtonSix() {
        super(new ButtonSixAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 130);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}