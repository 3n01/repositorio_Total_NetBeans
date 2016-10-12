package ejercicios;

import javax.swing.JButton;
import javax.swing.JFrame;

public class E20_Boton_Bocadillo_Informacion extends JFrame
{
    JButton btn;
    
    public static void main(String[] args)
    {
        new E20_Boton_Bocadillo_Informacion();
    }

    public E20_Boton_Bocadillo_Informacion()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        btn=new JButton("Push");
        btn.setToolTipText("Este bocadillo es informativo");
        this.add(btn);
        
        
        this.pack();
        this.setVisible(true);
    }
    
    
}
