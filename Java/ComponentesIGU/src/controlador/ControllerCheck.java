package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import vista.CheckView;

public class ControllerCheck implements ItemListener{
	
	CheckView vista;
	
	public ControllerCheck() {
		this.vista = new CheckView(this);
		this.vista.setVisible(true);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}

}
