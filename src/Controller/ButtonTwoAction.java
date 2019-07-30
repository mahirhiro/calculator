package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonTwoAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonTwoAction(Calculations calculations, Panel panel) {
        super("2");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Two");
        calculations.setI(2);
        panel.updateTextBox();
    }
}
