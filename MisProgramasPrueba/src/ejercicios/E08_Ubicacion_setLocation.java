package ejercicios;

import javax.swing.*;

public class E08_Ubicacion_setLocation extends JFrame
{
    public static void main(String [] args)
    {
        new E08_Ubicacion_setLocation();
    }
    
    public E08_Ubicacion_setLocation()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(0,500);//x, y
        this.setVisible(true);
    }
}
