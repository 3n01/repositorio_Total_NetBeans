package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E16_Boton_Poner_Icono extends JFrame
{

    JButton btnBoton1, btnBoton2;

    public static void main(String[] args)
    {
        new E16_Boton_Poner_Icono();
    }

    public E16_Boton_Poner_Icono()
    {
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(200, 200);

        //Crear un objeto imagen para el botón
        ImageIcon icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear el botón con el icono
        btnBoton1 = new JButton(icono);
        btnBoton1.setBounds(0, 0, 100, 40);
        this.add(btnBoton1);

        //Crear el botón con texto e icono
        btnBoton2 = new JButton("Texto", icono);
        btnBoton2.setBounds(0, 50, 200, 40);
        this.add(btnBoton2);

        this.setVisible(true);
    }

}
