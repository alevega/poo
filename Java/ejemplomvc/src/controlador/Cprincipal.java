package controlador;

import vista.Principal;

public class Cprincipal {

	private Principal vistaPrincipal;
	
	
	public Cprincipal() {
		this.vistaPrincipal = new Principal(this);
		this.vistaPrincipal.setVisible(true);
	}
	
	
	
}
