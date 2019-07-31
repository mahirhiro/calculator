package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonThreeAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonThreeAction(Calculations calculations, Panel panel) {
        super("3");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Three");
        calculations.setI(3);
        panel.stringBuilder("3");
        panel.updateTextBox();
    }
}
