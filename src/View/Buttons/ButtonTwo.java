package View.Buttons;


import Controller.ButtonTwoAction;

import javax.swing.*;
import java.awt.*;

public class ButtonTwo extends JButton {
    public ButtonTwo() {
        super(new ButtonTwoAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Button Two");
        setSize(50, 50);
        setLocation(85, 190);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }

}
