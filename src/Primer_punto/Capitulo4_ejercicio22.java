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

public class Capitulo4_ejercicio22 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtSalario;
	private JTextField txtHoras;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo4_ejercicio22 frame = new Capitulo4_ejercicio22();
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
	public Capitulo4_ejercicio22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("EMPLEADO");
		setResizable(false);	
	}

	private void iniciarComponentes() {

		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 11, 252, 29);
		contentPane.add(lblNewLabel);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(88, 16, 310, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblSalariohora = new JLabel("Salario/hora");
		lblSalariohora.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		lblSalariohora.setBounds(10, 51, 252, 29);
		contentPane.add(lblSalariohora);
		
		txtSalario = new JTextField();
		txtSalario.setBounds(136, 56, 262, 20);
		contentPane.add(txtSalario);
		txtSalario.setColumns(10);
		
		JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas");
		lblHorasTrabajadas.setFont(new Font("Copperplate Gothic Bold", Font.ITALIC, 15));
		lblHorasTrabajadas.setBounds(10, 95, 252, 29);
		contentPane.add(lblHorasTrabajadas);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(172, 100, 225, 20);
		contentPane.add(txtHoras);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setFont(new Font("Algerian", Font.ITALIC, 14));
		btnCalcular.setBounds(114, 149, 161, 56);
		contentPane.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCalcular==e.getSource()) {
			int hora, horasTrabajadas;
			String nombre;
			hora=Integer.parseInt(txtSalario.getText());
			horasTrabajadas=Integer.parseInt(txtHoras.getText());
			nombre=txtNombre.getText();
			JOptionPane.showMessageDialog(null, "El nombre del trabajador es: "+nombre);
			if(horasTrabajadas*hora > 450000){
				JOptionPane.showMessageDialog(null, "Y su salario mensual es: "+ horasTrabajadas*hora);
			}
			
			

			
		}
		
		
	}

}
