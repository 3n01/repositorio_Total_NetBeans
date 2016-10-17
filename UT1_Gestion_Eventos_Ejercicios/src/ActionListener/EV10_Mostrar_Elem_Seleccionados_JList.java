package ActionListener;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class EV10_Mostrar_Elem_Seleccionados_JList extends JFrame implements ActionListener
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
    
     //Añadir JList
    private   JList lista = new JList(modulos);
    
      //Crear el textbox
    private    JTextField cuadroTexto=new JTextField();

    public static void main(String[] args)
    {
        new EV10_Mostrar_Elem_Seleccionados_JList();
    }

    public EV10_Mostrar_Elem_Seleccionados_JList()
    {
        super("Modulos");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout borlay=new BorderLayout();
        this.setLayout(borlay);
        
        this.norte();
        this.centro();
        this.sur();
        
        //Aspecto
        this.pack();
        this.setVisible(true);
    }
    
    private void norte()
    {
        
         //Crear el panel
        JPanel panel = new JPanel();
        //Añadir etiqueta
        JLabel lab = new JLabel("Módulos");
        panel.add(lab);
          
        
        lista.setVisibleRowCount(8);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        

        //Añadir scroller
        JScrollPane scroller = new JScrollPane(lista);
        panel.add(scroller);
                //Añadir el panel al formulario
        this.add(panel,BorderLayout.NORTH);
        
    }
    
    private void centro()
    {
                 //Crear el panel
        JPanel panel = new JPanel();
        //bOTON
        JButton boton=new JButton("Pulse para visualizar el módulo");
        boton.addActionListener(this);
        panel.add(boton);
        
        //Añadir el panel al formulario
        this.add(panel,BorderLayout.CENTER);
    }
    
    private void sur()
    {  
        //Añadir el panel al formulario
        this.add(cuadroTexto,BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if (lista.getSelectedIndex()==-1)
        {
            cuadroTexto.setText("No se ha seleccionado ningún módulo");
        }
        else
        {
            cuadroTexto.setText("Se ha seleccionado "+lista.getSelectedValue().toString());
        }
    }

}

