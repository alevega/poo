package controlador;

import modelo.UsuarioModel;
import vistas.AgregarUsuarioView;

public class AgregarUsuarioControlador {
	
	private AgregarUsuarioView vista;
	private UsuarioModel modelo;
	
	public AgregarUsuarioControlador(){
		
		this.vista = new AgregarUsuarioView();
		this.vista.setVisible(true);
		this.modelo = new UsuarioModel();
		
		this.vista.getBtnCrear().addActionListener(e->{
			
			String nombre = this.vista.getTextNombre().getText().toString();
			String apellido = this.vista.getTextApellido().getText().toString();
			String usuario = this.vista.getTextUsuario().getText().toString();
			String pass = String.valueOf(this.vista.getTxPassword().getPassword());
			
			Boolean resultado  = this.modelo.agregarUsuario(nombre, apellido, usuario, pass);
			
			System.out.println(resultado);
			
		});
		
	}
}
