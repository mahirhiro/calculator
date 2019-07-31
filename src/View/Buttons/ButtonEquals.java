package View.Buttons;


import Controller.ButtonEqualsAction;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonEquals extends JButton {
    public ButtonEquals(Panel panel) {
        super(new ButtonEqualsAction(panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Addition");
        setSize(50, 50);
        setLocation(215, 250);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}
