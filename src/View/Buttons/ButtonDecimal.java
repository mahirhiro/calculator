package View.Buttons;

import Controller.ButtonDecimalAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonDecimal extends JButton {
    public ButtonDecimal(Calculations calculations, Panel panel) {
        super(new ButtonDecimalAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 250);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(Color.DARK_GRAY);
    }
}
