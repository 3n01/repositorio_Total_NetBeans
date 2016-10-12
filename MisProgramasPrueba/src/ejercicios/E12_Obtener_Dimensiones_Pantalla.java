package ejercicios;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class E12_Obtener_Dimensiones_Pantalla extends JFrame
{
    //Variables de la clase
    Toolkit pantalla;
    Dimension tamanioPantalla;
    int ancho, alto;
    
    public static void main(String[] args)
    {
        new E12_Obtener_Dimensiones_Pantalla();
    }

    public E12_Obtener_Dimensiones_Pantalla()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla=Toolkit.getDefaultToolkit();
        tamanioPantalla=pantalla.getScreenSize();//Obtiene los datos con el tamaño de al pantalla
        ancho=tamanioPantalla.width;
        alto=tamanioPantalla.height;
        this.setTitle("El ancho de la pantalla es "+ancho+" y el alto de la pantalla es "+alto);      
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    
}

