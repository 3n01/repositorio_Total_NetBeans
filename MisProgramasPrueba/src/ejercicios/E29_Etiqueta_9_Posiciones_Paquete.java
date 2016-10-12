package ejercicios;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class E29_Etiqueta_9_Posiciones_Paquete extends JFrame
{

    //Declaración de componentes
    GridLayout gl;
    JLabel[] etiquetas;
    ImageIcon icono;

    public static void main(String[] args)
    {
        new E29_Etiqueta_9_Posiciones_Paquete();
    }

    public E29_Etiqueta_9_Posiciones_Paquete()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 200, 500, 500);

        gl = new GridLayout(3, 1);
        this.setLayout(gl);

        icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        etiquetas = new JLabel[9];
        for (int i = 0; i < etiquetas.length; i++)
        {
            switch (i)
            {
                case 0:
                    //Se mete el horizontalAlighment en el constructor
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.LEFT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    break;
                case 1:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.LEFT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.CENTER);
                    break;
                case 2:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.LEFT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.TOP);

                    break;

                case 3:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.CENTER);
                    etiquetas[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    break;
                case 4:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.CENTER);
                    etiquetas[i].setVerticalAlignment(SwingConstants.CENTER);
                    break;
                case 5:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.CENTER);
                    etiquetas[i].setVerticalAlignment(SwingConstants.TOP);
                    break;
                case 6:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.RIGHT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.BOTTOM);
                    break;
                case 7:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.RIGHT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.CENTER);
                    break;
                case 8:
                    etiquetas[i] = new JLabel("Label " + String.valueOf(i), icono, SwingConstants.RIGHT);
                    etiquetas[i].setVerticalAlignment(SwingConstants.TOP);
                    break;
            }
            this.add(etiquetas[i]);
        }

        this.setVisible(true);
    }

}
