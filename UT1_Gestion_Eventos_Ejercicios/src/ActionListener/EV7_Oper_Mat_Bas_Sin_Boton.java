package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EV7_Oper_Mat_Bas_Sin_Boton extends JFrame implements ActionListener
{

    //Declaración de variables
    JRadioButton rbSuma;
    JRadioButton rbRestar;
    JRadioButton rbMulti;
    JRadioButton rbDivis;
    ButtonGroup bg;
    JTextField tfResultado, tfOperando1, tfOperando2;

    public static void main(String[] args)
    {
        new EV7_Oper_Mat_Bas_Sin_Boton();
    }

    public EV7_Oper_Mat_Bas_Sin_Boton()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // this.setBounds(0,0,400,300);

        GridLayout gl = new GridLayout(4, 1);
        this.setLayout(gl);

        this.creaFila1();
        this.creaFila2();
        this.creaFila3();
        this.creaFila4();

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        float operando1 = Float.parseFloat(tfOperando1.getText());
        float operando2 = Float.parseFloat(tfOperando2.getText());
        if (rbSuma.isSelected())
        {
            tfResultado.setText(String.valueOf(operando1 + operando2));
        }
        else if (rbRestar.isSelected())
        {
            tfResultado.setText(String.valueOf(operando1 - operando2));
        }
        else if (rbMulti.isSelected())
        {
            tfResultado.setText(String.valueOf(operando1 * operando2));
        }
        else
        {
            tfResultado.setText(String.valueOf(operando1 / operando2));
        }
    }

    //Métodos que crean cada fila
    //Crea fila 1
    public void creaFila1()
    {
        JPanel panel = new JPanel(new FlowLayout());
        JLabel lab = new JLabel("Operando 1");
        tfOperando1 = new JTextField(5);
        panel.add(lab);
        panel.add(tfOperando1);
        this.add(panel);
    }

    //Crea fila 2
    public void creaFila2()
    {
        JPanel panel = new JPanel(new FlowLayout());
        JLabel lab = new JLabel("Operando 2");
        tfOperando2 = new JTextField(5);
        panel.add(lab);
        panel.add(tfOperando2);
        this.add(panel);
    }

    //Crea fila 3
    public void creaFila3()
    {
        JPanel panel = new JPanel(new FlowLayout());
        rbSuma = new JRadioButton("Sumar");
        rbSuma.addActionListener(this);
        rbRestar = new JRadioButton("Restar");
        rbRestar.addActionListener(this);
        rbMulti = new JRadioButton("Multiplicar");
        rbMulti.addActionListener(this);
        rbDivis = new JRadioButton("Dividir");
        rbDivis.addActionListener(this);
        //El buttongroup se asegura de que cuando un jradiobutton está seleccionado los demás no
        bg = new ButtonGroup();
        bg.add(rbSuma);
        bg.add(rbRestar);
        bg.add(rbMulti);
        bg.add(rbDivis);

        //Añadir los radiobutton al panel
        panel.add(rbSuma);
        panel.add(rbRestar);
        panel.add(rbMulti);
        panel.add(rbDivis);

        this.add(panel);
    }

    //Crea fila 4
    public void creaFila4()
    {
        JPanel panel = new JPanel(new FlowLayout());
        JLabel lab = new JLabel("Resultado");
        tfResultado = new JTextField(5);
        panel.add(lab);
        panel.add(tfResultado);
        this.add(panel);
    }

}
