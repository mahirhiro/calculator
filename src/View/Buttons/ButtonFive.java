package View.Buttons;


import Controller.ButtonFiveAction;
import Controller.ButtonFourAction;
import View.Panel;
import javax.swing.*;
import java.awt.*;

public class ButtonFive extends JButton {
    public ButtonFive(Panel panel) {
        super(new ButtonFiveAction(panel));
        setButtonProperties();
    }

    private void setButtonProperties() {
        setVerticalTextPosition(AbstractButton.CENTER);
        setHorizontalTextPosition(AbstractButton.CENTER);
        setSize(50, 50);
        setLocation(85, 130);
        setFont(new Font("Helvetica", Font.PLAIN, 30));
        setForeground(Color.WHITE);
        setBackground(new Color(51, 51, 51));
    }
}
