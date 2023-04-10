package Primer_punto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Capitulo5_ejercicio40 extends JFrame implements ActionListener {
    private JTextField numeroTextField;
    private JButton raizButton;
    private JButton cuadradoButton;
    private JButton cuboButton;
    private JTextArea resultadoTextArea;

    public Capitulo5_ejercicio40() {
       
        JFrame ventana = new JFrame("Calculadora");
        
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        JPanel panelSuperior = new JPanel(new FlowLayout());
        JPanel panelCentral = new JPanel(new BorderLayout());
		
        numeroTextField = new JTextField(10);
        raizButton = new JButton("Raíz cuadrada");
        cuadradoButton = new JButton("Cuadrado");
        cuboButton = new JButton("Cubo");
        resultadoTextArea = new JTextArea(10, 20);

        panelSuperior.add(new JLabel("Número:"));
        panelSuperior.add(numeroTextField);
        panelSuperior.add(raizButton);
        panelSuperior.add(cuadradoButton);
        panelSuperior.add(cuboButton);
        panelCentral.add(new JScrollPane(resultadoTextArea), BorderLayout.CENTER);

        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        ventana.add(panelPrincipal);

        raizButton.addActionListener(this);
        cuadradoButton.addActionListener(this);
        cuboButton.addActionListener(this);

        ventana.setSize(400, 300);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numeroString = numeroTextField.getText();
        int numero = Integer.parseInt(numeroString);

        if (e.getSource() == raizButton) {
            double raiz = Math.sqrt(numero);
            resultadoTextArea.append("La raíz cuadrada de " + numero + " es " + raiz + "\n");
        } else if (e.getSource() == cuadradoButton) {
            int cuadrado = numero * numero;
            resultadoTextArea.append("El cuadrado de " + numero + " es " + cuadrado + "\n");
        } else if (e.getSource() == cuboButton) {
            int cubo = numero * numero * numero;
            resultadoTextArea.append("El cubo de " + numero + " es " + cubo + "\n");
        }

        numeroTextField.setText("");
    }

    public static void main(String[] args) {
        new Capitulo5_ejercicio40();
    }
}