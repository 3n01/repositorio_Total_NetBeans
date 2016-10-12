package GridLayout;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class GridLayout1_con_pack extends JFrame
{

    //Componentes
    JButton btnAsustarse;
    JButton btnNoAsustarse;
    JButton btnEcharCulpa;
    JButton btnAvisar;
    JButton btnSalvarse;

    //Método principal
    public static void main(String[] args)
    {
        GridLayout1_con_pack obj = new GridLayout1_con_pack();
    }

    //Constructor
    public GridLayout1_con_pack()
    {
        super("GridLayout con pack()");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);

        //Crear un icono para añadir a los botones
        ImageIcon imagen = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Añadir botón
        btnAsustarse = new JButton("Asustarse", imagen);//Titulo
        btnAsustarse.setVerticalTextPosition(JLabel.TOP);
        btnNoAsustarse = new JButton("No asustarse", imagen);//Titulo
        btnNoAsustarse.setVerticalTextPosition(SwingConstants.BOTTOM);
        btnNoAsustarse.setHorizontalTextPosition(SwingConstants.LEFT);
        btnEcharCulpa = new JButton("Echar la culpa", imagen);//Titulo
        btnEcharCulpa.setHorizontalTextPosition(JLabel.LEFT);
        btnAvisar = new JButton("Avisar", imagen);//Titulo
        btnSalvarse = new JButton("Salvarse", imagen);//Titulo

        GridLayout admin = new GridLayout(2, 3, 10, 10);//Numero de filas, columanas, distancia horizontal, distancia vertical
        this.setLayout(admin);

        // pack();//Ajustar al tamaño
        this.add(btnAsustarse);//Añadir el botón al formulario
        this.add(btnNoAsustarse);//Añadir el botón al formulario
        this.add(btnEcharCulpa);//Añadir el botón al formulario
        this.add(btnAvisar);//Añadir el botón al formulario
        this.add(btnSalvarse);//Añadir el botón al formulario

        this.pack();
        this.setLookAndFeel();
        this.setVisible(true);

    }

    //Método lookandfeel
    private void setLookAndFeel()
    {
        try
        {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e)
        {
        }
    }

}
