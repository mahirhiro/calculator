package Controller;

import View.Panel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ButtonBackspaceAction extends AbstractAction {
    private Panel panel;

    public ButtonBackspaceAction(Panel panel) {
        super("⌫");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Backspace");
        panel.updateTextBoxAC();
    }
}
