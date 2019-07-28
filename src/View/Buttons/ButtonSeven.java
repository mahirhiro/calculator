package View.Buttons;

import Controller.ButtonSevenAction;

import javax.swing.*;
import java.awt.*;

public class ButtonSeven extends JButton {
    public ButtonSeven() {
        super(new ButtonSevenAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(20, 155);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
