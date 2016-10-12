package ejercicios;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class E22_Etiqueta_Todas_Formas extends JFrame
{

    JLabel lab1, lab2, lab3, lab4;

    public static void main(String[] args)
    {
        new E22_Etiqueta_Todas_Formas();
    }

    public E22_Etiqueta_Todas_Formas()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300, 300);

        ImageIcon icono = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        lab1 = new JLabel("Etiqueta ");
        lab1.setBounds(0, 0, 150, 30);
        this.add(lab1);

        lab2 = new JLabel(icono);
        lab2.setBounds(0, 90, 150, 50);
        this.add(lab2);

        lab3 = new JLabel("Texto", icono, JLabel.CENTER);
        lab3.setBounds(0, 160, 150, 50);
        this.add(lab3);

        this.setVisible(true);
    }

}
