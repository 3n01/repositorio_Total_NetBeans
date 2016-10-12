
package ejercicios;
//Formulario que aparece maximizado al inicio

import javax.swing.JFrame;

public class E03_Maximizado extends JFrame
{

    public static void main(String[] args)
    {
        new E03_Maximizado();
        
    }
    
    public E03_Maximizado()
    {
        this.setVisible(true);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}
