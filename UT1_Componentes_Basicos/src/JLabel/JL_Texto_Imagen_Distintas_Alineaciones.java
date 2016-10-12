package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_Texto_Imagen_Distintas_Alineaciones extends JFrame
{

    JLabel labIzquierda;
    JLabel labDerecha;
    JLabel labCentro;

    public static void main(String[] args)
    {
        JL_Texto_Imagen_Distintas_Alineaciones obj = new JL_Texto_Imagen_Distintas_Alineaciones();
    }

    public JL_Texto_Imagen_Distintas_Alineaciones()
    {
        super("Distintas alineaciones con imagenes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        GridLayout admin = new GridLayout(3, 1, 10, 10);
        setLayout(admin);
        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear la etiqueta
        labIzquierda = new JLabel("Texto", img, JLabel.LEFT);
        labIzquierda.setToolTipText("Texto alineado a la izquieda");
        labIzquierda.setHorizontalTextPosition(JLabel.CENTER);
        labIzquierda.setVerticalTextPosition(JLabel.BOTTOM);
        add(labIzquierda);

        labCentro = new JLabel("Texto", img, JLabel.CENTER);

        labCentro.setHorizontalTextPosition(JLabel.LEFT);
        labCentro.setToolTipText("Texto alineado al centro");
        add(labCentro);

        labDerecha = new JLabel("Texto", img, JLabel.RIGHT);
        labDerecha.setVerticalTextPosition(JLabel.TOP);
        labDerecha.setToolTipText("Texto alineado a la derecha");
        add(labDerecha);

        this.setVisible(true);
    }

}
