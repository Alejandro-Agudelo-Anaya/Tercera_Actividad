package Primer_punto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capitulo5_ejercicio41 extends JFrame implements ActionListener {
    private JTextField[] numerosTextField;
    private JButton encontrarButton;
    private JTextArea resultadoTextArea;

    public Capitulo5_ejercicio41(int cantidadNumeros) {
        // Crear ventana y paneles
        JFrame ventana = new JFrame("Encontrar mayor valor");
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelSuperior = new JPanel(new FlowLayout());
        JPanel panelCentral = new JPanel(new BorderLayout());

        // Crear elementos de la interfaz
        numerosTextField = new JTextField[cantidadNumeros];
        for (int i = 0; i < cantidadNumeros; i++) {
            numerosTextField[i] = new JTextField(10);
            panelSuperior.add(new JLabel("Número " + (i + 1) + ":"));
            panelSuperior.add(numerosTextField[i]);
        }
        encontrarButton = new JButton("Encontrar mayor valor");
        resultadoTextArea = new JTextArea(10, 20);

        // Agregar elementos a los paneles
        panelSuperior.add(encontrarButton);
        panelCentral.add(new JScrollPane(resultadoTextArea), BorderLayout.CENTER);

        // Agregar paneles a la ventana
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        ventana.add(panelPrincipal);

        // Configurar botón para escuchar evento de acción
        encontrarButton.addActionListener(this);

        // Configurar ventana
        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Obtener números ingresados en los campos de texto
        int[] numeros = new int[numerosTextField.length];
        for (int i = 0; i < numerosTextField.length; i++) {
            String numeroString = numerosTextField[i].getText();
            numeros[i] = Integer.parseInt(numeroString);
        }

        // Encontrar el mayor valor
        int mayor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        // Mostrar el resultado en el campo de texto
        resultadoTextArea.setText("El mayor valor es: " + mayor);
    }

    public static void main(String[] args) {
        new Capitulo5_ejercicio41(5);
    }
}
