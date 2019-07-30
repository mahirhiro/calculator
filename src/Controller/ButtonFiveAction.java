package Controller;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import View.Panel;

public class ButtonFiveAction extends AbstractAction {
    private Panel panel;
    public ButtonFiveAction(Panel panel) {
        super("5");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Five");
        panel.getTextField().setText(panel.getTextField().getText()+5);
    }
}
