package View.Buttons;

import Controller.ButtonPlusAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonPlus extends JButton {
    public ButtonPlus(Calculations calculations, Panel panel) {
        super(new ButtonPlusAction(calculations, panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Addition");
        setSize(50, 50);
        setLocation(215, 190);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}
