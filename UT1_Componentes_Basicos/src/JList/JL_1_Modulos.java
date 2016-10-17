package JList;

import javax.swing.*;


public class JL_1_Modulos extends JFrame
{

    private String[] modulos =
    {
        "Sistemas de Gestión Empresarial",
        "Desarrollo de Interfaces",
        "Acceso a datos",
        "Desarrollo de interfaces",
        "Programación multimedia y dispositivos móviles",
        "Programación de servicios y procesos",
        "Formación y orientación laboral"
    };

    public static void main(String[] args)
    {
        new JL_1_Modulos();
    }

    public JL_1_Modulos()
    {
        super("Modulos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Crear el panel
        JPanel panel = new JPanel();

        //Añadir etiqueta
        JLabel lab = new JLabel("Módulos");
        panel.add(lab);

        //Añadir JList
        JList lista = new JList(modulos);
        lista.setSelectedIndex(2);
        lista.setVisibleRowCount(5);

        //Añadir scroller
        JScrollPane scroller = new JScrollPane(lista);
        panel.add(scroller);
        
        //Añadir el panel al formulario
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }

}
