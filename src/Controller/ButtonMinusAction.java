package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonMinusAction extends AbstractAction {
    public ButtonMinusAction() {
        super("-");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Minus");
    }
}
