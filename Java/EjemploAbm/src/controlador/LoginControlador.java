package controlador;

import modelo.UsuarioModel;
import vistas.LoginView;

public class LoginControlador {
	
	private LoginView vista;
	private UsuarioModel usuario;
	
	
	public LoginControlador() {
		
		this.vista = new LoginView();
		this.vista.setVisible(true);
		this.vista.getBtnIngresar().addActionListener(e->{
			this.usuario = new UsuarioModel();
			boolean resultado = this.usuario.login(this.vista.getTxfUsuario().getText(),String.valueOf(this.vista.getPasswordField().getPassword()));
			if(resultado) {
				this.vista.setVisible(false);
				new AbmControlador();
			}else {
				System.out.println("El usuario no corresponde");
			}
		});;
		
		
	}
	
	

}
