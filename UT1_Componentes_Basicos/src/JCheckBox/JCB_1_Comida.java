package JCheckBox;

import javax.swing.*;
import java.awt.*;

public class JCB_1_Comida extends JFrame
{

    FlowLayout fl;
    JCheckBox jcbFabas, jcbEnsaladilla, jcbPote, jcbPan;
    ButtonGroup bg;

    public static void main(String[] args)
    {
        new JCB_1_Comida();
    }

    public JCB_1_Comida()
    {
        super("Comida");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear el flowlayout
        fl = new FlowLayout();
        this.setLayout(fl);

        //Crear los jcheckbox
        jcbFabas = new JCheckBox("Fabas", true);
        jcbEnsaladilla = new JCheckBox("Ensaladilla");
        jcbPote = new JCheckBox("Pote");
        jcbPan = new JCheckBox("Pan", true);

        //Añadir al buttongroup
        bg = new ButtonGroup();

        bg.add(jcbFabas);
        bg.add(jcbEnsaladilla);
        bg.add(jcbPote);

        this.add(jcbFabas);
        this.add(jcbEnsaladilla);
        this.add(jcbPote);
        this.add(jcbPan);
        
        this.pack();
        this.setVisible(true);
    }

}
