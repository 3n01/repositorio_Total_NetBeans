package ejercicios;
import javax.swing.*;
import java.awt.*;

public class E15_Boton_Formulario_Comprimido_A_Boton extends JFrame
{
    JButton btnBoton;
    
    public static void main(String[] args)
    {
        new E15_Boton_Formulario_Comprimido_A_Boton();
    }

    public E15_Boton_Formulario_Comprimido_A_Boton()
    {
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setLocationRelativeTo(null);
       //Crear el botón
       btnBoton=new JButton("Texto del botón");
       this.add(btnBoton);
       this.pack();//El método pack hace que el formulario se ajuste al tamaño del botón
       this.setVisible(true);
    }
    
    
}
