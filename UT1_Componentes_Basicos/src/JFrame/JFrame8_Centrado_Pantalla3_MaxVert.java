package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame8_Centrado_Pantalla3_MaxVert extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame8_Centrado_Pantalla3_MaxVert obj = new JFrame8_Centrado_Pantalla3_MaxVert();
    }

    //Constructor
    public JFrame8_Centrado_Pantalla3_MaxVert() {
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
        
        setBounds(anchoPantalla/4, 0, anchoPantalla/2, altoPantalla);//Localización, tamaño
                
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
