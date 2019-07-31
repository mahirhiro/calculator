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
        String text =  panel.getTextField().getText();
        int length, number;
        length = text.length();
        number = length - 1;
        String store;
        System.out.println("Size is : " + length);

        if(length > 0) {
            StringBuilder back = new StringBuilder(text);
            back.deleteCharAt(number);
            store=back.toString();
            panel.getTextField().setText(store);
        }

    }
}
