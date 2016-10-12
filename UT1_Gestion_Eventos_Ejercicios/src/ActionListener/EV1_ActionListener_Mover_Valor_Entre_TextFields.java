package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV1_ActionListener_Mover_Valor_Entre_TextFields extends JFrame implements ActionListener
{

    JButton btnMoverDerecha, btnMoverIzquierda;
    JLabel lab1, lab2;
    JTextField tfd1, tfd2;

    public static void main(String[] args)
    {
        new EV1_ActionListener_Mover_Valor_Entre_TextFields();
    }

    public EV1_ActionListener_Mover_Valor_Entre_TextFields()
    {
        super("Formulario con evento 3");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 200, 200);

        //Añadir FlowLayout
        FlowLayout admin = new FlowLayout();
        this.setLayout(admin);

        //Label 1 avisando de contenido 1
        lab1 = new JLabel("Derecha");
        this.add(lab1);
        //TextField 1 contiene contenido 1
        tfd1 = new JTextField(10);
        this.add(tfd1);

        //Botón que mueve a la derecha
        btnMoverDerecha = new JButton("Mover a derecha");
        btnMoverDerecha.addActionListener(this);
        this.add(btnMoverDerecha);

        //Botón que mueve a la izquierda
        btnMoverIzquierda = new JButton("Mover a izquierda");
        btnMoverIzquierda.addActionListener(this);
        this.add(btnMoverIzquierda);

        //Label 2 avisando de contenido 2
        lab2 = new JLabel("Izquierda");
        this.add(lab2);

        //TextField 2 
        tfd2 = new JTextField(10);
        this.add(tfd2);

        //Hacer visible el formulario y ajustar el tamaño
        this.pack();
        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnMoverDerecha)
        {
            tfd2.setText(tfd1.getText());
            tfd1.setText("");

        }
        else
        {
            tfd1.setText(tfd2.getText());
            tfd2.setText("");
        }

    }

}
