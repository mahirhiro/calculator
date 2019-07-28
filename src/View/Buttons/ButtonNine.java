package View.Buttons;


import Controller.ButtonNineAction;

import javax.swing.*;
import java.awt.*;

public class ButtonNine extends JButton {
    public ButtonNine() {
        super(new ButtonNineAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 155);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}