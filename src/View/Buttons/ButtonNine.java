package View.Buttons;


import Controller.ButtonNineAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonNine extends JButton {
    public ButtonNine(Calculations calculations, Panel panel) {
        super(new ButtonNineAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("9");
        setSize(50, 50);
        setLocation(150, 70);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}