package vista;

import java.awt.Button;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerBotones;

public class BotonesView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/button.html

	public BotonesView(ControllerBotones cbotones) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 376);
		contentPane = new JPanel();
		contentPane.setBorder(null);
	
		try {
			Image botonPlay = ImageIO.read(getClass().getResource("/play.png"));
			Image botonPause = ImageIO.read(getClass().getResource("/pause.png"));
			Image botonStop = ImageIO.read(getClass().getResource("/stop.png"));
		
			b1 = new JButton(null, new ImageIcon(botonPlay));
			b1.setBounds(10, 95, 166, 97);
			b1.setActionCommand("play");
			
			b2 = new JButton(null,new ImageIcon(botonPause));
			b2.setBounds(186, 95, 166, 97);
		    b2.setActionCommand("pauso");
		    b2.setEnabled(false);
		    
		    b3 = new JButton(null, new ImageIcon(botonStop));
		    b3.setBounds(362, 95, 166, 97);
		    b3.setActionCommand("stop");
		    b3.setEnabled(false);
			
		    b1.addActionListener(cbotones);
		    b2.addActionListener(cbotones);
		    b3.addActionListener(cbotones);
		    contentPane.setLayout(null);
		    
		    contentPane.add(b1);
		    contentPane.add(b2);
		    contentPane.add(b3);
		    
			setContentPane(contentPane);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public JButton getB1() {
		return b1;
	}

	public void setB1(JButton b1) {
		this.b1 = b1;
	}

	public JButton getB2() {
		return b2;
	}

	public void setB2(JButton b2) {
		this.b2 = b2;
	}

	public JButton getB3() {
		return b3;
	}

	public void setB3(JButton b3) {
		this.b3 = b3;
	}

	
	
}
