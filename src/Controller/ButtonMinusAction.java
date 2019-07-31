package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonMinusAction extends AbstractAction {
    private Panel panel;

    public ButtonMinusAction(Panel panel) {
        super("-");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Minus");
        panel.stringCreater("-");
    }
}
