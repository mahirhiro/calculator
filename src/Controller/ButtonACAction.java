package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonACAction extends AbstractAction {
    public ButtonACAction() {
        super("AC");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clear");
    }
}
