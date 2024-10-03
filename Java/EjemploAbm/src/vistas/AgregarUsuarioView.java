package vistas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class AgregarUsuarioView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textUsuario;
	private JButton btnCrear;
	private JButton btnCancelar;
	private JPasswordField txPassword;

	public AgregarUsuarioView() {
		setTitle("Agregar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 499);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agregar Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(119, 46, 195, 51);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(45, 129, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		textNombre = new JTextField();
		textNombre.setBounds(119, 126, 181, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido");
		lblNewLabel_2.setBounds(45, 173, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textApellido = new JTextField();
		textApellido.setBounds(119, 170, 181, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Usuario");
		lblNewLabel_3.setBounds(45, 225, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setBounds(45, 274, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(119, 222, 181, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		btnCrear = new JButton("Crear");
		btnCrear.setBounds(106, 346, 89, 23);
		contentPane.add(btnCrear);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(211, 346, 89, 23);
		contentPane.add(btnCancelar);
		
		txPassword = new JPasswordField();
		txPassword.setBounds(119, 271, 181, 20);
		contentPane.add(txPassword);
	}

	public JTextField getTextNombre() {
		return textNombre;
	}

	public JTextField getTextApellido() {
		return textApellido;
	}

	public JTextField getTextUsuario() {
		return textUsuario;
	}

	public JPasswordField getTxPassword() {
		return this.txPassword;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public JButton getBtnCancelar() {
		return btnCancelar;
	}
}
