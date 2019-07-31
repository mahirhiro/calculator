package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDivideAction extends AbstractAction {
    private Panel panel;

    public ButtonDivideAction(Panel panel) {
        super("÷");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Divide");
        panel.stringCreater("/");

    }
}
