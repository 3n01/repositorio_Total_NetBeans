package ejercicios;
import javax.swing.*;
import java.awt.*;

public class E21_Formulario_No_Redimensionable extends JFrame
{
    public static void main (String [] args)
    {
        new E21_Formulario_No_Redimensionable();
    }
    
    public E21_Formulario_No_Redimensionable()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300,300);
        this.setResizable(false);//Hace que el formulario no se pueda redimensionar
        this.setVisible(true);
    }
}
