package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E25_JTextField_Ancho extends JFrame
{
    JTextField tf;
    
    public static void main(String[] args)
    {
        new E25_JTextField_Ancho();
    }

    public E25_JTextField_Ancho()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        tf=new JTextField(70);
        this.add(tf);
        
        this.pack();
        this.setVisible(true);
    }
    
    
}
