package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Ventana {

	private JFrame frame;
	private JTextField txtPrimerNom;
	private JTextField txtSecondNombre;
	private JTextField txtPrimApellido;
	private JTextField txtSecondApellido;
	private JTextField txtNacimiento;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
		
		
	}
	
	void habilitar(){
		
	}
	
	void inabilitar(){
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.setBounds(100, 100, 350, 416);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPrimerNom = new JTextField();
		txtPrimerNom.setBackground(new Color(255, 255, 255));
		txtPrimerNom.setBounds(191, 73, 129, 20);
		frame.getContentPane().add(txtPrimerNom);
		txtPrimerNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Primer Apellido:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(29, 118, 141, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setForeground(new Color(255, 255, 255));
		lblSegundoApellido.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSegundoApellido.setBounds(22, 146, 148, 29);
		frame.getContentPane().add(lblSegundoApellido);
		
		JLabel lblPrimerNombre = new JLabel("Primer Nombre:");
		lblPrimerNombre.setForeground(new Color(255, 255, 255));
		lblPrimerNombre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPrimerNombre.setBounds(29, 67, 141, 29);
		frame.getContentPane().add(lblPrimerNombre);
		
		JLabel lblSegundoNombre = new JLabel("Segundo Nombre:");
		lblSegundoNombre.setForeground(new Color(255, 255, 255));
		lblSegundoNombre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSegundoNombre.setBounds(29, 92, 141, 29);
		frame.getContentPane().add(lblSegundoNombre);
		
		JLabel lblFNacimiento = new JLabel("F. Nacimiento:");
		lblFNacimiento.setForeground(new Color(255, 255, 255));
		lblFNacimiento.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFNacimiento.setBounds(50, 173, 120, 29);
		frame.getContentPane().add(lblFNacimiento);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblGenero.setBounds(99, 198, 71, 29);
		frame.getContentPane().add(lblGenero);
		
		txtSecondNombre = new JTextField();
		txtSecondNombre.setBounds(191, 98, 129, 20);
		frame.getContentPane().add(txtSecondNombre);
		txtSecondNombre.setColumns(10);
		
		txtPrimApellido = new JTextField();
		txtPrimApellido.setBounds(191, 124, 129, 20);
		frame.getContentPane().add(txtPrimApellido);
		txtPrimApellido.setColumns(10);
		
		txtSecondApellido = new JTextField();
		txtSecondApellido.setBounds(191, 152, 129, 20);
		frame.getContentPane().add(txtSecondApellido);
		txtSecondApellido.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setBounds(191, 179, 129, 20);
		frame.getContentPane().add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		JComboBox cboGenero = new JComboBox();
		cboGenero.setBounds(191, 204, 129, 20);
		cboGenero.addItem("M");
		cboGenero.addItem("F");
		frame.getContentPane().add(cboGenero);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(22, 238, 89, 23);
		frame.getContentPane().add(btnNuevo);
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(121, 238, 89, 23);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(225, 238, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(131, 272, 89, 23);
		frame.getContentPane().add(btnSalir);
		
		JLabel lblCapturaDeDatos = new JLabel("Captura de datos empleado");
		lblCapturaDeDatos.setForeground(new Color(64, 224, 208));
		lblCapturaDeDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCapturaDeDatos.setBounds(69, 11, 210, 34);
		frame.getContentPane().add(lblCapturaDeDatos);
	}
}
