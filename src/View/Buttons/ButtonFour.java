package View.Buttons;

import Controller.ButtonFourAction;

import javax.swing.*;
import java.awt.*;

public class ButtonFour extends JButton {
    public ButtonFour() {
        super(new ButtonFourAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(20, 215);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
