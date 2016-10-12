
package ejercicios;
//Formulario visible, aparece minimizado

import javax.swing.JFrame;

public class E02_Minimizado extends JFrame
{

    public static void main(String[] args)
    {
        new E02_Minimizado();
    }
    
    public E02_Minimizado()
    {
        this.setVisible(true);
        this.setExtendedState(JFrame.ICONIFIED);
    }
    
}
