package View;

import Model.Calculations;

import javax.swing.*;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class Panel extends JPanel implements Observer {
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
        calculations.addObserver(this);
        setVisible(true);
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
