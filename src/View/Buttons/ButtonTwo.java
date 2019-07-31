package View.Buttons;

import Controller.ButtonTwoAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonTwo extends JButton {
    public ButtonTwo(Calculations calculations, Panel panel) {
        super(new ButtonTwoAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("2");
        setSize(50, 50);
        setLocation(85, 190);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }

}
