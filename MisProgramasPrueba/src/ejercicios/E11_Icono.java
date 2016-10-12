package ejercicios;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;

public class E11_Icono extends JFrame
{
    //Variables de la clase
    Image img;
    Toolkit pantalla;
    
    public static void main(String[] args)
    {
        new E11_Icono();
    }

    public E11_Icono()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla=Toolkit.getDefaultToolkit();//Obtiene un objeto relacionado con la pantalla
        img=pantalla.getImage(getClass().getResource("..\\Recursos\\iconoPeque.png"));//Crea objeto imagen
        this.setIconImage(img);//Coloca el icono de la aplicación
        
        this.setVisible(true);
    }
    
    
}
