package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonBackspaceAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonBackspaceAction(Calculations calculations, Panel panel) {
        super("⌫");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Backspace");
        panel.updateTextBoxAC();
    }
}
