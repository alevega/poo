package Vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Controlador.CronometroController;

public class CronometroVista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel cronoPrincipal;
	private JPanel panel;
	private JLabel subCrono;
	private JButton btn_iniciar;
	private JButton btn_parar;
	private JTable table;
	private DefaultTableModel defTableModel;

	
	public CronometroVista(CronometroController controlador) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cronoPrincipal = new JLabel("00:00:00");
		cronoPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cronoPrincipal.setBounds(172, 11, 119, 14);
		contentPane.add(cronoPrincipal);
		
		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(40, 70, 353, 132);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		panel.add(scrollPane);
		
		String[] column = {"N°","Tiempo","Parcial"};
		setDefTableModel(new DefaultTableModel(null,column));
		
		table = new JTable(getDefTableModel());
		scrollPane.setViewportView(table);

		
		subCrono = new JLabel("");
		subCrono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		subCrono.setBounds(172, 36, 78, 14);
		contentPane.add(subCrono);
		
		btn_iniciar = new JButton("Iniciar");
		btn_iniciar.addActionListener(controlador);
		btn_iniciar.setBounds(103, 227, 89, 23);
		contentPane.add(btn_iniciar);
		
		btn_parar = new JButton("Parar");
		btn_parar.setBounds(248, 227, 89, 23);
		btn_parar.setEnabled(false);
		contentPane.add(btn_parar);
	}
	
	public JLabel getCronoPrincipal() {
		return cronoPrincipal;
	}

	public JLabel getSubCrono() {
		return subCrono;
	}

	public DefaultTableModel getDefTableModel() {
		return defTableModel;
	}
	
	public void setDefTableModel(DefaultTableModel defTableModel) {
		this.defTableModel = defTableModel;
	}

	public JButton getBtn_iniciar() {
		return btn_iniciar;
	}

	public JButton getBtn_parar() {
		return btn_parar;
	}

}
