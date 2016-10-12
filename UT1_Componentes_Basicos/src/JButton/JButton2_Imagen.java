package JButton;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class JButton2_Imagen extends JFrame
{

    //Método principal
    public static void main(String[] args)
    {
        JButton2_Imagen obj = new JButton2_Imagen();
    }

    //Constructor
    public JButton2_Imagen()
    {
        super("Botón con imagen");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40, 40, 400, 400);//Localización, tamaño
        setResizable(false);

        //Icono para la aplicación
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icon = pantalla.getImage(getClass().getResource("..\\Recursos\\icono.jpg"));
        setIconImage(icon);

        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon face = new ImageIcon(getClass().getResource("..\\Recursos\\icono.jpg"));

        //Añadir botón
        JButton btnBoton = new JButton(face);//Titulo
        btnBoton.setMnemonic(KeyEvent.VK_T); //Evento    
        btnBoton.setToolTipText("Botón con imagen");//Para que salga un avíso

        this.add(btnBoton);//Añadir el botón al formulario
        this.pack();//Ajustar al tamaño
        this.setLookAndFeel();
        this.setVisible(true);

    }

    //Método lookandfeel
    private void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e)
        {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto   
             */       
        }
    }

}
