
package ejercicios;


import java.awt.HeadlessException;
import javax.swing.JFrame;
//Formulario con titulo creado por setTitle
public class E05_Titulo_setTitle extends JFrame
{

    public static void main(String[] args)
    {
        new E05_Titulo_setTitle();
    }

    public E05_Titulo_setTitle() 
    {
        this.setTitle("Titulo creado por setTitle");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    
    
}
