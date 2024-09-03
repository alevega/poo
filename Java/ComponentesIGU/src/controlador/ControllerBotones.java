package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.BotonesView;

public class ControllerBotones implements ActionListener{
	
	private BotonesView vista;
	
	public ControllerBotones() {
		this.vista = new BotonesView(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		switch(e.getActionCommand()) {
			case "play":
				this.vista.getB1().setEnabled(false);
				this.vista.getB2().setEnabled(true);
				this.vista.getB3().setEnabled(true);
				break;
			case "pauso":
				System.out.println("entr");
				this.vista.getB1().setEnabled(true);
				this.vista.getB2().setEnabled(false);
				this.vista.getB2().setEnabled(false);
				break;
			case "stop":
				this.vista.getB1().setEnabled(true);
				this.vista.getB2().setEnabled(false);
				this.vista.getB3().setEnabled(false);
				break;
			
		}
		
	}

}
