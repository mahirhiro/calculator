package View;

import Model.Calculations;
import View.Buttons.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {


    public Frame(Calculations calculations) {

        Panel panel = new Panel(calculations);
        panel.setLayout(null);

        panel.add(new ButtonOne(calculations, panel));
        panel.add(new ButtonTwo(calculations, panel));
        panel.add(new ButtonThree(calculations, panel));
        panel.add(new ButtonFour(calculations, panel));
        panel.add(new ButtonFive(calculations, panel));
        panel.add(new ButtonSix(calculations, panel));
        panel.add(new ButtonSeven(calculations, panel));
        panel.add(new ButtonEight(calculations, panel));
        panel.add(new ButtonNine(calculations, panel));
        panel.add(new ButtonZero(calculations, panel));

        panel.add(new ButtonAC(calculations, panel));
        panel.add(new ButtonBackspace(panel));
        panel.add(new ButtonPlus(calculations, panel));
        panel.add(new ButtonDecimal(calculations, panel));
        panel.add(new ButtonEquals(panel));
        panel.add(new ButtonMinus(calculations, panel));
        panel.add(new ButtonMultiply(calculations, panel));
        panel.add(new ButtonDivide(calculations, panel));

        this.add(panel.getTextField(), BorderLayout.PAGE_START);
        this.getContentPane().add(panel);

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
