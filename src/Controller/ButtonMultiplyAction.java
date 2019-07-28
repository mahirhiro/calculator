package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonMultiplyAction extends AbstractAction {
    public ButtonMultiplyAction() {
        super("×");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Multiplication");
    }
}
