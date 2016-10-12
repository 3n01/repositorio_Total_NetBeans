package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV1_ActionListener_Copiar_Valor_Entre_Campos_Texto extends JFrame implements ActionListener
{

    JButton btn1;
    JLabel lab1, lab2;
    JTextField tfd1,tfd2;

    public static void main(String[] args)
    {
        new EV1_ActionListener_Copiar_Valor_Entre_Campos_Texto();
    }

    public EV1_ActionListener_Copiar_Valor_Entre_Campos_Texto()
    {
        super("Formulario con evento 2");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 200, 200);
        
        //Añadir FlowLayout
        FlowLayout admin=new FlowLayout();
        this.setLayout(admin);
        
        //Label 1 avisando de contenido 1
        lab1=new JLabel("Original");
        this.add(lab1);
        //TextField 1 contiene contenido 1
        tfd1=new JTextField(10);
        this.add(tfd1);

        //Botón conversor
        btn1 = new JButton("Copiar");
        btn1.addActionListener(this);
        this.add(btn1);
        
        //Label 2 avisando de contenido 2
        lab2=new JLabel("Copia");
        this.add(lab2);
        
        //TextField 2 contiene contenido convertido
        tfd2=new JTextField(10);
        tfd2.setEditable(false);//para que esté readonly
        this.add(tfd2);
        
        this.pack();
        this.setVisible(true);
    }

 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btn1)
        {
            tfd2.setText(tfd1.getText());
        }

    }

}
