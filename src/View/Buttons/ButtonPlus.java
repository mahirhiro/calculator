package View.Buttons;

import Controller.ButtonPlusAction;

import javax.swing.*;
import java.awt.*;

public class ButtonPlus extends JButton {
    public ButtonPlus() {
        super(new ButtonPlusAction());
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Addition");
        setSize(50, 50);
        setLocation(215, 275);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(240, 154, 55));
    }
}
