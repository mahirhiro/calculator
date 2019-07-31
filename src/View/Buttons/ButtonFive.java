package View.Buttons;


import Controller.ButtonFiveAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonFive extends JButton {
    public ButtonFive(Calculations calculations, Panel panel) {
        super(new ButtonFiveAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("5");
        setSize(50, 50);
        setLocation(85, 130);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
