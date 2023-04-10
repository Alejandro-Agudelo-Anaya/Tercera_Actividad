package Primer_punto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Capitulo3_punto19 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textLado;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo3_punto19 frame = new Capitulo3_punto19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Capitulo3_punto19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("Triangulo");
		setResizable(false);
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el valor del lado del traingulo(m)");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("MS Gothic", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 26, 397, 31);
		contentPane.add(lblNewLabel);
		
		textLado = new JTextField();
		textLado.setHorizontalAlignment(SwingConstants.CENTER);
		textLado.setBounds(10, 74, 374, 20);
		contentPane.add(textLado);
		textLado.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(160, 115, 89, 23);
		contentPane.add(btnCalcular);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (btnCalcular==e.getSource()) {
			
			double lado, perimetro, area, altura;
			lado=Double.parseDouble(textLado.getText());
			perimetro = lado*3;
			altura = (lado * Math.sqrt(3))/2;
			area = (lado*altura)/2 ;
			JOptionPane.showMessageDialog(null, "El perimetro es de "+ perimetro + " metros");
			JOptionPane.showMessageDialog(null, "La altura es de " + altura + " metros");
			JOptionPane.showMessageDialog(null, "El area es de " + area + " metros cuadrados");
			}
		}

}
