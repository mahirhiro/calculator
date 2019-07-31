package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonEightAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;

    public ButtonEightAction(Calculations calculations, Panel panel) {
        super("8");
        this.calculations = calculations;
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Eight");
        calculations.setI(8);
        panel.stringCreater("8");
        panel.updateTextBox();
    }
}
