package controlador;




import modelo.Persona;
import vista.Vista;

public class Cpersona{

	private Vista vista;
	
	public Cpersona() {
		this.vista = new Vista(this);
		this.vista.setVisible(true);
		this.vista.getBotonIngreso().addActionListener(e -> {
			Persona per = new Persona();
			if(per.logueo(Integer.valueOf(this.vista.getUsuario().getText()), this.vista.getPass().getText())) {
				new Cprincipal();
				this.vista.setVisible(false);
			}else {
				this.vista.setMensaje("No entro al sistema");
			}
		});
	}
	
	
	
}
