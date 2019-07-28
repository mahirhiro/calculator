package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonOneAction extends AbstractAction {
    public ButtonOneAction() {
        super("1");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("One");
    }
}
