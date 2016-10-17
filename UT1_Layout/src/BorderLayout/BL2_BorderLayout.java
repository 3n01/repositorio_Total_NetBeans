
package BorderLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class BL2_BorderLayout extends JFrame implements ActionListener,ChangeListener
{
    //Variables
    BorderLayout bl;
    JButton cbAsustarse,cbMedios,cbSalvarse,cbCulpa,cbNoAsustar;
    

    public static void main(String[] args)
    {
        new BL2_BorderLayout();
    }

    public BL2_BorderLayout()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        bl=new BorderLayout();
        this.setLayout(bl);
        
        cbAsustarse=new JButton("Asustarse");
        cbMedios=new JButton("Avisar medios");
        cbSalvarse=new JButton("Salvarse");
        cbCulpa=new JButton("Echar la culpa");
        cbNoAsustar=new JButton("No asustarse");
        
        this.add(cbAsustarse,BorderLayout.NORTH);
        this.add(cbMedios,BorderLayout.EAST);
        this.add(cbSalvarse,BorderLayout.CENTER);
        this.add(cbCulpa,BorderLayout.WEST);
        this.add(cbNoAsustar,BorderLayout.SOUTH);
        
        this.pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue)
    {
       
    }
    
    
    
}

