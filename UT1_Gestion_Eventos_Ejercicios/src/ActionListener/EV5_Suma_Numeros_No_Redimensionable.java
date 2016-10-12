package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV5_Suma_Numeros_No_Redimensionable extends JFrame implements ActionListener
{

    //Variables de la clase
    JButton btnResultado;
    JTextField tfd1, tfd2, tfdResultado;
    JLabel lab1, lab2, labResultado;

    public static void main(String[] args)
    {
        new EV5_Suma_Numeros_No_Redimensionable();
    }

    public EV5_Suma_Numeros_No_Redimensionable()
    {
        super("Suma de números");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100,180 , 160);

        try
        {
            //Añadir GridLayout
            FlowLayout admin = new FlowLayout(FlowLayout.CENTER);
            this.setLayout(admin);

            //Crear la primera label
            lab1 = new JLabel("Operando 1");
            this.add(lab1);

            //Crear el primer TextField
            tfd1 = new JTextField(5);
            this.add(tfd1);

            //Crear la segunda label
            lab2 = new JLabel("Operando 2");
            this.add(lab2);

            //Crear el segundo TextField
            tfd2 = new JTextField(5);
            this.add(tfd2);

            //Crear el botón para sumar
            btnResultado = new JButton("Pulsar para sumar");
            btnResultado.addActionListener(this);
            this.add(btnResultado);
            
            //Crear la label resultado
            labResultado=new JLabel("Resultado");
            this.add(labResultado);

            //Crear el textbox resultado
            tfdResultado = new JTextField(5);
            this.add(tfdResultado);

            //Hacer visible el formulario y ajustar el tamaño
           // this.pack();
            this.setResizable(false);
            this.setVisible(true);
        }
        catch (Exception e)
        {
            tfdResultado.setText(e.getMessage());
        }

    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {

        try
        {
            int operando1 = Integer.parseInt(tfd1.getText());
            int operando2 = Integer.parseInt(tfd2.getText());
            int resultado = operando1 + operando2;
            tfdResultado.setText(String.valueOf(resultado));
        }
        catch (Exception error)
        {
                tfdResultado.setText(error.getMessage());
        }
    }

}
