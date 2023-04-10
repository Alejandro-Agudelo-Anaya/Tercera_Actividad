package Primer_punto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Capitulo4_ejercicio7 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textNum1;
	private JTextField textNum2;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo4_ejercicio7 frame = new Capitulo4_ejercicio7();
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
	public Capitulo4_ejercicio7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("Mayor o Menor");
		setResizable(false);
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese un numero:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 46, 172, 14);
		contentPane.add(lblNewLabel);
		
		textNum1 = new JTextField();
		textNum1.setBounds(10, 71, 166, 20);
		contentPane.add(textNum1);
		textNum1.setColumns(10);
		
		JLabel lblIngreseUnSegundo = new JLabel("Ingrese un  numero:");
		lblIngreseUnSegundo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIngreseUnSegundo.setBounds(10, 116, 230, 14);
		contentPane.add(lblIngreseUnSegundo);
		
		textNum2 = new JTextField();
		textNum2.setColumns(10);
		textNum2.setBounds(10, 130, 166, 20);
		contentPane.add(textNum2);
		
		JLabel lblNewLabel_1 = new JLabel("\u00BFque numero es mayor?");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel_1.setBackground(Color.RED);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(72, 11, 237, 24);
		contentPane.add(lblNewLabel_1);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		btnCalcular.setBounds(250, 82, 111, 41);
		contentPane.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCalcular==e.getSource()) {
			double A,B;
			A=Double.parseDouble(textNum1.getText());
			B=Double.parseDouble(textNum2.getText());
			if(A>B) {
				JOptionPane.showMessageDialog(null, "el numero "+A+" es mayor");
				}
				else if(A<B) {
					JOptionPane.showMessageDialog(null, "el numero "+B+" es mayor");
				}
				else {
					JOptionPane.showMessageDialog(null, "los numeros son iguales");

			
		}
		
	}

}
	}
