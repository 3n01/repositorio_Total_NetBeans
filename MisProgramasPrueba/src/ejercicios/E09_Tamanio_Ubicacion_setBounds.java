package ejercicios;
import javax.swing.*;

//Formulario que sitúa tamaño y localización con un solo método
//setLocation
public class E09_Tamanio_Ubicacion_setBounds extends JFrame
{
    public static void main (String [] args)
    {
        new E09_Tamanio_Ubicacion_setBounds();
    }
    
    public E09_Tamanio_Ubicacion_setBounds()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,300,800,200);//x, y, ancho, alto
        this.setVisible(true);
        
    }
}
