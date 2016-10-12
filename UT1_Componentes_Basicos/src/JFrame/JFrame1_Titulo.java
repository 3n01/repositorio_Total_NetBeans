package JFrame;

import javax.swing.*;

public class JFrame1_Titulo extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame1_Titulo obj=new JFrame1_Titulo();
    }
    
    //Constructor
    public JFrame1_Titulo()
    {
        super();
        setTitle("Solo título");//Título
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
