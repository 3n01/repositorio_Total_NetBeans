package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV2_Cuenta_Pulsaciones extends JFrame implements ActionListener
{
    //Variables de la clase
    JButton btnPulsar;
    JLabel labPulsaciones;
    int contador=0;

    public static void main(String[] args)
    {
        new EV2_Cuenta_Pulsaciones();
    }

    public EV2_Cuenta_Pulsaciones()
    {
        super("Formulario con evento 4");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 200, 200);

        //Añadir FlowLayout
        GridLayout admin = new GridLayout(2,1);
        this.setLayout(admin);

        //Label 1 avisando de contenido 1
        labPulsaciones = new JLabel("Pulsaciones: 0",JLabel.CENTER);
        this.add(labPulsaciones);
   

        //Botón que mueve a la derecha
        btnPulsar = new JButton("Pulsar");
        btnPulsar.addActionListener(this);
        this.add(btnPulsar);

        //Hacer visible el formulario y ajustar el tamaño
        //this.pack();
        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnPulsar)
        {
           contador++;
           labPulsaciones.setText("Pulsaciones: "+contador );

        }
       

    }

}
