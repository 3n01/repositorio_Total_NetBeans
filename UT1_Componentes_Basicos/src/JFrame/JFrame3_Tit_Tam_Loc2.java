package JFrame;

import javax.swing.*;

public class JFrame3_Tit_Tam_Loc2 extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame3_Tit_Tam_Loc2 obj=new JFrame3_Tit_Tam_Loc2();
    }
    
    //Constructor
    public JFrame3_Tit_Tam_Loc2()
    {
        super();
        setTitle("Título y tamaño ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,400,400);//Localización, tamaño
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
