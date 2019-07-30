package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

public class BackSpaceAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public BackSpaceAction(Calculations calculations, Panel panel) {
        super("<--");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String length =  panel.getTextField().getText();
        System.out.println("Value is : " + length);
        //calculations.resetI();

    }
}
