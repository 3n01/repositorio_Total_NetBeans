package JFrame;

import javax.swing.*;

public class JFrame4_Tit_Tam_Loc_Red extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame4_Tit_Tam_Loc_Red obj=new JFrame4_Tit_Tam_Loc_Red();
    }
    
    //Constructor
    public JFrame4_Tit_Tam_Loc_Red()
    {
        super();
        setTitle("Título y tamaño, localización y no reducir ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,400,400);//Localización, tamaño
        setResizable(false);
        
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}
