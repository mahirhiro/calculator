package View.Buttons;


import Controller.ButtonZeroAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonZero extends JButton {
    public ButtonZero(Calculations calculations, Panel panel) {
        super(new ButtonZeroAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("0");
        setSize(115, 50);
        setLocation(20, 250);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
    }
}
