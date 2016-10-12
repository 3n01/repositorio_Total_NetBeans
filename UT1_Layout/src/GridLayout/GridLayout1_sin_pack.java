package GridLayout;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import java.awt.*;

public class GridLayout1_sin_pack extends JFrame
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
        GridLayout1_sin_pack obj = new GridLayout1_sin_pack();
    }

    //Constructor
    public GridLayout1_sin_pack()
    {
        super("GridLayout con pack()");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        //Crear un icono para añadir a los botones
        ImageIcon imagen = new ImageIcon(getClass().getResource("..\\Recursos\\iconoPeque.png"));

        //Añadir botón
        btnAsustarse = new JButton("Asustarse", imagen);//Titulo
        btnNoAsustarse = new JButton("No asustarse", imagen);//Titulo
        btnEcharCulpa = new JButton("Echar la culpa", imagen);//Titulo
        btnAvisar = new JButton("Avisar", imagen);//Titulo
        btnSalvarse = new JButton("Salvarse", imagen);//Titulo

        GridLayout admin = new GridLayout(2, 3, 10, 10);//Numero de filas, columanas, distancia horizontal, distancia vertical
        this.setLayout(admin);

        // pack();//Ajustar al tamaño
        add(btnAsustarse);//Añadir el botón al formulario
        add(btnNoAsustarse);//Añadir el botón al formulario
        add(btnEcharCulpa);//Añadir el botón al formulario
        add(btnAvisar);//Añadir el botón al formulario
        add(btnSalvarse);//Añadir el botón al formulario

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
