package misprogramasprueba;

import javax.swing.*;
import java.awt.*;

public class MisProgramasPrueba extends JFrame {

    JButton btn1;
    JLabel lab1;

    public static void main(String[] args) {

        new MisProgramasPrueba();

    }

    public MisProgramasPrueba() {
        super("Mi formulario con botón");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
      //  this.setLayout(null);

        //Crear un icono para la apliación
        Toolkit screen = Toolkit.getDefaultToolkit();
       // Dimension screenSize=screen.getScreenSize();//PARA OBTENER ANCHO Y ALTO DE PANTALLA
        
        Image frmIcon = screen.getImage(getClass().getResource("..\\Recursos\\icono.png"));
        this.setIconImage(frmIcon);

        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Crear y añadir un botón
        btn1 = new JButton("Push the button", icono);
        btn1.setBounds(0, 0, 200, 50);
        this.add(btn1);
        
            //Crear y añadir un botón
        btn1 = new JButton("Push the button", icono);
        btn1.setBounds(0, 60, 200, 50);
        this.add(btn1);

        //Crear y añadir una etiqueta
        lab1 = new JLabel("Este es el texto de la etiqueta");
        lab1.setBounds(200, 250, 170, 30);
        this.add(lab1);

        this.setVisible(true);

    }

}
