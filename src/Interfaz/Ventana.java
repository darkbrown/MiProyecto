package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;

import BaseDatos.ConexionMySQL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ventana {

	private JFrame frmSss;
	private JTextField txtPrimerNom;
	private JTextField txtSecondNombre;
	private JTextField txtPrimApellido;
	private JTextField txtSecondApellido;
	private JTextField txtNacimiento;
	@SuppressWarnings("rawtypes")
	private JComboBox cboGenero;
	private JButton btnGuardar;
	private JButton btnNuevo;
	private JButton btnCancelar;
	private JButton btnSalir;
	private JLabel lblAaaammdd;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frmSss.setLocationRelativeTo(null);
					window.frmSss.setVisible(true);
					
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
		inhabilitar();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSss = new JFrame();
		frmSss.setTitle("Captura empleados");
		frmSss.getContentPane().setBackground(new Color(112, 128, 144));
		frmSss.setBounds(100, 100, 431, 378);
		frmSss.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSss.getContentPane().setLayout(null);
		
		txtPrimerNom = new JTextField();
		txtPrimerNom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimerNom.transferFocus();
			}
		});
		txtPrimerNom.setBackground(new Color(255, 255, 255));
		txtPrimerNom.setBounds(191, 73, 129, 20);
		frmSss.getContentPane().add(txtPrimerNom);
		txtPrimerNom.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Primer Apellido:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblNewLabel.setBounds(29, 118, 141, 29);
		frmSss.getContentPane().add(lblNewLabel);
		
		JLabel lblSegundoApellido = new JLabel("Segundo Apellido:");
		lblSegundoApellido.setForeground(new Color(255, 255, 255));
		lblSegundoApellido.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSegundoApellido.setBounds(22, 146, 148, 29);
		frmSss.getContentPane().add(lblSegundoApellido);
		
		JLabel lblPrimerNombre = new JLabel("Primer Nombre:");
		lblPrimerNombre.setForeground(new Color(255, 255, 255));
		lblPrimerNombre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblPrimerNombre.setBounds(29, 67, 141, 29);
		frmSss.getContentPane().add(lblPrimerNombre);
		
		JLabel lblSegundoNombre = new JLabel("Segundo Nombre:");
		lblSegundoNombre.setForeground(new Color(255, 255, 255));
		lblSegundoNombre.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblSegundoNombre.setBounds(29, 92, 141, 29);
		frmSss.getContentPane().add(lblSegundoNombre);
		
		JLabel lblFNacimiento = new JLabel("F. Nacimiento:");
		lblFNacimiento.setForeground(new Color(255, 255, 255));
		lblFNacimiento.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblFNacimiento.setBounds(50, 173, 120, 29);
		frmSss.getContentPane().add(lblFNacimiento);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setForeground(new Color(255, 255, 255));
		lblGenero.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblGenero.setBounds(99, 198, 71, 29);
		frmSss.getContentPane().add(lblGenero);
		
		txtSecondNombre = new JTextField();
		txtSecondNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSecondNombre.transferFocus();
			}
		});
		txtSecondNombre.setBounds(191, 98, 129, 20);
		frmSss.getContentPane().add(txtSecondNombre);
		txtSecondNombre.setColumns(10);
		
		txtPrimApellido = new JTextField();
		txtPrimApellido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPrimApellido.transferFocus();
			}
		});
		txtPrimApellido.setBounds(191, 124, 129, 20);
		frmSss.getContentPane().add(txtPrimApellido);
		txtPrimApellido.setColumns(10);
		
		txtSecondApellido = new JTextField();
		txtSecondApellido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtSecondApellido.transferFocus();
			}
		});
		txtSecondApellido.setBounds(191, 152, 129, 20);
		frmSss.getContentPane().add(txtSecondApellido);
		txtSecondApellido.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNacimiento.transferFocus();
			}
		});
		txtNacimiento.setBounds(191, 179, 129, 20);
		frmSss.getContentPane().add(txtNacimiento);
		txtNacimiento.setColumns(10);
		
		cboGenero = new JComboBox();
		cboGenero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cboGenero.transferFocus();
			}
		});
		cboGenero.setBounds(191, 204, 129, 20);
		cboGenero.addItem("M");
		cboGenero.addItem("F");
		
		frmSss.getContentPane().add(cboGenero);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				habilitar();
			}
		});
		btnNuevo.setBounds(22, 238, 89, 23);
		frmSss.getContentPane().add(btnNuevo);
		
		String accion = "Insertar";
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ConexionMySQL mysql = new ConexionMySQL();
				Connection cn = mysql.Conectar();
				String ap1, ap2, nom1, nom2, fn, gen;
				String sSQL = ""; //Sentencia SQL
				String mensaje = "";
				nom1 = txtPrimerNom.getText();
				nom2 = txtSecondNombre.getText();
				ap1 = txtPrimApellido.getText();
				ap2 = txtSecondApellido.getText();
				fn = txtNacimiento.getText();
				gen = cboGenero.getSelectedItem().toString(); //Lo convierte a String
				sSQL = "INSERT INTO datos_personales(nombre1, nombre2, apellido1, apellido2, fecha_nac, genero)" +
						"VALUES(?, ?, ?, ?, ?, ?)";
				mensaje = "Los datos se han insertado de manera satisfactoria...";
				
				try{
					PreparedStatement pst = cn.prepareStatement(sSQL);
					pst.setString(1, nom1);
					pst.setString(2, nom2);
					pst.setString(3, ap1);
					pst.setString(4, ap2);
					pst.setString(5, fn);
					pst.setString(6, gen);
					
					int n = pst.executeUpdate();
					
					if(n > 0){
						JOptionPane.showMessageDialog(null, mensaje);
					}
				}catch (SQLException ex){
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		btnGuardar.setBounds(121, 238, 89, 23);
		frmSss.getContentPane().add(btnGuardar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inhabilitar();
			}
		});
		btnCancelar.setBounds(225, 238, 89, 23);
		frmSss.getContentPane().add(btnCancelar);
		//Comentario
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(131, 272, 89, 23);
		frmSss.getContentPane().add(btnSalir);
		
		JLabel lblCapturaDeDatos = new JLabel("Captura de datos empleado");
		lblCapturaDeDatos.setForeground(new Color(64, 224, 208));
		lblCapturaDeDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblCapturaDeDatos.setBounds(69, 11, 210, 34);
		frmSss.getContentPane().add(lblCapturaDeDatos);
		
		lblAaaammdd = new JLabel("AAAA-MM-DD");
		lblAaaammdd.setBounds(330, 182, 73, 14);
		frmSss.getContentPane().add(lblAaaammdd);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(47, 79, 79));
		panel.setBorder(new TitledBorder(null, "Gge", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 393, 314);
		frmSss.getContentPane().add(panel);
		
	}
	void habilitar(){
		txtPrimerNom.setEnabled(true);
		txtSecondNombre.setEnabled(true);
		txtPrimApellido.setEnabled(true);
		txtSecondApellido.setEnabled(true);
		txtNacimiento.setEnabled(true);
		cboGenero.setEnabled(true);
		txtPrimerNom.setText("");
		txtSecondNombre.setText("");
		txtPrimApellido.setText("");
		txtSecondApellido.setText("");
		txtNacimiento.setText("");
		btnGuardar.setEnabled(true);
		btnCancelar.setEnabled(true);
		txtPrimerNom.requestFocus(); //Para que se mueva el cursor a esta posicion
	}
	
	void inhabilitar(){
		txtPrimerNom.setEnabled(false);
		txtSecondNombre.setEnabled(false);
		txtPrimApellido.setEnabled(false);
		txtSecondApellido.setEnabled(false);
		txtNacimiento.setEnabled(false);
		cboGenero.setEnabled(false);
		txtPrimerNom.setText("");
		txtSecondNombre.setText("");
		txtPrimApellido.setText("");
		txtSecondApellido.setText("");
		txtNacimiento.setText("");
		btnGuardar.setEnabled(false);
		btnCancelar.setEnabled(false);
		
	}
}
