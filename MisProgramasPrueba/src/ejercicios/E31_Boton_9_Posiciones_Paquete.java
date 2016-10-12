package ejercicios;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class E31_Boton_9_Posiciones_Paquete extends JFrame
{

    //Declaración de componentes
    GridLayout gl;
    JButton[] botones;
    ImageIcon icono;

    public static void main(String[] args)
    {
        new E31_Boton_9_Posiciones_Paquete();
    }

    public E31_Boton_9_Posiciones_Paquete()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 200, 500, 500);

        gl = new GridLayout(3, 1);
        this.setLayout(gl);

        icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        botones = new JButton[9];
        for (int i = 0; i < botones.length; i++)
        {
            botones[i] = new JButton("Label " + String.valueOf(i), icono);
            switch (i)
            {
                case 0:
                    botones[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    botones[i].setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                case 1:
                    botones[i].setVerticalAlignment(SwingConstants.CENTER);
                    botones[i].setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                case 2:
                    botones[i].setVerticalAlignment(SwingConstants.TOP);
                    botones[i].setHorizontalAlignment(SwingConstants.LEFT);
                    break;
                case 3:
                    botones[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    botones[i].setHorizontalAlignment(SwingConstants.CENTER);
                    break;
                case 4:
                    botones[i].setVerticalAlignment(SwingConstants.CENTER);
                    botones[i].setHorizontalAlignment(SwingConstants.CENTER);
                    break;
                case 5:
                    botones[i].setVerticalAlignment(SwingConstants.TOP);
                    botones[i].setHorizontalAlignment(SwingConstants.CENTER);
                    break;
                case 6:
                    botones[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    botones[i].setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
                case 7:
                    botones[i].setVerticalAlignment(SwingConstants.CENTER);
                    botones[i].setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
                case 8:
                    botones[i].setVerticalAlignment(SwingConstants.TOP);
                    botones[i].setHorizontalAlignment(SwingConstants.RIGHT);
                    break;
            }
            this.add(botones[i]);
        }

        this.setVisible(true);
    }

}
