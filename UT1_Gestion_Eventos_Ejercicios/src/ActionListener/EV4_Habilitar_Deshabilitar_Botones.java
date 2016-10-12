package ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Clase que pasa texto de un textfiel  a otro
public class EV4_Habilitar_Deshabilitar_Botones extends JFrame implements ActionListener
{

    //Variables de la clase
    JButton btnIzquierda, btnDerecha, btnCentro;

    JPanel pnlEtiqueta, pnlBotones;

    public static void main(String[] args)
    {
        new EV4_Habilitar_Deshabilitar_Botones();
    }

    public EV4_Habilitar_Deshabilitar_Botones()
    {
        super("No ha sido pulsado ningún botón");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 700, 200);

        //Añadir GridLayout
        FlowLayout admin = new FlowLayout();
        this.setLayout(admin);

        //Botón izquierda
        ImageIcon imagen0 = new ImageIcon(getClass().getResource("..\\Recursos\\right.gif"));
        btnIzquierda = new JButton("Habilitar botón central", imagen0);
        btnIzquierda.setEnabled(false);
        btnIzquierda.setActionCommand("a");
        btnIzquierda.setHorizontalTextPosition(JLabel.LEFT);
        btnIzquierda.addActionListener(this);
        this.add(btnIzquierda);

        //Botón btnCentro
        //Crear una imagen para meter en un botón por ejemplo
        ImageIcon imagen1 = new ImageIcon(getClass().getResource("..\\Recursos\\middle.gif"));
        btnCentro = new JButton("Central", imagen1);
        btnCentro.setHorizontalTextPosition(JLabel.CENTER);
        btnCentro.setVerticalTextPosition(JLabel.BOTTOM);
        this.add(btnCentro);

        //Botón btnDerecha
        ImageIcon imagen2 = new ImageIcon(getClass().getResource("..\\Recursos\\left.gif"));

        btnDerecha = new JButton("Deshabilitar botón central", imagen2);
        btnDerecha.setActionCommand("c");
        btnDerecha.addActionListener(this);
        this.add(btnDerecha);

        //Hacer visible el formulario y ajustar el tamaño
        this.setVisible(true);
    }

    //Método sobreescrito 
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String modo = e.getActionCommand();

        switch (modo)
        {
            case "a":
                btnIzquierda.setEnabled(false);
                btnCentro.setEnabled(true);
                btnDerecha.setEnabled(true);
                break;

            case "c":
                btnIzquierda.setEnabled(true);
                btnCentro.setEnabled(false);
                btnDerecha.setEnabled(false);
                break;

        }

    }

}
