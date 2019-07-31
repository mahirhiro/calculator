package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonMultiplyAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonMultiplyAction(Calculations calculations, Panel panel) {
        super("×");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Multiplication");
        panel.stringCreater("*");
    }
}
