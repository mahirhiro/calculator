package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonEqualsAction extends AbstractAction {
    private Panel panel;

    public ButtonEqualsAction(Panel panel) {
        super("=");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Equals");
        panel.stringCreater("=");
        //System.out.println("Output"+panel.getsT());
    }
}
