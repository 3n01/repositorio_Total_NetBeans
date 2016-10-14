package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EV8_Seleccionar_Elem_CheckBox_1_Boton extends JFrame implements ActionListener
{

    FlowLayout fl;
    GridLayout gl;
    JCheckBox jcbChrome, jcbFirefox, jcbOpera;
    ButtonGroup bg;
    JPanel pnl;
    JButton btn;
    

    public static void main(String[] args)
    {
        new EV8_Seleccionar_Elem_CheckBox_1_Boton();
    }

    public EV8_Seleccionar_Elem_CheckBox_1_Boton()
    {
        super("");
        this.setBounds(100, 100, 300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear el flowlayout
        gl = new GridLayout(4, 1);
        this.setLayout(gl);

        //Crear los jcheckbox
        jcbChrome = new JCheckBox("Fabas", true);
        jcbFirefox = new JCheckBox("Ensaladilla");
        jcbOpera = new JCheckBox("Pote");

//        //Añadir al buttongroup
//        bg = new ButtonGroup();
//
//        bg.add(jcbChrome);
//        
//        bg.add(jcbFirefox);
//        
//        bg.add(jcbOpera);
        //Crear el botóon
        btn = new JButton("Botón");
        btn.addActionListener(this);
        pnl=new JPanel(new FlowLayout(FlowLayout.LEFT));
        pnl.add(btn);
        
        this.add(jcbChrome);
        this.add(jcbFirefox);
        this.add(jcbOpera);
        this.add(pnl);
    
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String titulo = "";
        if (jcbChrome.isSelected())
        {
            titulo += jcbChrome.getText() + " ";
        }
    
        if (jcbFirefox.isSelected())
        {
            titulo += jcbFirefox.getText() + " ";
        }
 
        if (jcbOpera.isSelected())

        {
            titulo += jcbOpera.getText() ;
        }
    
        this.setTitle(titulo);
        
    }

}
