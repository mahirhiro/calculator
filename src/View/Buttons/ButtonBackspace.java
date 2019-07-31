package View.Buttons;

import Controller.ButtonBackspaceAction;
import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.*;

public class ButtonBackspace extends JButton {

    public ButtonBackspace(Calculations calculations, Panel panel) {
        super(new ButtonBackspaceAction(calculations, panel));
    setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(150, 10);
        //setBounds(150,10,100,100);
        setFont(new Font("Helvetica", Font.PLAIN, 20));
        setForeground(Color.BLACK);

        setBackground(new Color(165, 165, 165));
    }
}
