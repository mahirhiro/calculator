package View;

import View.Buttons.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {

        Panel panel = new Panel();
        panel.setSize(new Dimension(280, 400));
        panel.setLayout(null);

        panel.add(new ButtonOne());
        panel.add(new ButtonTwo());
        panel.add(new ButtonThree());
        panel.add(new ButtonPlus());
        panel.add(new ButtonZero());
        panel.add(new ButtonDecimal());
        panel.add(new ButtonEquals());
        panel.add(new ButtonFour());
        panel.add(new ButtonFive());
        panel.add(new ButtonSix());
        panel.add(new ButtonMinus());
        panel.add(new ButtonSeven());
        panel.add(new ButtonEight());
        panel.add(new ButtonNine());
        panel.add(new ButtonMultiply());
        panel.add(new ButtonAC());
        panel.add(new ButtonMod());
        JButton div = new ButtonDivide();
        panel.add(div);

        this.setContentPane(panel);
        /* This part sets the layout for the dimensions and other necessary features */
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(280, 420));
        this.setVisible(true);
        this.pack();
        this.setLocationRelativeTo(null); // Center on screen.
    }
}
