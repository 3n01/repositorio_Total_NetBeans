package ActionListener;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EV6_Opt_Suma_Resta extends JFrame implements ActionListener
{

    JButton btnSumar;
    JTextField tfResultado, tfOp1, tfOp2;
    JRadioButton rbSuma, rbResta;
    ButtonGroup bg;
    boolean operacion = true;

    public static void main(String[] args)
    {
        new EV6_Opt_Suma_Resta();
    }

    public EV6_Opt_Suma_Resta()
    {
        super("");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        //Crear los jtextfielfs
        tfOp1 = new JTextField();
        tfOp1.setBounds(10, 10, 100, 30);
        this.add(tfOp1);

        tfOp2 = new JTextField();
        tfOp2.setBounds(10, 50, 100, 30);
        this.add(tfOp2);

        //Crear el botón
        btnSumar = new JButton("Operar");
        btnSumar.setBounds(10, 90, 100, 30);
        btnSumar.setActionCommand("o");
        btnSumar.addActionListener(this);
        this.add(btnSumar);

        //Crear el buttongroup
        bg = new ButtonGroup();

        //Crear el radiobutton 1
        rbSuma = new JRadioButton("Suma", true);
        rbSuma.setBounds(10, 120, 100, 30);
        rbSuma.setActionCommand("s");
        rbSuma.addActionListener(this);
        bg.add(rbSuma);
        this.add(rbSuma);

        //Crear el radiobutton 2
        rbResta = new JRadioButton("Resta");
        rbResta.setBounds(10, 150, 100, 30);
        rbResta.setActionCommand("r");
        rbResta.addActionListener(this);
        bg.add(rbResta);
        this.add(rbResta);

        tfResultado = new JTextField(10);
        tfResultado.setBounds(10, 190, 100, 30);
        this.add(tfResultado);

        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String modo = e.getActionCommand();

        switch (modo)
        {
            case "s":
                operacion = true;
                break;

            case "r":
                operacion = false;
                break;

            case "o":
                int a = Integer.parseInt(tfOp1.getText());
                int b = Integer.parseInt(tfOp2.getText());
                if (operacion) tfResultado.setText(String.valueOf(a + b));
                else  tfResultado.setText(String.valueOf(a - b));             
                break;

        }

    }

}
