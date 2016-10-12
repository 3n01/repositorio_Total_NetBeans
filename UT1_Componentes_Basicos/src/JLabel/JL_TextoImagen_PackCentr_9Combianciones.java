package JLabel;

import java.awt.*;
import javax.swing.*;

public class JL_TextoImagen_PackCentr_9Combianciones extends JFrame
{

    JLabel lab1,lab2,lab3,lab4,lab5,lab6,lab7,lab8,lab9;
   

    public static void main(String[] args)
    {
        JL_TextoImagen_PackCentr_9Combianciones obj = new JL_TextoImagen_PackCentr_9Combianciones();
    }

    public JL_TextoImagen_PackCentr_9Combianciones()
    {
        super("Paqueta de Imagen/Texto Izquieda, 9 combinaciones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 500);

        GridLayout admin = new GridLayout(3, 3, 10, 10);
        setLayout(admin);
        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon img = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear la etiqueta
        lab1 = new JLabel("Texto", img, JLabel.CENTER);
        lab1.setToolTipText("Texto alineado a la izquieda");
        lab1.setHorizontalTextPosition(JLabel.LEFT);
        lab1.setVerticalTextPosition(JLabel.TOP);
        add(lab1);

        lab2 = new JLabel("Texto", img, JLabel.CENTER);
        lab2.setHorizontalTextPosition(JLabel.CENTER);
        lab2.setVerticalTextPosition(JLabel.TOP);
        lab2.setToolTipText("Texto alineado al centro");
        add(lab2);

        lab3 = new JLabel("Texto", img, JLabel.CENTER);
        lab3.setHorizontalTextPosition(JLabel.RIGHT);
        lab3.setVerticalTextPosition(JLabel.TOP);
        lab3.setToolTipText("Texto alineado a la derecha");
        add(lab3);
        
              //Crear la etiqueta
        lab4 = new JLabel("Texto", img, JLabel.CENTER);
        lab4.setToolTipText("Texto alineado a la izquieda");
        lab4.setHorizontalTextPosition(JLabel.LEFT);
        lab4.setVerticalTextPosition(JLabel.CENTER);
        add(lab4);

        lab5 = new JLabel("Texto", img, JLabel.CENTER);
        lab5.setHorizontalTextPosition(JLabel.CENTER);
        lab5.setVerticalTextPosition(JLabel.CENTER);
        lab5.setToolTipText("Texto alineado al centro");
        add(lab5);

        lab6 = new JLabel("Texto", img, JLabel.CENTER);
        lab6.setHorizontalTextPosition(JLabel.RIGHT);
        lab6.setVerticalTextPosition(JLabel.TOP);
        lab6.setToolTipText("Texto alineado a la derecha");
        add(lab6);
        
              //Crear la etiqueta
        lab7 = new JLabel("Texto", img, JLabel.CENTER);
        lab7.setToolTipText("Texto alineado a la izquieda");
        lab7.setHorizontalTextPosition(JLabel.LEFT);
        lab7.setVerticalTextPosition(JLabel.BOTTOM);
        add(lab7);

        lab8 = new JLabel("Texto", img, JLabel.CENTER);
        lab8.setHorizontalTextPosition(JLabel.CENTER);
        lab8.setVerticalTextPosition(JLabel.BOTTOM);
        lab8.setToolTipText("Texto alineado al centro");
        add(lab8);

        lab9 = new JLabel("Texto", img, JLabel.CENTER);
        lab9.setHorizontalTextPosition(JLabel.RIGHT);
        lab9.setVerticalTextPosition(JLabel.BOTTOM);
        lab9.setToolTipText("Texto alineado a la derecha");
        add(lab9);

    
        this.setVisible(true);
    }

}
