package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Cpersona;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JButton btnIngresar;
	private JPasswordField txtpass;
	private JLabel lblmensaje;

	public Vista(Cpersona controlador) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setTitle("Inicio Sesión");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Sistema Pepe");
		lblTitulo.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 20));
		lblTitulo.setBounds(132, 41, 171, 40);
		contentPane.add(lblTitulo);
		
		JLabel lblUsuario = new JLabel("Dni:");
		lblUsuario.setBounds(76, 95, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblPass = new JLabel("Pass:");
		lblPass.setBounds(76, 120, 46, 14);
		contentPane.add(lblPass);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(132, 92, 171, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setName("ingresar");
		btnIngresar.setBounds(185, 148, 89, 23);
		contentPane.add(btnIngresar);
		
		txtpass = new JPasswordField();
		txtpass.setBounds(132, 117, 171, 20);
		contentPane.add(txtpass);
		
		lblmensaje = new JLabel("");
		lblmensaje.setBounds(132, 181, 171, 13);
		contentPane.add(lblmensaje);
	}
	
	public JTextField getUsuario() {
		return this.txtUsuario;
	}
	
	public JTextField getPass() {
		return this.txtpass;
	}
	
	public JLabel getMensaje() {
		return this.lblmensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.lblmensaje.setText(mensaje);
	}
	
	public JButton getBotonIngreso() {
		return this.btnIngresar;
	}
}
