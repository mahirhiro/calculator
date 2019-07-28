package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonNineAction extends AbstractAction {
    public ButtonNineAction() {
        super("9");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Nine");
    }
}
