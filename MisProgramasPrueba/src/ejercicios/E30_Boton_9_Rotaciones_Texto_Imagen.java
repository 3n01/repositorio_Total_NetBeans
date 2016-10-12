package ejercicios;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class E30_Boton_9_Rotaciones_Texto_Imagen extends JFrame
{

    //Declaración de componentes
    JButton[] lab1 = new JButton[9];
    GridLayout gl;
    ImageIcon icono;
    Toolkit pantalla;

    public static void main(String[] args)
    {
        new E30_Boton_9_Rotaciones_Texto_Imagen();
    }

    public E30_Boton_9_Rotaciones_Texto_Imagen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        this.setSize(500, 500);

        gl = new GridLayout(3, 1);
        this.setLayout(gl);

        icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        for (int i = 0; i < lab1.length; i++)
        {
            //Texto, icono, no sitio para la posición en el constructor
            lab1[i] = new JButton("Label " + String.valueOf(i), icono);
            this.add(lab1[i]);
        }

        //Cambiar las orientaciones
        lab1[0].setHorizontalTextPosition(SwingConstants.LEFT);
        lab1[0].setVerticalTextPosition(SwingConstants.TOP);
        
        lab1[1].setHorizontalTextPosition(SwingConstants.LEFT);
        lab1[1].setVerticalTextPosition(SwingConstants.CENTER);
        
        lab1[2].setHorizontalTextPosition(SwingConstants.LEFT);
        lab1[2].setVerticalTextPosition(SwingConstants.BOTTOM);
        
        lab1[3].setHorizontalTextPosition(SwingConstants.CENTER);
        lab1[3].setVerticalTextPosition(SwingConstants.TOP);
        
        lab1[4].setHorizontalTextPosition(SwingConstants.CENTER);
        lab1[4].setVerticalTextPosition(SwingConstants.CENTER);
        
        lab1[5].setHorizontalTextPosition(SwingConstants.CENTER);
        lab1[5].setVerticalTextPosition(SwingConstants.BOTTOM);
        
        lab1[6].setHorizontalTextPosition(SwingConstants.RIGHT);
        lab1[6].setVerticalTextPosition(SwingConstants.TOP);
        
        lab1[7].setHorizontalTextPosition(SwingConstants.RIGHT);
        lab1[7].setVerticalTextPosition(SwingConstants.CENTER);
        
        lab1[8].setHorizontalTextPosition(SwingConstants.RIGHT);
        lab1[8].setVerticalTextPosition(SwingConstants.BOTTOM);

        this.setVisible(true);
    }

}

