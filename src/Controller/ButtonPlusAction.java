package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPlusAction extends AbstractAction {
    private Panel panel;

    public ButtonPlusAction(Panel panel) {
        super("+");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Plus");
        panel.getTextField().setText("");
        panel.stringCreater("+");
    }
}
