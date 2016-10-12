package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_Solo_Texto_Distintas_Alineaciones extends JFrame
{

    JLabel labIzquierda;
    JLabel labDerecha;
    JLabel labCentro;

    public static void main(String[] args)
    {
        JL_Solo_Texto_Distintas_Alineaciones obj = new JL_Solo_Texto_Distintas_Alineaciones();
    }

    public JL_Solo_Texto_Distintas_Alineaciones()
    {
        super("Distintas alineaciones");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 500);

        GridLayout admin = new GridLayout(3, 1);
        setLayout(admin);

        //Crear la etiqueta
        labIzquierda = new JLabel("Texto alineado a la izquierda", JLabel.LEFT);
        labIzquierda.setToolTipText("Texto alineado a la izquieda");
        add(labIzquierda);

        labCentro = new JLabel("Texto alineado al centro", JLabel.CENTER);
        labCentro.setToolTipText("Texto alineado al centro");
        add(labCentro);

        labDerecha = new JLabel("Texto alineado a la derecha", JLabel.RIGHT);
        labDerecha.setToolTipText("Texto alineado a la derecha");
        add(labDerecha);

        setVisible(true);

    }

}
