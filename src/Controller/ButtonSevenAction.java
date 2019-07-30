package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonSevenAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonSevenAction(Calculations calculations, Panel panel) {
        super("7");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Seven");
        calculations.setI(7);
        panel.updateTextBox();
    }
}
