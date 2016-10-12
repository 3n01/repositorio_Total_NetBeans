package ejercicios;

import java.awt.FlowLayout;
import javax.swing.*;

public class E26_FlowLayout extends JFrame
{

    FlowLayout fl;
    JButton btn1, btn2;

    public static void main(String[] args)
    {
        new E26_FlowLayout(FlowLayout.CENTER,0,0);
        new E26_FlowLayout(FlowLayout.RIGHT,0,300);
        new E26_FlowLayout(FlowLayout.LEFT,600,300);
    }

    public E26_FlowLayout(int flowlayout, int x, int y)
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(x,y);
        this.setSize(400,200);

        //Sin el flow layout, solo se vería el segundo botón
        //Con pack se vería comprimido al segundo botón
        //Sin pack se vería el segundo botón expandodo por todo el formulario
        fl = new FlowLayout(flowlayout);
        this.setLayout(fl);

        btn1 = new JButton("Boton 1");
        this.add(btn1);

        btn2 = new JButton("Boton 2");
        this.add(btn2);


        this.setVisible(true);
    }

}
