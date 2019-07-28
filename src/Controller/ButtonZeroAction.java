package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonZeroAction extends AbstractAction {
    public ButtonZeroAction() {
        super("0");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Zero");
    }
}
