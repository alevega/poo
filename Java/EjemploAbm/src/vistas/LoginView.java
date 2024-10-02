package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;


public class LoginView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txfUsuario;
	private JButton btnIngresar;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPasswordField passwordField;

	public LoginView() {
		JFrame.setDefaultLookAndFeelDecorated(true);
        setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 234);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("ABM");
		lblNewLabel.setBounds(158, 0, 59, 83);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		
		txfUsuario = new JTextField();
		txfUsuario.setBounds(107, 70, 163, 20);
		txfUsuario.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(138, 125, 99, 23);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel);
		contentPane.add(txfUsuario);
		contentPane.add(btnIngresar);
		
		lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setBounds(37, 73, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(37, 97, 60, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(107, 94, 163, 20);
		contentPane.add(passwordField);
	}

	public JTextField getTxfUsuario() {
		return txfUsuario;
	}

	public void setTxfUsuario(JTextField txfUsuario) {
		this.txfUsuario = txfUsuario;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
	
}
