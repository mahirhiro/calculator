package View.Buttons;

import Controller.ButtonMinusAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonMinus extends JButton {
    public ButtonMinus(Calculations calculations, Panel panel) {
        super(new ButtonMinusAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Subtraction");
        setSize(50, 50);
        setLocation(215, 130);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}