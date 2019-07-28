package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonSixAction extends AbstractAction {
    public ButtonSixAction() {
        super("6");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Six");
    }
}
