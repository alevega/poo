package vistas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;

public class AbmView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultTableModel modeloTabla;
	private JTable table;
	private JButton btnAgregarUsuario;

	public AbmView() {
		setTitle("ABM Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 719, 488);
		setResizable(false);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 44, 480, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 480, 383);
		panel.add(scrollPane);
		
		String[] columnas = {"Nombre", "Apellido", "Usuario"};
		modeloTabla = new DefaultTableModel(null, columnas);
		
		table = new JTable(modeloTabla);
		scrollPane.setViewportView(table);
		
		btnAgregarUsuario = new JButton("Agregar Usuario");
		btnAgregarUsuario.setBounds(512, 44, 133, 23);
		contentPane.add(btnAgregarUsuario);
		
	}

	public DefaultTableModel getModeloTabla() {
		return modeloTabla;
	}

	public void setModeloTabla(DefaultTableModel modeloTabla) {
		this.modeloTabla = modeloTabla;
	}
	
	public JButton getBtnAgregarUsuario() {
		return this.btnAgregarUsuario;
	}
}
