
package ejercicios;
//Formulario que cierra la aplicación al cerrarse el propio formulario

import javax.swing.JFrame;

public class E04_Cierra_App_Al_Cerrar extends JFrame
{

    public static void main(String[] args)
    {
       new E04_Cierra_App_Al_Cerrar();
    }

    public E04_Cierra_App_Al_Cerrar()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }

  
    

}
