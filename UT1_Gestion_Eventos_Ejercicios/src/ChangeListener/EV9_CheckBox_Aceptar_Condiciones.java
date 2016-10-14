package ChangeListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EV9_CheckBox_Aceptar_Condiciones extends JFrame implements ChangeListener, ActionListener
{

    FlowLayout fl;
    GridLayout gl;
    JCheckBox jcbAceptar;
    ButtonGroup bg;
    JPanel pnl;
    JLabel lab;
    JButton btn;

    public static void main(String[] args)
    {
        new EV9_CheckBox_Aceptar_Condiciones();
    }

    public EV9_CheckBox_Aceptar_Condiciones()
    {
        super("");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear el flowlayout
        gl = new GridLayout(3, 1);
        this.setLayout(gl);

        //Crear la etiqueta
        lab = new JLabel("Está de acuerdo con las condiciones?");
        this.add(lab);

        //Crear los jcheckbox
        jcbAceptar = new JCheckBox("Aceptar");

        jcbAceptar.addChangeListener(this);
        this.add(jcbAceptar);

        btn = new JButton("Continuar");
        btn.setEnabled(false);
        btn.addActionListener(this);
        this.add(btn);

        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent ce)
    {

        if (jcbAceptar.isSelected())
        {
             btn.setEnabled(true);
           
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }

}
