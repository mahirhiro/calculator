package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonDecimalAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonDecimalAction(Calculations calculations, Panel panel) {
        super(",");
        this.calculations = calculations;
        this.panel = panel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Decimal");
        calculations.symbolAcceptor(".");
        panel.updateTextBoxSymbols();
        panel.stringCreater(".");
    }
}
