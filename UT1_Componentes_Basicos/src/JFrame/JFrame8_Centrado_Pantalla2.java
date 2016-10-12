package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame8_Centrado_Pantalla2 extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame8_Centrado_Pantalla2 obj = new JFrame8_Centrado_Pantalla2();
    }

    //Constructor
    public JFrame8_Centrado_Pantalla2() {
        super();
        setTitle("Icono ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        setResizable(false);
        
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Image icon = pantalla.getImage(getClass().getResource("..\\Recursos\\icono.jpg"));
        setIconImage(icon);
        
        Dimension screenSize=pantalla.getScreenSize();//Obtener el tamaño de la pantalla
        int anchoPantalla=screenSize.width;
        int altoPantalla=screenSize.height;
        
        setBounds(anchoPantalla /4, altoPantalla/4, anchoPantalla/2, altoPantalla/2);//Localización, tamaño
                
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
