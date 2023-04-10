package Primer_punto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class Capitulo4_ejercicio10 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtInscipcion;
	private JTextField txtNombre;
	private JTextField txtPatrimonio;
	private JTextField txtEstracto;
	JButton btnCalcula;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo4_ejercicio10 frame = new Capitulo4_ejercicio10();
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
	public Capitulo4_ejercicio10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("Matricula");
		setResizable(false);
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 204, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero de inscripcion");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(97, 11, 209, 14);
		contentPane.add(lblNewLabel);
		
		txtInscipcion = new JTextField();
		txtInscipcion.setForeground(new Color(0, 0, 51));
		txtInscipcion.setBounds(107, 36, 199, 20);
		contentPane.add(txtInscipcion);
		txtInscipcion.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNombre.setBounds(97, 62, 209, 14);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(107, 87, 199, 20);
		contentPane.add(txtNombre);
		
		JLabel lblPatrimonio = new JLabel("Patrimonio");
		lblPatrimonio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPatrimonio.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblPatrimonio.setBounds(97, 118, 209, 14);
		contentPane.add(lblPatrimonio);
		
		txtPatrimonio = new JTextField();
		txtPatrimonio.setColumns(10);
		txtPatrimonio.setBounds(107, 143, 199, 20);
		contentPane.add(txtPatrimonio);
		
		JLabel lblEstracto = new JLabel("Estracto");
		lblEstracto.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstracto.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblEstracto.setBounds(97, 174, 209, 14);
		contentPane.add(lblEstracto);
		
		txtEstracto = new JTextField();
		txtEstracto.setColumns(10);
		txtEstracto.setBounds(141, 199, 126, 20);
		contentPane.add(txtEstracto);
		
		btnCalcula = new JButton("Calcular");
		btnCalcula.addActionListener(this);
		btnCalcula.setBounds(178, 230, 89, 23);
		contentPane.add(btnCalcula);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCalcula==e.getSource()) {
			int numeroinsc,estracto;
			double patrimonio,pago;
			String nombre;
			numeroinsc=Integer.parseInt(txtInscipcion.getText());
			estracto=Integer.parseInt(txtEstracto.getText());
			patrimonio=Double.parseDouble(txtPatrimonio.getText());
			nombre=txtNombre.getText();
			if(patrimonio>2000000 && estracto>3 ) {
				pago=50000+0.03*patrimonio;
				}
				else {
				pago=50000;
				}
		JOptionPane.showMessageDialog(null,"EL ESTUDIANTE CON NUMERO DE INSCRIPCION "+ 
					numeroinsc+" Y NOMBRE "+nombre+" DEBE PAGAR "+pago);

			
			
			
		}
		
	}

}
