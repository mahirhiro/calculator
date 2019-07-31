package View.Buttons;

import Controller.BackSpaceAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class BackSpace extends JButton {

    public BackSpace(Calculations calculations, Panel panel) {
    super(new BackSpaceAction(calculations, panel));
    setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(85, 10);
        setFont(new Font("Helvetica", Font.PLAIN, 15));
        setForeground(Color.BLACK);
        setBackground(new Color(165, 165, 165));
    }
}
