package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonTwoAction extends AbstractAction {
    public ButtonTwoAction() {
        super("2");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Two");
    }
}
