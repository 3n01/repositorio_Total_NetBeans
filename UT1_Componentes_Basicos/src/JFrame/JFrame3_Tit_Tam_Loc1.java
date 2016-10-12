package JFrame;

import javax.swing.*;

public class JFrame3_Tit_Tam_Loc1 extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame3_Tit_Tam_Loc1 obj=new JFrame3_Tit_Tam_Loc1();
    }
    
    //Constructor
    public JFrame3_Tit_Tam_Loc1()
    {
        super();
        setTitle("Título, tamaño y localización");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);//Tamaño
        setLocation(400,400);
        
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}

