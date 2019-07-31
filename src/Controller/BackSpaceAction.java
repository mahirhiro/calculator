package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

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
        System.out.println("Backspace");
        panel.updateTextBoxAC();
    }
}
