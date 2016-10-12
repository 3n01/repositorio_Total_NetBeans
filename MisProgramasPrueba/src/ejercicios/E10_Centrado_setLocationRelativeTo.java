package ejercicios;
import javax.swing.*;
//Formulario que no se puede cambiar de tamaño
public class E10_Centrado_setLocationRelativeTo extends JFrame
{
    public static void main(String [] args)
    {
        new E10_Centrado_setLocationRelativeTo();
    }

    public E10_Centrado_setLocationRelativeTo()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);//Coloca el formulario en el centro
        this.setVisible(true);
    }
    
}
