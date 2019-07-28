package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDecimalAction extends AbstractAction {
    public ButtonDecimalAction() {
        super(",");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Decimal");
    }
}
