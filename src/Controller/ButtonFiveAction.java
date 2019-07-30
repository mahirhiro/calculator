package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFiveAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonFiveAction(Calculations calculations, Panel panel) {
        super("5");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Five");
        calculations.setI(5);
        panel.updateTextBox();
    }
}
