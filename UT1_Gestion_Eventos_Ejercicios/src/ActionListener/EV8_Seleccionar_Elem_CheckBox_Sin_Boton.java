package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EV8_Seleccionar_Elem_CheckBox_Sin_Boton extends JFrame implements ActionListener
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
        jcbIngles.addActionListener(this);
        this.add(jcbFrances);
        jcbFrances.addActionListener(this);
        this.add(jcbAleman);
        jcbAleman.addActionListener(this);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String titulo = "";
        
        if (jcbIngles.isSelected())
        {
            titulo += jcbIngles.getText() + " ";
        }

        if (jcbFrances.isSelected())
        {
            titulo += jcbFrances.getText() + " ";
        }

        if (jcbAleman.isSelected())

        {
            titulo += jcbAleman.getText();
        }

        this.setTitle(titulo);

    }

}
