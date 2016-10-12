
package ejercicios;

import java.awt.HeadlessException;
import javax.swing.JFrame;
//Formulario con tamaño asignado por setSize
public class E07_Tamanio_setSize extends JFrame
{
    public static void main(String[] args)
    {
        new E07_Tamanio_setSize();
    }

    public E07_Tamanio_setSize() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,200);//Ancho, alto
        this.setVisible(true);
    }
    
    
}
