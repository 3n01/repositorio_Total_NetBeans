
package ejercicios;

import java.awt.HeadlessException;
import javax.swing.JFrame;
//Formulario que pone el título mediante el constructor padre (super())
public class E06_Titulo_super extends JFrame
{
    public static void main(String[] args)
    {
        new E06_Titulo_super();
    }

    public E06_Titulo_super()
    {
        super("Titulo generado con el constructor padre");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }
    

}
