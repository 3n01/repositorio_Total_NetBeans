package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV3_2_Conocer_Boton_Pulsado extends JFrame implements ActionListener
{

    //Variables de la clase
    JButton btnIzquierda, btnDerecha, btnCentro;

    JPanel pnlEtiqueta, pnlBotones;

    public static void main(String[] args)
    {
        new EV3_2_Conocer_Boton_Pulsado();
    }

    public EV3_2_Conocer_Boton_Pulsado()
    {
        super("No ha sido pulsado ningún botón");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 500, 80);

        //Añadir GridLayout
        FlowLayout admin = new FlowLayout();
        this.setLayout(admin);

        //Botón izquierda
        btnIzquierda = new JButton("Izquierda");
        btnIzquierda.addActionListener(this);
        this.add(btnIzquierda);

        //Botón btnCentro
        btnCentro = new JButton("Centro");
        btnCentro.addActionListener(this);
        this.add(btnCentro);

        //Botón btnDerecha
        btnDerecha = new JButton("Derecha");
        btnDerecha.addActionListener(this);
        this.add(btnDerecha);

        //Hacer visible el formulario y ajustar el tamaño
        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
 
//        System.out.println(nombre);
//
//        switch (nombre)
//        {
//            case "btnIzquierda":
//                 this.setTitle("Ha sido pulsado el botón de la izquierda");
//                break;
//
//
//            case "btnDerecha":
//                 this.setTitle("Ha sido pulsado el botón de la derecha");
//                break;
//                
//            default:
//                 this.setTitle("Ha sido pulsado el botón del centro");
//                break;
//        }
        if (e.getSource() == btnIzquierda)
        {

            this.setTitle("Ha sido pulsado el botón de la izquierda");

        }
        else if (e.getSource() == btnDerecha)
        {
            this.setTitle("Ha sido pulsado el botón de la derecha");
        }
        else
        {
            this.setTitle("Ha sido pulsado el botón del centro");
        }

    }

}
