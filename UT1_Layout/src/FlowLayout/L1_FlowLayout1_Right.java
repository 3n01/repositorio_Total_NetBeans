package FlowLayout;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class L1_FlowLayout1_Right extends JFrame
{

    //Método principal
    public static void main(String[] args)
    {
        new L1_FlowLayout1_Right();
    }

    //Constructor
    public L1_FlowLayout1_Right()
    {
        super("Protocolo de crisis");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(400, 400);
        setLocationRelativeTo(null);

        //Añadir botón
        JButton btnAsustarse = new JButton("Asustarse");//Titulo
        JButton btnNoAsustarse = new JButton("No asustarse");//Titulo
        JButton btnEcharCulpa = new JButton("Echar la culpa");//Titulo
        JButton btnAvisar = new JButton("Avisar");//Titulo
        JButton btnSalvarse = new JButton("Salvarse");//Titulo

        FlowLayout admin = new FlowLayout(FlowLayout.RIGHT);
        setLayout(admin);

        //  pack();//Ajustar al tamaño
        add(btnAsustarse);//Añadir el botón al formulario
        add(btnNoAsustarse);//Añadir el botón al formulario
        add(btnEcharCulpa);//Añadir el botón al formulario
        add(btnAvisar);//Añadir el botón al formulario
        add(btnSalvarse);//Añadir el botón al formulario
        
        
     
        this.setLookAndFeel();
        this.setVisible(true);

    }

    //Método lookandfeel
    private void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e)
        {
        }
    }

}

