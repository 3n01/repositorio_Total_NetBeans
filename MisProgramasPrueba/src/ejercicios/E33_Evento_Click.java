package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class E33_Evento_Click extends JFrame implements ActionListener
{
    //Declaración de variables
    JButton btn;
    JPanel pnl;
    public static void main(String[] args)
    {
        new E33_Evento_Click();
    }

    public E33_Evento_Click()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,400,200);
    
        btn=new JButton("Botón 1");       
        btn.addActionListener(this);
        
        pnl=new JPanel();     
        pnl.add(btn);
        this.add(pnl);
  
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        this.setTitle("Welcome to the Disco");
    }
    
}
