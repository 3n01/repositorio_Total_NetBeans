package JButton;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class JButton1_Solo_Texto extends JFrame {
    
    //Componentes del formulario
    JButton btnBoton;

    //Método principal
    public static void main(String[] args) {
        new JButton1_Solo_Texto();
    }

    //Constructor
    public JButton1_Solo_Texto() {
        super("Butón solo texto");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLocationRelativeTo(null);    
        this.setResizable(false);

        //Crear icono para la aplicación
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icon = pantalla.getImage(getClass().getResource("..\\Recursos\\icono.jpg"));
        setIconImage(icon);
        

        //Añadir botón
        this.btnBoton = new JButton("Botón");//Titulo
        // pack();//Ajustar al tamaño
        this.btnBoton.setBounds(0,0,100,30);
        this.add(btnBoton);//Añadir el botón al formulario
        this.pack();//Ajustar tamaño al tamaño del botón (se ha creado tamaño por defecto
        this.setVisible(true);

    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
