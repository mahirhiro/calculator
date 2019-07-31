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

    public void setsT(String sT) {
        this.sT = sT;
    }
    public void updateTextBox() {
        textField.setText(textField.getText() + calculations.getI());
    }

    public void stringCreater(String s) {
        if (!s.equals("=")) {
            sT = sT + s;
        } else {
            System.out.println("Before ST:" + sT);
            //System.out.println("wprks:"+ Arrays.toString(calculations.calc.convertArrayToChar(calculations.calc.make(sT))));
            calculations.calc.convertArrayToChar(calculations.calc.make(sT));
            //calculations.calc.convertArrayToChar(calculations.calc.getOutput());//
            sT = String.valueOf(calculations.calc.postflixConvertToBinaryTree()).split("\\.")[0];
            textField.setText(sT);
        }
    }

    public void clearTextBox() {
        textField.setText(calculations.resetI());
    }
}
