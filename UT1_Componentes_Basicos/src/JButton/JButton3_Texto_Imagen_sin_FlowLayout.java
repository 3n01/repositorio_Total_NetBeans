package JButton;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class JButton3_Texto_Imagen_sin_FlowLayout extends JFrame
{

    JButton btnImagen;
    JButton btnTexto;

    //Método principal
    public static void main(String[] args)
    {
        new JButton3_Texto_Imagen_sin_FlowLayout();
    }

    //Constructor
    public JButton3_Texto_Imagen_sin_FlowLayout()
    {

        super("Sin flowLayout, falta un botón");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);

        //Creamos un objeto ImageIcon con el nombre de la imagen
        ImageIcon face = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Añadimos los botones
        btnTexto = new JButton("Texto");
        btnTexto.setIcon(face);
        add(btnTexto);
        
        btnTexto = new JButton("Texto2");
        btnTexto.setIcon(face);
        add(btnTexto);

        //Tamaño y visible
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
        }
    }

}
