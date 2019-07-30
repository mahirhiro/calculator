package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonZeroAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonZeroAction(Calculations calculations, Panel panel) {
        super("0");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Zero");
        calculations.setI(0);
        panel.updateTextBox();
    }
}
