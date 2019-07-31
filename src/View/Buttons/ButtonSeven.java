package View.Buttons;

import Controller.ButtonSevenAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonSeven extends JButton {
    public ButtonSeven(Calculations calculations, Panel panel) {
        super(new ButtonSevenAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("7");
        setSize(50, 50);
        setLocation(20, 70);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
