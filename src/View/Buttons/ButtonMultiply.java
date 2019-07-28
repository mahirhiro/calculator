package View.Buttons;

import Controller.ButtonMultiplyAction;

import javax.swing.*;
import java.awt.*;

public class ButtonMultiply extends JButton {
    public ButtonMultiply() {
        super(new ButtonMultiplyAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(215, 155);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}