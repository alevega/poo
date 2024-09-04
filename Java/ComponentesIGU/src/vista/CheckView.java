package vista;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControllerCheck;

public class CheckView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCheckBox mentonButton;
	private JCheckBox anteojosButton;
	private JCheckBox peloButton;
	private JCheckBox dientesButton;
	private StringBuffer choices;
	private JLabel pictureLabel;
	
	public CheckView(ControllerCheck cCheck) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		mentonButton = new JCheckBox("Menton");
		mentonButton.setBounds(31, 59, 120, 30);
	
		mentonButton.setSelected(true);
		
		anteojosButton = new JCheckBox("Anteojos");
		anteojosButton.setBounds(31, 92, 69, 30);
		anteojosButton.setSelected(true);
		
		peloButton = new JCheckBox("Pelo");
		peloButton.setBounds(31, 125, 69, 46);
		peloButton.setSelected(true);
		
		dientesButton = new JCheckBox("Dientes");
		dientesButton.setBounds(31, 165, 69, 36);
		dientesButton.setSelected(true);
		
		mentonButton.addItemListener(cCheck);
		anteojosButton.addItemListener(cCheck);
		peloButton.addItemListener(cCheck);
		dientesButton.addItemListener(cCheck);
		
		pictureLabel = new JLabel();
		pictureLabel.setBounds(148, 11, 248, 239);
        pictureLabel.setFont(pictureLabel.getFont().deriveFont(Font.ITALIC));
        updatePicture();
		

		contentPane.add(mentonButton);
		contentPane.add(anteojosButton);
		contentPane.add(peloButton);
		contentPane.add(dientesButton);
		contentPane.add(pictureLabel);

		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	
	public void updatePicture() {
		
        //Poner la imagen
		
	}
	

}
