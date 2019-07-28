package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFiveAction extends AbstractAction {
    public ButtonFiveAction() {
        super("5");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Five");
    }
}
