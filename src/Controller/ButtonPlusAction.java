package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonPlusAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonPlusAction(Calculations calculations, Panel panel) {
        super("+");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Plus");
        panel.stringCreater("+");
        calculations.symbolAcceptor("+");
        panel.updateTextBoxSymbols();
    }
}
