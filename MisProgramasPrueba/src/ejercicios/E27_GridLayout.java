package ejercicios;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class E27_GridLayout extends JFrame
{

    //Declaración de botones
    JButton btn1, btn2, btn3,btn4;
    GridLayout gl;

    public static void main(String[] args)
    {
        new E27_GridLayout(1, 1, 0, 0);
        new E27_GridLayout(2, 1, 0, 300);
        new E27_GridLayout(3, 1, 400, 300);
    }

    public E27_GridLayout(int filas, int columnas, int x, int y)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(x, y, 400, 200);

        gl = new GridLayout(filas, columnas,10,10);//10 10 es el espacio de separación entre componentes
        this.setLayout(gl);

        btn1 = new JButton("Botón 1");
        this.add(btn1);

        btn2 = new JButton("Botón 2");
        this.add(btn2);

        btn3 = new JButton("Botón 3");
        this.add(btn3);
        
        btn4 = new JButton("Botón 4");
        this.add(btn4);
        
        this.setVisible(true);
    }

}
