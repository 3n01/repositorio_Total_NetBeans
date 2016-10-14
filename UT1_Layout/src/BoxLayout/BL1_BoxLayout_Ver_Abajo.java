package BoxLayout;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BL1_BoxLayout_Ver_Abajo extends JFrame implements ActionListener, ChangeListener
{
    //Variables

    BoxLayout bl;
    JPanel pnl;
    JButton cbAsustarse, cbMedios, cbSalvarse, cbCulpa, cbNoAsustar;

    public static void main(String[] args)
    {
        new BL1_BoxLayout_Ver_Abajo();
    }

    public BL1_BoxLayout_Ver_Abajo() 
    {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0, 0, 400, 400);

        pnl = new JPanel();
        bl = new BoxLayout(pnl, BoxLayout.X_AXIS);
        pnl.setLayout(bl);

        cbAsustarse = new JButton("Asustarse");
        cbAsustarse.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        cbMedios = new JButton("Avisar medios");
        cbMedios.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        cbSalvarse = new JButton("Salvarse");
        cbSalvarse.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        cbCulpa = new JButton("Echar la culpa");
        cbCulpa.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        cbNoAsustar = new JButton("No asustarse");
        cbNoAsustar.setAlignmentX(Component.BOTTOM_ALIGNMENT);

        pnl.add(cbAsustarse);
        pnl.add(cbMedios);
        pnl.add(cbSalvarse);
        pnl.add(cbCulpa);
        pnl.add(cbNoAsustar);

        this.add(pnl);


        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changed(ObservableValue observable, Object oldValue, Object newValue)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


