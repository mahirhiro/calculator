package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFourAction extends AbstractAction {
    public ButtonFourAction() {
        super("4");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Four");
    }
}
