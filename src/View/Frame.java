package View;

import View.Buttons.*;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Frame extends JFrame {

    public Frame() {

        JToolBar jtb = new JToolBar();


        Panel panel = new Panel();
        panel.setSize(new Dimension(280, 400));
        panel.setLayout(null);

        jtb.add(new ButtonOne());
        jtb.setFloatable(false);
        jtb.setRollover(true);

        this.add(panel.getTextField(), BorderLayout.PAGE_START);
        panel.getTextField().setText("Hey");

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
        panel.add(new ButtonAC(panel));
        panel.add(new ButtonMod());
        panel.add(new ButtonDivide());

        this.getContentPane().add(panel);
        //this.setContentPane(panel.getTextField());
        /* This part sets the layout for the dimensions and other necessary features */
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setPreferredSize(new Dimension(280, 400));
        this.pack();
        this.setLocationRelativeTo(null); // Center on screen.
        this.setVisible(true);
    }
}
