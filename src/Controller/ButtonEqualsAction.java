package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonEqualsAction extends AbstractAction {
    public ButtonEqualsAction() {
        super("=");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Equals");
    }
}
