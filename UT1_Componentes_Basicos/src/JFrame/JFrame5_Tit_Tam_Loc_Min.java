package JFrame;

import javax.swing.*;

public class JFrame5_Tit_Tam_Loc_Min extends JFrame {

    //Método principal
    public static void main(String[] args) {
        JFrame5_Tit_Tam_Loc_Min obj=new JFrame5_Tit_Tam_Loc_Min();
    }
    
    //Constructor
    public JFrame5_Tit_Tam_Loc_Min()
    {
        super();
        setTitle("Título y tamaño, localización y maximizado ");
        setVisible(true);
        setLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,400,400);//Localización, tamaño
        //////FALTA UN MÉTODO //////////////////////////////////////////
        setExtendedState(JFrame.ICONIFIED);
    }

    //Método lookandfeel
    private void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            /* Ignoramos el error. Si no tenemos instalado Nimbus se mostrará el Look & Feel por defecto             */        }
    }

}


