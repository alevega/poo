package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerBotones;

public class BotonesView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/button.html

	public BotonesView(ControllerBotones cbotones) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		
		
		setContentPane(contentPane);
	}

}
