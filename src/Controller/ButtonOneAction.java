package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonOneAction extends AbstractAction {

    private Panel panel;
    private Calculations calculations;

    public ButtonOneAction(Calculations calculations, Panel panel) {
        super("1");
        this.calculations = calculations;
        this.panel = panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("One");
        calculations.setI(1);
        panel.stringBuilder("1");
        panel.updateTextBox();
    }
}
