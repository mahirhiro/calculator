package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonACAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonACAction(Calculations calculations, Panel panel) {
        super("AC");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Clear");
        calculations.resetI();
        panel.clearTextBox();
    }
}
