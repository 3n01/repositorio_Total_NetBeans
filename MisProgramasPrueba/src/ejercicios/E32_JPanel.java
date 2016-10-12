package ejercicios;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class E32_JPanel extends JFrame
{

    //Declaración de variables
    GridLayout gl;
    JPanel pnl;
    JButton btn;

    public static void main(String[] args)
    {
        new E32_JPanel();
    }

    public E32_JPanel()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 400);

        gl = new GridLayout(3, 1);
        this.setLayout(gl);

        pnl = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        pnl.add(btn = new JButton("Boton 1"));
        this.add(pnl);

        pnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        pnl.add(btn = new JButton("Boton 2"));
        this.add(pnl);

//        pnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
//        pnl.add(btn = new JButton("Boton 3"));
//        this.add(pnl);
        pnl = new JPanel(gl);
        pnl.add(btn = new JButton("Boton 3"));
        this.add(pnl);

        this.setVisible(true);
    }

}
