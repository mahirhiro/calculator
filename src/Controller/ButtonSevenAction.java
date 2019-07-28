package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonSevenAction extends AbstractAction {
    public ButtonSevenAction() {
        super("7");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Seven");
    }
}
