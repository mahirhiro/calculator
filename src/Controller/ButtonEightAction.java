package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonEightAction extends AbstractAction {
    public ButtonEightAction() {
        super("8");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Eight");
    }
}
