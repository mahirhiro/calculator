package View.Buttons;

import Controller.ButtonDivideAction;

import javax.swing.*;
import java.awt.*;

public class ButtonDivide extends JButton {
    public ButtonDivide() {
        super(new ButtonDivideAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Addition");
        setSize(50, 50);
        setLocation(215, 95);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}
