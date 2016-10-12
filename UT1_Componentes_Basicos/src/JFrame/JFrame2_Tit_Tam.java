package JFrame;

import javax.swing.*;

public class JFrame2_Tit_Tam extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame2_Tit_Tam obj=new JFrame2_Tit_Tam();
    }
    
    //Constructor
    public JFrame2_Tit_Tam()
    {
        super();
        setTitle("Título y tamaño ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);//Tamaño
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
