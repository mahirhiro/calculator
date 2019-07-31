package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonSixAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonSixAction(Calculations calculations, Panel panel) {
        super("6");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Six");
        calculations.setI(6);
        panel.stringCreater("6");
        panel.updateTextBox();
    }
}
