package Primer_punto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Capitulo3_punto18 extends JFrame implements ActionListener {

	private JPanel panelPrincipal;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtHoras;
	private JTextField txtValor;
	private JTextField txtrete;
	JButton btnCalcular;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Capitulo3_punto18 frame = new Capitulo3_punto18();
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
	public Capitulo3_punto18() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		iniciarComponentes();	
		setLocationRelativeTo(null);
		setTitle("Salario empleado");
		setResizable(false);
		
		
	}

	private void iniciarComponentes() {
		setBounds(100, 100, 450, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		
		JLabel lblEmpleado = new JLabel("Nombre");
		lblEmpleado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblEmpleado.setBounds(10, 0, 148, 14);
		panelPrincipal.add(lblEmpleado);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 11, 213, 20);
		panelPrincipal.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblCodigoDelElpleado = new JLabel("Codigo del empleado");
		lblCodigoDelElpleado.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCodigoDelElpleado.setBounds(10, 42, 148, 14);
		panelPrincipal.add(lblCodigoDelElpleado);
		
		txtCodigo = new JTextField();
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(10, 58, 213, 20);
		panelPrincipal.add(txtCodigo);
		
		JLabel lblHorasTrabajadas = new JLabel("Horas trabajadas");
		lblHorasTrabajadas.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHorasTrabajadas.setBounds(10, 89, 148, 14);
		panelPrincipal.add(lblHorasTrabajadas);
		
		txtHoras = new JTextField();
		txtHoras.setColumns(10);
		txtHoras.setBounds(10, 114, 213, 20);
		panelPrincipal.add(txtHoras);
		
		JLabel lblValorDeLa = new JLabel("Valor de la hora");
		lblValorDeLa.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblValorDeLa.setBounds(10, 145, 148, 14);
		panelPrincipal.add(lblValorDeLa);
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		txtValor.setBounds(10, 170, 213, 20);
		panelPrincipal.add(txtValor);
		
		JLabel lblPorcentajeRetefuentes = new JLabel("Porcentaje rete-fuentes");
		lblPorcentajeRetefuentes.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPorcentajeRetefuentes.setBounds(10, 200, 148, 14);
		panelPrincipal.add(lblPorcentajeRetefuentes);
		
		txtrete = new JTextField();
		txtrete.setColumns(10);
		txtrete.setBounds(10, 225, 213, 20);
		panelPrincipal.add(txtrete);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
	
		btnCalcular.setBounds(293, 86, 89, 23);
		panelPrincipal.add(btnCalcular);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (btnCalcular==e.getSource()) {
			double horastraba,valorhora,retefuentes;
			int codigoE;
			String nombre;
			nombre=txtNombre.getText();
			codigoE=Integer.parseInt(txtCodigo.getText());
			horastraba=Double.parseDouble(txtHoras.getText());
			retefuentes=Double.parseDouble(txtrete.getText());
			valorhora=Double.parseDouble(txtValor.getText());
			double salariobruto=horastraba*valorhora;
			double retiene=(retefuentes*salariobruto)/100;
			double salarioneto=salariobruto-retiene;
			
			JOptionPane.showMessageDialog(null, "El empleado "+nombre+" con codigo "+codigoE+" tiene un salario bruto de: "+salariobruto+" y su salario neto es :"+salarioneto);
			
		}
	}
}
