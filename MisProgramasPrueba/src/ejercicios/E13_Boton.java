package ejercicios;

import javax.swing.JButton;
import javax.swing.JFrame;

public class E13_Boton extends JFrame
{

    //Crear un botón
    JButton btnBoton;

    public static void main(String[] args)
    {
        new E13_Boton();
    }

    public E13_Boton()
    {
        super("Sin flowlayout(null) el botón se expande a toda la pantalla");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);

        //Instanciar el botón, ocupa toda la pantalla
        btnBoton = new JButton("Texto del botón");
        this.add(btnBoton);
 
        this.setVisible(true);

    }

}
