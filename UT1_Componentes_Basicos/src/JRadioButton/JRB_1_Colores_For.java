package JRadioButton;

import javax.swing.*;
import java.awt.*;

public class JRB_1_Colores_For extends JFrame
{

    //Declaración de variables
    private JRadioButton[] colores = new JRadioButton[4];

    public static void main(String[] args)
    {
        new JRB_1_Colores_For();
    }

    public JRB_1_Colores_For()
    {
        super("Colores for");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout admin = new FlowLayout();
        setLayout(admin);

        JLabel lblColores = new JLabel("Escoge un color:");
        this.add(lblColores);
        
        ButtonGroup grpColores = new ButtonGroup();

        colores[0] = new JRadioButton("Verde", false);
        colores[1] = new JRadioButton("Azul", false);
        colores[2] = new JRadioButton("Rojo", false);
        colores[3] = new JRadioButton("Amarillo", true);
        
        for (int i = 0; i < colores.length; i++)
        {
            grpColores.add(colores[i]);
            this.add(colores[i]);
        }
        
        

        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

}
