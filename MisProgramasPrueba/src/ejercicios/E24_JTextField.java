package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E24_JTextField extends JFrame
{

    JTextField tf1, tf2, tf3, tf4;

    public static void main(String[] args)
    {
        new E24_JTextField();
    }

    public E24_JTextField()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLayout(null);

        tf1 = new JTextField();
        tf1.setBounds(0, 0, 100, 50);
        this.add(tf1);

        tf2 = new JTextField("Texto");
        tf2.setBounds(0, 50, 50, 50);
        this.add(tf2);

        this.setVisible(true);
    }

}
