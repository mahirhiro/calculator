package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonThreeAction extends AbstractAction {
    public ButtonThreeAction() {
        super("3");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Three");
    }
}
