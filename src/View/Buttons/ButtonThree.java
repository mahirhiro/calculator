package View.Buttons;

import Controller.ButtonThreeAction;

import javax.swing.*;
import java.awt.*;

public class ButtonThree extends JButton {
    public ButtonThree() {
        super(new ButtonThreeAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Button Three");
        setSize(50, 50);
        setLocation(150, 275);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
