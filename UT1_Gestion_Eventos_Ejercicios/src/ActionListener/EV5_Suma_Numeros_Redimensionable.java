package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV5_Suma_Numeros_Redimensionable extends JFrame implements ActionListener
{

    //Variables de la clase
    JButton btnResultado;
    JTextField tfd1, tfd2, tfdResultado;
    JLabel lab1, lab2, labResultado;

    public static void main(String[] args)
    {
        new EV5_Suma_Numeros_Redimensionable();
    }

    public EV5_Suma_Numeros_Redimensionable()
    {
        super("Suma de números");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 180, 160);

        try
        {
            //Añadir GridLayout
            GridLayout admin = new GridLayout(4, 1);
            this.setLayout(admin);

            //Llamar a los métodos que crean las filas
            creaFila1();
            creaFila2();
            creaFila3();
            creaFila4();

            //Hacer visible el formulario y ajustar el tamaño
            // this.pack();
     
            this.setVisible(true);
        }
        catch (Exception e)
        {
            tfdResultado.setText(e.getMessage());
        }

    }

    //Métodos que crean las filas
    //Crea 1 fila
    public void creaFila1()
    {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        JPanel panel = new JPanel();
        panel.setLayout(admin);
        //Crear la primera label
        lab1 = new JLabel("Operando 1");
        panel.add(lab1);

        //Crear el primer TextField
        tfd1 = new JTextField(5);
        panel.add(tfd1);
        //Añadir el panel al formulario
        this.add(panel);

    }

    //Crea 2 fila
    public void creaFila2()
    {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        JPanel panel = new JPanel();
        panel.setLayout(admin);
        //Crear la segunda label
        lab2 = new JLabel("Operando 2");
        panel.add(lab2);

        //Crear el segundo TextField
        tfd2 = new JTextField(5);
        panel.add(tfd2);

        //Añadir el panel al formulario
        this.add(panel);
    }

    //Crea 3 fila
    public void creaFila3()
    {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        JPanel panel = new JPanel();
        panel.setLayout(admin);
        //Crear el botón para sumar
        btnResultado = new JButton("Sumar");
        btnResultado.addActionListener(this);
        panel.add(btnResultado);
        //Añadir el panel al formulario
        this.add(panel);
    }

    //Crea 4 fila
    public void creaFila4()
    {
        FlowLayout admin = new FlowLayout(FlowLayout.CENTER, 10, 10);
        JPanel panel = new JPanel();
        panel.setLayout(admin);
        //Crear la label resultado
        labResultado = new JLabel("Resultado");
        panel.add(labResultado);

        //Crear el textbox resultado
        tfdResultado = new JTextField(5);
        panel.add(tfdResultado);
        //Añadir el panel al formulario
        this.add(panel);
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
