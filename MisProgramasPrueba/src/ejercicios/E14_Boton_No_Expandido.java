package ejercicios;

import javax.swing.JButton;
import javax.swing.JFrame;

public class E14_Boton_No_Expandido extends JFrame
{

    JButton btnBoton;

    public static void main(String[] args)
    {
        new E14_Boton_No_Expandido();
    }

    public E14_Boton_No_Expandido()
    {
        this.setLayout(null);//Elimina el layout para que no expandan los elementos
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        
        btnBoton = new JButton("Texto del botón");
        btnBoton.setBounds(0, 0, 150, 30);
        this.add(btnBoton);

        this.setVisible(true);
    }

}
