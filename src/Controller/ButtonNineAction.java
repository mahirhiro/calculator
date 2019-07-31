package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonNineAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonNineAction(Calculations calculations, Panel panel) {
        super("9");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Nine");
        calculations.setI(9);
        panel.stringBuilder("9");
        panel.updateTextBox();
    }
}
