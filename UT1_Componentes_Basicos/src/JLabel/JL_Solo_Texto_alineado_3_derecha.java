package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_Solo_Texto_alineado_3_derecha extends JFrame
{

    JLabel etiqueta1;

    public static void main(String[] args)
    {
        JL_Solo_Texto_alineado_3_derecha obj = new JL_Solo_Texto_alineado_3_derecha();
    }

    public JL_Solo_Texto_alineado_3_derecha()
    {
        super("Texto alineado a la derecha");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);

        //Crear la etiqueta
        etiqueta1 = new JLabel("Texto alineado a la derecha", JLabel.RIGHT);
        etiqueta1.setToolTipText("Texto alineado a la derecha");
        add(etiqueta1);

        this.setVisible(true);

    }

}
