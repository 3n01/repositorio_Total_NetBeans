package ActionListener;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EV7_Oper_Mat_Bas_Con_Boton extends JFrame implements ActionListener
{

    JButton btnSumar;
    JTextField tfResultado, tfOp1, tfOp2;
    JLabel labOp1, labOp2, labResul;
    JRadioButton rbSuma, rbResta, rbMulti, rbDiv;
    ButtonGroup bg;
    boolean operacion = true;

    public static void main(String[] args)
    {
        new EV7_Oper_Mat_Bas_Con_Boton();
    }

    public EV7_Oper_Mat_Bas_Con_Boton()
    {
        super("");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       

        //Añadir GridLayout
        GridLayout admin = new GridLayout(5, 1);
        this.setLayout(admin);

        //Crear el buttongroup
        bg = new ButtonGroup();

        //LLamar a los métodos que crean las filas
        creaFila1();
        creaFila2();
        creaFila3();
        creaFila4();
        creaFila5();

        this.pack();
        this.setVisible(true);
    }

    //Métodos que crean las filas
    //Método que crea la fila 1
    public void creaFila1()
    {
        FlowLayout admin = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setLayout(admin);

        //Crear la primera label
        labOp1 = new JLabel("Operando 1");
        panel.add(labOp1);

        //Crear el 1 textfiel
        tfOp1 = new JTextField(10);
        panel.add(tfOp1);

        //Añadir el panel
        this.add(panel);

    }

    //Método que crea la fila 2
    public void creaFila2()
    {

        FlowLayout admin = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setLayout(admin);

        labOp2 = new JLabel("Operando 2");
        panel.add(labOp1);

        tfOp2 = new JTextField(10);
        panel.add(tfOp2);

        //Añadir el panel
        this.add(panel);

    }

    //Método que crea la fila 3
    public void creaFila3()
    {
        FlowLayout admin = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setLayout(admin);

        //Crear el radiobutton 1
        rbSuma = new JRadioButton("Suma", true);
        bg.add(rbSuma);
        panel.add(rbSuma);

        //Crear el radiobutton 2
        rbResta = new JRadioButton("Resta");
        bg.add(rbResta);
        panel.add(rbResta);

        //Crear el radiobutton 1
        rbMulti = new JRadioButton("Multiplicacion");
        bg.add(rbMulti);
        panel.add(rbMulti);

        //Crear el radiobutton 2
        rbDiv = new JRadioButton("Division");
        bg.add(rbDiv);
        panel.add(rbDiv);

        //Añadir el panel
        this.add(panel);

    }

    //Método que crea la fila 4
    public void creaFila4()
    {

        FlowLayout admin = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setLayout(admin);

        //Crear el botón
        btnSumar = new JButton("Operar");
        btnSumar.addActionListener(this);
        panel.add(btnSumar);

        //Añadir el panel
        this.add(panel);
    }

    //Método que crea la fila 5
    public void creaFila5()
    {

        FlowLayout admin = new FlowLayout();
        JPanel panel = new JPanel();
        panel.setLayout(admin);

        labResul = new JLabel("Resultado");
        panel.add(labResul);

        tfResultado = new JTextField(10);
        panel.add(tfResultado);

        this.add(panel);

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
                if (operacion)
                {
                    tfResultado.setText(String.valueOf(a + b));
                }
                else
                {
                    tfResultado.setText(String.valueOf(a - b));
                }
                break;

        }

    }

}
