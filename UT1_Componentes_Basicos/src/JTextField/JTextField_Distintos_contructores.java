package JTextField;

import javax.swing.*;
import java.awt.*;

public class JTextField_Distintos_contructores extends JFrame
{

    //Componentes de la clase
    JTextField jtf1, jtf2, jtf3, jtf4;

    public static void main(String[] args)
    {
        new JTextField_Distintos_contructores();
    }

    public JTextField_Distintos_contructores()
    {
        super("Distintos contructores");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);
        
        FlowLayout admin = new FlowLayout();
        setLayout(admin);

        //Crear los 4 Campos de texto con diferentes constructores
        //sin nada, el contenido cambia al introducir texto
        jtf1 = new JTextField();
        this.add(jtf1);

        //Metiendo texto por defecto
        jtf2 = new JTextField("Texto por defecto");
        this.add(jtf2);

        //Metiendo ancho
        jtf3 = new JTextField(5);
        this.add(jtf3);

        //Metiendo texto por defecto y ancho
        jtf4 = new JTextField("Texto por defecto",5);
        this.add(jtf4);

        this.pack();
        this.setVisible(true);

    }

}
