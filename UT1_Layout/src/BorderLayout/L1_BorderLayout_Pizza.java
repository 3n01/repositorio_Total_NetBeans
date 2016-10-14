
package BorderLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class L1_BorderLayout_Pizza extends JFrame implements ActionListener,ChangeListener
{
    //Variables
    BorderLayout bl;
    JCheckBox cbAnchoas,cbCebolla,cbBacon,cbEspinacas,cbAceitunas,cbSalmon;
    

    public static void main(String[] args)
    {
        new L1_BorderLayout_Pizza();
    }

    public L1_BorderLayout_Pizza()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
