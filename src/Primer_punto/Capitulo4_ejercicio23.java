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

import javax.swing.JTextField;
import javax.swing.JButton;

public class Capitulo4_ejercicio23 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo4_ejercicio23 frame = new Capitulo4_ejercicio23();
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
	public Capitulo4_ejercicio23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("Buscar X");
		setResizable(false);
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("una ecuacion de 2do grado: Ax^2+Bx+C");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(32, 11, 325, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("A");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 71, 35, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("B");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(10, 109, 35, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("C");
		lblNewLabel_1_2.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(10, 152, 35, 14);
		contentPane.add(lblNewLabel_1_2);
		
		txtA = new JTextField();
		txtA.setBounds(32, 70, 140, 20);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(32, 108, 140, 20);
		contentPane.add(txtB);
		
		txtC = new JTextField();
		txtC.setColumns(10);
		txtC.setBounds(32, 146, 140, 20);
		contentPane.add(txtC);
		

		btnCalcular = new JButton("Calcular X");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(237, 83, 114, 42);
		contentPane.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCalcular==e.getSource()) {
			double A,B,C;
			A=Double.parseDouble(txtA.getText());
			B=Double.parseDouble(txtB.getText());
			C=Double.parseDouble(txtC.getText());
			double raiz=(B*B)-4*A*C;
			if(raiz>0) {
				double x1=((-B+Math.sqrt(raiz))/(2*A));
				double x2=((-B-Math.sqrt(raiz))/(2*A));
				JOptionPane.showMessageDialog(null,"La ecuación tiene dos soluciones: " + x1 + " y " +x2);
				}
				else if(raiz==0) {
				double x=-B/(2*A);
				JOptionPane.showMessageDialog(null, "La ecuación tiene una solución: " + x);
				}
				else {
					JOptionPane.showMessageDialog(null, "La ecuación tiene no tiene solución real ");

			
			
		}
		
	}

}
	}
