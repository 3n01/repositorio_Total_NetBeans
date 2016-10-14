package ChangeListener;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EV8_Seleccionar_Elem_CheckBox_Sin_Boton extends JFrame implements ChangeListener
{

    FlowLayout fl;
    GridLayout gl;
    JCheckBox jcbIngles, jcbFrances, jcbAleman;
    ButtonGroup bg;
    JPanel pnl;
    JButton btn;

    public static void main(String[] args)
    {
        new EV8_Seleccionar_Elem_CheckBox_Sin_Boton();
    }

    public EV8_Seleccionar_Elem_CheckBox_Sin_Boton()
    {
        super("");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear el flowlayout
        gl = new GridLayout(4, 1);
        this.setLayout(gl);

        //Crear los jcheckbox
        jcbIngles = new JCheckBox("Inglés");
        jcbFrances = new JCheckBox("Francés");
        jcbAleman = new JCheckBox("Alemán");

        this.add(jcbIngles);
        jcbIngles.addChangeListener(this);
        this.add(jcbFrances);
        jcbFrances.addChangeListener(this);
        this.add(jcbAleman);
        jcbAleman.addChangeListener(this);

        this.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent ce)
    {
        String titulo = "";

        if (jcbIngles.isSelected())
        {
            titulo += jcbIngles.getText() + " ";
        }

        if (jcbFrances.isSelected())
        {
            if (jcbIngles.isSelected())
            {
                titulo += ",";
            }
            titulo += jcbFrances.getText() + " ";
        }

        if (jcbAleman.isSelected())
        {
            if (jcbFrances.isSelected() || jcbIngles.isSelected())
            {
                titulo += ",";
            }
            titulo += jcbAleman.getText();
        }

        this.setTitle(titulo);
    }

}
