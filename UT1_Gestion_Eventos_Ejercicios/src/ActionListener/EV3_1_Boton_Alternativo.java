package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV3_1_Boton_Alternativo extends JFrame implements ActionListener
{

    //Variables de la clase
    JButton btnIzquierda, btnDerecha;
    JLabel lab;
    JPanel pnlEtiqueta, pnlBotones;

    public static void main(String[] args)
    {
        new EV3_1_Boton_Alternativo();
    }

    public EV3_1_Boton_Alternativo()
    {
        super("Formulario con JPanel");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 300, 300);

        //Añadir GridLayout
        GridLayout admin = new GridLayout(2, 1);
        this.setLayout(admin);

        //Label 1 avisando de contenido 1
        lab = new JLabel("No ha sido pulsado ningún boton", JLabel.CENTER);

        //Botón izquierda
        btnIzquierda = new JButton("Izquierda");
        btnIzquierda.addActionListener(this);
        this.add(btnIzquierda);

        //Botón btnDerecha
        btnDerecha = new JButton("Derecha");
        btnDerecha.addActionListener(this);
        this.add(btnDerecha);

        //Añadir JPanel
        pnlEtiqueta = new JPanel();
        pnlEtiqueta.add(lab);

        //Añadir segundo JPanel 
        pnlBotones = new JPanel();
        FlowLayout flow = new FlowLayout();
        pnlBotones.setLayout(flow);
        pnlBotones.add(btnIzquierda);
        pnlBotones.add(btnDerecha);

        //Hacer visible el formulario y ajustar el tamaño
        //this.pack();
        this.add(pnlEtiqueta);
        this.add(pnlBotones);
        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnIzquierda)
        {
           
            lab.setText("Ha sido pulsado el botón de la izquierda");

        }
        else
        {
              lab.setText("Ha sido pulsado el botón de la derecha");
        }

    }

}
