package ActionListener;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EV6_Opt_Button_Res extends JFrame implements ActionListener
{

    ButtonGroup bg;
    JRadioButton jrb1, jrb2, jrb3;

    public static void main(String[] args)
    {
        new EV6_Opt_Button_Res();
    }

    public EV6_Opt_Button_Res()
    {
        super("JRadioButtons");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        //Crear el buttongroup
        bg = new ButtonGroup();

        //Crear el radiobutton 1
        jrb1 = new JRadioButton("Pequeño",true);
        jrb1.setBounds(10, 20, 100, 30);
        jrb1.setActionCommand("p");
        jrb1.addActionListener(this);
        bg.add(jrb1);
        this.add(jrb1);

        //Crear el radiobutton 2
        jrb2 = new JRadioButton("Mediano");
        jrb2.setBounds(10, 70, 100, 30);
        jrb2.setActionCommand("m");
        jrb2.addActionListener(this);
        bg.add(jrb2);
        this.add(jrb2);

        //Crear el radiobutton 3
        jrb3 = new JRadioButton("Grande");
        jrb3.setBounds(10, 120, 100, 30);
        jrb3.setActionCommand("g");
        jrb3.addActionListener(this);
        bg.add(jrb3);
        this.add(jrb3);

        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String modo = e.getActionCommand();

        switch (modo)
        {
            case "p":
                this.setSize(400, 400);
                break;

            case "m":
                this.setSize(500, 500);
                break;
            case "g":
                this.setSize(700, 700);
                break;

        }

    }

}
