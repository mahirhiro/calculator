package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonACAction extends AbstractAction {
    private Panel panel;
    public ButtonACAction(Panel panel) {
        super("AC");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clear");
        panel.getTextField().setText(" ");

    }
}
