package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame8_Centrado_Pantalla1 extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame8_Centrado_Pantalla1 obj = new JFrame8_Centrado_Pantalla1();
    }

    //Constructor
    public JFrame8_Centrado_Pantalla1() {
        super();
        setTitle("Icono ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40, 40, 400, 400);//Localización, tamaño

        setResizable(false);
        
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icon = pantalla.getImage(getClass().getResource("..\\Recursos\\icono.jpg"));
        setIconImage(icon);
        
        Dimension screenSize=pantalla.getScreenSize();//Obtener el tamaño de la pantalla
        int anchoPantalla=screenSize.width;
        int altoPantalla=screenSize.height;
        
        setLocationRelativeTo(null);//Centrado en pantalla
        
        
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
