package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_TextoHoriz_Izq_Vert_3_Posiciones extends JFrame
{

    JLabel lab1;
    JLabel lab2;
    JLabel lab3;

    public static void main(String[] args)
    {
        JL_TextoHoriz_Izq_Vert_3_Posiciones obj = new JL_TextoHoriz_Izq_Vert_3_Posiciones();
    }

    public JL_TextoHoriz_Izq_Vert_3_Posiciones()
    {
        super("Texto a la izquierda y en las 3 alturas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        GridLayout admin = new GridLayout(1, 3, 10, 10);
        setLayout(admin);
        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear la etiqueta
        lab1 = new JLabel("Texto", img, JLabel.CENTER);
        lab1.setToolTipText("Texto alineado a la izquieda");
        lab1.setHorizontalTextPosition(JLabel.LEFT);
        lab1.setVerticalTextPosition(JLabel.BOTTOM);
        add(lab1);

        lab2 = new JLabel("Texto", img, JLabel.CENTER);
        lab2.setHorizontalTextPosition(JLabel.LEFT);
        lab2.setVerticalTextPosition(JLabel.CENTER);
        lab2.setToolTipText("Texto alineado al centro");
        add(lab2);

        lab3 = new JLabel("Texto", img, JLabel.CENTER);
        lab3.setHorizontalTextPosition(JLabel.LEFT);
        lab3.setVerticalTextPosition(JLabel.TOP);
        lab3.setToolTipText("Texto alineado a la derecha");
        add(lab3);

        this.pack();
        this.setVisible(true);
    }

}
