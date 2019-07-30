package View;

import Model.Calculations;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private Calculations calculations;

    public JTextField getTextField() {
        return textField;
    }

    private JTextField textField = new JTextField();

    public Panel(Calculations calculations) {
        this.calculations = calculations;
        setBackground(Color.BLACK);
        textField.setColumns(100);
        textField.setPreferredSize(new Dimension(50,50));
        add(textField);
        textField.setEditable(false);
        textField.setFont(new Font("Helvetica", Font.PLAIN, 30));
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        textField.setForeground(Color.WHITE);
        textField.setBackground(Color.BLACK);
        setOpaque(true);
        setFocusable(true);
        setVisible(true);
    }

    public void updateTextBox() {
        textField.setText(textField.getText() + calculations.getI());
    }

    public void clearTextBox() {
        textField.setText(calculations.resetI());
    }
}
