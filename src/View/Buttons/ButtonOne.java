package View.Buttons;

import Controller.ButtonOneAction;

import javax.swing.*;
import java.awt.*;

public class ButtonOne extends JButton {
    public ButtonOne() {
        super(new ButtonOneAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(20, 275);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
