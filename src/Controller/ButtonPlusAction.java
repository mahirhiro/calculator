package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPlusAction extends AbstractAction {
    public ButtonPlusAction() {
        super("+");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Plus");
    }
}
