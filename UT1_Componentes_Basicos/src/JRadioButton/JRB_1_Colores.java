package JRadioButton;

import javax.swing.*;
import java.awt.*;

public class JRB_1_Colores extends JFrame
{

    public static void main(String[] args)
    {
       new JRB_1_Colores();
    }

    public JRB_1_Colores()
    {
        super("Colores");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout admin = new FlowLayout();
        setLayout(admin);
        
        JLabel lblColores = new JLabel("Escoge un color:");
        this.add(lblColores);
        
        ButtonGroup grpColores = new ButtonGroup();
        
        JRadioButton rbVerde = new JRadioButton("Verde", false);
        grpColores.add(rbVerde);
        
        JRadioButton rbAzul = new JRadioButton("Azul", false);
        grpColores.add(rbAzul);
        
        JRadioButton rbRojo = new JRadioButton("Rojo", false);
        grpColores.add(rbRojo);
        
        JRadioButton rbAmarillo = new JRadioButton("Amarillo", true);
        grpColores.add(rbAmarillo);
        
        add(rbVerde);
        add(rbAzul);
        add(rbRojo);
        add(rbAmarillo);
        
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }

}
