package View.Buttons;

import Controller.ButtonACAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonAC extends JButton {

    public ButtonAC(Calculations calculations, Panel panel) {
        super(new ButtonACAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(115, 50);
        setLocation(20, 10);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.BLACK);
        setBackground(new Color(165, 165, 165));
    }
}
