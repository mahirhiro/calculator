package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFourAction extends AbstractAction {
    private Panel panel;
    public ButtonFourAction(Panel panel) {
        super("4");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Four");
        panel.getTextField().setText(panel.getTextField().getText()+4);
    }
}
