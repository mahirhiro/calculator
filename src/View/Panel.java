package View;

import Model.Calculations;
import Model.Expressions;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class Panel extends JPanel {
    private Calculations calculations;
    private static DecimalFormat df4 = new DecimalFormat("#.####");
    private Expressions expressions;
    private String sT = "";

    public String getsT() {
        return sT;
    }

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

    public void updateTextBoxAC() {
        textField.setText(textField.getText().substring(0, textField.getText().length() - 1));
        sT = textField.getText();
    }
    public void stringCreater(String s) {
        if (!s.equals("=")) {
            sT = sT + s;
        } else {
            System.out.println("Before ST:" + sT);
            textField.setText("" + calculations.calc.make(sT));
            sT = "" + calculations.calc.make(sT);
        }
    }

    public void clearTextBox() {
        textField.setText(calculations.resetI());
        sT = "";
    }
}
