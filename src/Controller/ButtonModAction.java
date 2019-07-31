package Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonModAction extends AbstractAction {
    public ButtonModAction() {
        super("%");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Mod");

    }
}
