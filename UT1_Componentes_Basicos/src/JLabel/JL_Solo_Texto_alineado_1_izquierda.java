package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_Solo_Texto_alineado_1_izquierda extends JFrame
{

    JLabel etiqueta1;

    public static void main(String[] args)
    {
        new JL_Solo_Texto_alineado_1_izquierda();
    }

    public JL_Solo_Texto_alineado_1_izquierda()
    {
        super("Texto alineado a la izquierda");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        //Crear la etiqueta
        etiqueta1 = new JLabel("Texto alineado a la izquierda", JLabel.LEFT);
        etiqueta1.setToolTipText("Texto alineado a la izquieda");
        add(etiqueta1);

        //Fijar visible
        this.setVisible(true);

    }

}
