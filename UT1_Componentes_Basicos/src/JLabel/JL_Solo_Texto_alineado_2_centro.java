package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_Solo_Texto_alineado_2_centro extends JFrame
{

    JLabel etiqueta1;

    public static void main(String[] args)
    {
        JL_Solo_Texto_alineado_2_centro obj = new JL_Solo_Texto_alineado_2_centro();
    }

    public JL_Solo_Texto_alineado_2_centro()
    {
        super("Texto centrado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        //Crear la etiqueta
        etiqueta1 = new JLabel("Texto alineado al centro", JLabel.CENTER);
        etiqueta1.setToolTipText("Texto alineado al centro");
        add(etiqueta1);

        setVisible(true);

    }

}
