package View.Buttons;

import Controller.ButtonBackspaceAction;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonBackspace extends JButton {

    public ButtonBackspace(Panel panel) {
        super(new ButtonBackspaceAction(panel));
    setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setToolTipText("Backspace");
        setSize(50, 50);
        setLocation(150, 10);
        //setBounds(150,10,100,100);
        setFont(new Font("Helvetica", Font.PLAIN, 20));
        setForeground(Color.BLACK);

        setBackground(new Color(165, 165, 165));
    }
}
