package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDivideAction extends AbstractAction {
    public ButtonDivideAction() {
        super("÷");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Divide");
    }
}
