package JFrame;

import javax.swing.*;
import java.awt.*;

public class JFrame6_Icono_Barra_Tit extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame6_Icono_Barra_Tit obj = new JFrame6_Icono_Barra_Tit();
    }

    //Constructor
    public JFrame6_Icono_Barra_Tit() {
        super();
        setTitle("Icono ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(40, 40, 400, 400);//Localización, tamaño
        setExtendedState(JFrame.ICONIFIED);
     
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("..\\Recursos\\icono.jpg"));
        setIconImage(icon);
   
      /*  Toolkit pantalla = Toolkit.getDefaultToolkit();*/

    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
