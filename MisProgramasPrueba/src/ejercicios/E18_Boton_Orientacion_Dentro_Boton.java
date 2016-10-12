package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E18_Boton_Orientacion_Dentro_Boton extends JFrame
{

    //Declaracíón de botones
    JButton btnAbajo, btnDerecha, btnIzquierda, btnArriba, btnCentrado, btnAbajoDerecha, btnArribaIzquierda;

    public static void main(String[] args)
    {
        new E18_Boton_Orientacion_Dentro_Boton();
    }

    public E18_Boton_Orientacion_Dentro_Boton()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 450);
        this.setLocationRelativeTo(null);

        ImageIcon icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        btnAbajo = new JButton(icono);
        btnAbajo.setVerticalAlignment(SwingConstants.BOTTOM);
        btnAbajo.setBounds(0, 0, 150, 100);
        this.add(btnAbajo);

        btnArriba = new JButton(icono);
        btnArriba.setVerticalAlignment(SwingConstants.TOP);
        btnArriba.setBounds(155, 0, 150, 100);
        this.add(btnArriba);

        btnDerecha = new JButton(icono);
        btnDerecha.setHorizontalAlignment(SwingConstants.RIGHT);
        btnDerecha.setBounds(0, 155, 150, 100);
        this.add(btnDerecha);

        btnIzquierda = new JButton(icono);
        btnIzquierda.setHorizontalAlignment(SwingConstants.LEFT);
        btnIzquierda.setBounds(155, 155, 150, 100);
        this.add(btnIzquierda);

        btnAbajoDerecha = new JButton(icono);
        btnAbajoDerecha.setHorizontalAlignment(SwingConstants.RIGHT);
        btnAbajoDerecha.setVerticalAlignment(SwingConstants.BOTTOM);
        btnAbajoDerecha.setBounds(310, 0, 150, 100);
        this.add(btnAbajoDerecha);
        
        btnArribaIzquierda = new JButton(icono);
        btnArribaIzquierda.setHorizontalAlignment(SwingConstants.LEFT);
        btnArribaIzquierda.setVerticalAlignment(SwingConstants.TOP);
        btnArribaIzquierda.setBounds(310, 155, 150, 100);
        this.add(btnArribaIzquierda);

        this.setVisible(true);
    }

}
