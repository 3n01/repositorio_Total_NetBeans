package ActionListener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class EV9_CKB_Ingredientes_Pizza extends JFrame implements ActionListener
{

    //Variables
    JButton btn;
    FlowLayout fl;
    BorderLayout bl;
    GridLayout gl;
    BoxLayout bxl;
    Border border;
    JPanel pnl;
    JLabel lab;
    JTextField tf = new JTextField(30);
    JCheckBox cbAnchoas, cbCebolla, cbBacon, cbEspinacas, cbAceitunas, cbSalmon;

    public static void main(String[] args)
    {
        EV9_CKB_Ingredientes_Pizza obj=new EV9_CKB_Ingredientes_Pizza();
//        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        obj.setVisible(true);
    }

    public EV9_CKB_Ingredientes_Pizza()
    {
        super("Pizzas");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 400, 300);
        bl = new BorderLayout();
        this.setLayout(bl);
        creaFila1();
        creaFila2();
        creaFila3();

        this.setVisible(true);

    }

    //Métodos que crean cada fila
    //Crea fila 1 
    private void creaFila1()
    {
        gl = new GridLayout(3, 1);
        border = BorderFactory.createTitledBorder("Ingredientes Pizza");

        pnl = new JPanel(gl);
        pnl.setBorder(border);
        pnl.add(cbAnchoas = new JCheckBox("Anchoas"));
        pnl.add(cbCebolla = new JCheckBox("Cebolla"));
        pnl.add(cbBacon = new JCheckBox("Bacon"));
        pnl.add(cbEspinacas = new JCheckBox("Espinacas"));
        pnl.add(cbAceitunas = new JCheckBox("Aceitunas"));
        pnl.add(cbSalmon = new JCheckBox("Salmon"));

        this.add(pnl, BorderLayout.NORTH);

    }

    //Crea fila 2 
    private void creaFila2()
    {
        fl = new FlowLayout(FlowLayout.CENTER);
        pnl = new JPanel(fl);
        btn = new JButton("PULSE PARA REALIZAR PEDIDO");
        btn.addActionListener(this);
        pnl.add(btn);
        this.add(pnl, BorderLayout.CENTER);

    }

    //Crea fila 3 
    private void creaFila3()
    {
        pnl = new JPanel();
        bxl = new BoxLayout(pnl, BoxLayout.Y_AXIS);
        pnl.setLayout(bxl);
        lab = new JLabel("Ingredientes pizza pedida");
        
        pnl.add(lab);
        pnl.add(tf);
        this.add(pnl, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        String cadena = "";
        if (cbAceitunas.isSelected())
        {
            cadena += "Aceitunas ";
        }
        if (cbAnchoas.isSelected())
        {
            cadena += "Anchoas ";
        }
        if (cbBacon.isSelected())
        {
            cadena += "Bacon ";
        }
        if (cbCebolla.isSelected())
        {
            cadena += "Cebolla ";
        }
        if (cbEspinacas.isSelected())
        {
            cadena += "Espinacas ";
        }
        if (cbSalmon.isSelected())
        {
            cadena += "Salmon ";
        }
        tf.setText(cadena);
        
    }

   

}
