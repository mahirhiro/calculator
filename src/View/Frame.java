package View;

import Model.Calculations;
import View.Buttons.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private Calculations calculations;

    public Frame(Calculations calculations) {
        this.calculations = calculations;



        Panel panel = new Panel(calculations);
        panel.setSize(new Dimension(280, 400));
        panel.setLayout(null);

        this.add(panel.getTextField(), BorderLayout.PAGE_START);

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
        panel.add(new BackSpace(calculations, panel));
        panel.add(new ButtonPlus());
        panel.add(new ButtonDecimal());
        panel.add(new ButtonEquals());
        panel.add(new ButtonMinus());
        panel.add(new ButtonMultiply());
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
