package ejercicios;

import javax.swing.*;
import java.awt.*;

public class E23_Boton_Deshabilitado extends JFrame
{
    JButton btn;
    public static void main(String[] args)
    {
        new E23_Boton_Deshabilitado();
    }

    public E23_Boton_Deshabilitado()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        btn=new JButton("Push");
        btn.setEnabled(false);//Para deshabilitar el botón
        this.add(btn);
        this.pack();
        this.setVisible(true);
    }
    
    
}
