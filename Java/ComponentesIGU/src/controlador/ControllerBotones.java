package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import vista.BotonesView;

public class ControllerBotones implements ActionListener{
	
	private BotonesView vista;
	private BasicPlayer repro;
	
	public ControllerBotones() {
		this.vista = new BotonesView(this);
		this.vista.setVisible(true);
		this.repro = new BasicPlayer();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
		switch(e.getActionCommand()) {
			case "play":
				String path = "E:/Around the World.mp3";
				try {
					this.repro.open(new File(path));
					this.repro.play();
					this.vista.getB1().setEnabled(false);
					this.vista.getB2().setEnabled(true);
					this.vista.getB3().setEnabled(true);
					break;
				} catch (BasicPlayerException e1) {
					
					e1.printStackTrace();
				}
			case "pauso":
				try {
					this.repro.pause();
					this.vista.getB1().setEnabled(true);
					this.vista.getB2().setEnabled(false);
					this.vista.getB2().setEnabled(false);
					break;
				} catch (BasicPlayerException e1) {
					e1.printStackTrace();
				}
			case "stop":
				try {
					this.repro.stop();
					this.vista.getB1().setEnabled(true);
					this.vista.getB2().setEnabled(false);
					this.vista.getB3().setEnabled(false);
					break;
				} catch (BasicPlayerException e1) {
					e1.printStackTrace();
				}
			
		}
		
	}

}
