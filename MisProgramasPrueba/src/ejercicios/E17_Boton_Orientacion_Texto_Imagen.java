package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E17_Boton_Orientacion_Texto_Imagen extends JFrame
{

    //Declaracion de variables
    JButton btnDebajo, btnIzquierda, btnEncima, btnDerecha;

    public static void main(String[] args)
    {
        new E17_Boton_Orientacion_Texto_Imagen();
    }

    public E17_Boton_Orientacion_Texto_Imagen()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        //Crear el icono para los botones
        ImageIcon image = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear los botones con los iconos cambiando las orientaciones
        btnDebajo = new JButton("Debajo", image);
        btnDebajo.setBounds(0, 0, 150, 70);
        btnDebajo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnDebajo.setVerticalTextPosition(SwingConstants.BOTTOM);  
        this.add(btnDebajo);
        
          //Crear los botones con los iconos cambiando las orientaciones
        btnDerecha = new JButton("Derecha", image);
        btnDerecha.setBounds(151, 0, 150, 70);
        btnDerecha.setHorizontalTextPosition(SwingConstants.RIGHT);
        btnDerecha.setVerticalTextPosition(SwingConstants.CENTER);  
        this.add(btnDerecha);
        
             //Crear los botones con los iconos cambiando las orientaciones
        btnIzquierda = new JButton("Izquierda", image);
        btnIzquierda.setBounds(0, 80, 150, 70);
        btnIzquierda.setHorizontalTextPosition(SwingConstants.LEFT);
        btnIzquierda.setVerticalTextPosition(SwingConstants.CENTER);  
        this.add(btnIzquierda);
        
             //Crear los botones con los iconos cambiando las orientaciones
        btnEncima = new JButton("Encima", image);
        btnEncima.setBounds(151, 80, 150, 70);
        btnEncima.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEncima.setVerticalTextPosition(SwingConstants.TOP);  
        this.add(btnEncima);

        this.setVisible(true);
    }

}
