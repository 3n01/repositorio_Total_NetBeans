package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EV0_Boton_Salir extends JFrame implements ActionListener
{

    JButton btn1;

    public static void main(String[] args)
    {
        new EV0_Boton_Salir();
    }

    public EV0_Boton_Salir()
    {
        super("Formulario con evento");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 200, 200);

        btn1 = new JButton("Finalizar");
        btn1.addActionListener(this);
        this.add(btn1);

        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btn1)
        {
            System.exit(0);
        }

    }

}
