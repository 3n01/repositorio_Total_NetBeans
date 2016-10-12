package ejercicios;

import javax.swing.JFrame;

//Creación de un formulario visible, sin título ni tamaño ni localización
//Por defecto se ve arriba a la izquierda
public class E01_Visible extends JFrame
{

    public static void main(String[] args)
    {
        new E01_Visible();
    }

    public E01_Visible()
    {
        this.setVisible(true); //Hace que la apliación sea visible
    }

}
