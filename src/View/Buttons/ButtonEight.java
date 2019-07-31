package View.Buttons;


import Controller.ButtonEightAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonEight extends JButton {
    public ButtonEight(Calculations calculations, Panel panel) {
        super(new ButtonEightAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("8");
        setSize(50, 50);
        setLocation(85, 70);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}