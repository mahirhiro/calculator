package View;

import Model.Calculations;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Panel extends JPanel {
    private Calculations calculations;
    private static DecimalFormat df4 = new DecimalFormat("#.####");
    private String oldSymbols = "";


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
        textField.setFont(new Font("Helvetica", Font.PLAIN, 35));
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

    public void updateTextBoxAC() {
        textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
        oldSymbols = textField.getText();
    }

    public void stringCreater(String newSymbol) {
        if (!newSymbol.equals("=")) {
            oldSymbols = oldSymbols + newSymbol;
        } else {
            System.out.println("Before ST:" + oldSymbols);
            textField.setText("" + df4.format(calculations.calc.make(oldSymbols)));
            oldSymbols = "" + calculations.calc.make(oldSymbols);
        }
    }

    public void clearTextBox() {
        textField.setText(calculations.resetI());
        oldSymbols = "";
    }

    public void updateTextBoxSymbols() {
        textField.setText(textField.getText() + calculations.getSymbolAcceptor());
    }
}
