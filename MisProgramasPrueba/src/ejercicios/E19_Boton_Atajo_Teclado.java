package ejercicios;


import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

public class E19_Boton_Atajo_Teclado extends JFrame
{
    JButton btn1;
    
    public static void main (String [] args)
    {
        new E19_Boton_Atajo_Teclado();
    }
    

    public E19_Boton_Atajo_Teclado() 
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        btn1=new JButton("Push");
        ///////////////////////////////////////////////////////////////
        btn1.setMnemonic(KeyEvent.VK_P);//Permite que al pulsar la alt + p sea como clickear en el boton
        ///////////////////////////////////////////////////////////////////
        this.add(btn1);
        
        this.pack();
        this.setVisible(true);
    }
    
}
