package Controller;

import Model.Calculations;
import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonFourAction extends AbstractAction {
    private Panel panel;
    private Calculations calculations;
    public ButtonFourAction(Calculations calculations, Panel panel) {
        super("4");
        this.panel = panel;
        this.calculations = calculations;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Four");
        calculations.setI(4);
        panel.stringCreater("4");
        panel.updateTextBox();

    }

}
