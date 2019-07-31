package View.Buttons;

import Controller.ButtonDivideAction;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonDivide extends JButton {
    public ButtonDivide(Panel panel) {
        super(new ButtonDivideAction(panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Addition");
        setSize(50, 50);
        setLocation(215, 10);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}
