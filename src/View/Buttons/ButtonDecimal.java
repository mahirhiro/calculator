package View.Buttons;

import Controller.ButtonDecimalAction;

import javax.swing.*;
import java.awt.*;

public class ButtonDecimal extends JButton {
    public ButtonDecimal() {
        super(new ButtonDecimalAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 250);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
    }
}
