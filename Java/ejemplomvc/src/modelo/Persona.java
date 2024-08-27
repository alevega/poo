package modelo;

public class Persona {

	
	private String nombre;
	private String apellido;
	private Integer dni;
	private String pass;
	
	public Persona() {
		this.dni = 1;
		this.pass = "admin";
	}
	
	public Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = 1;
		this.pass = "admin";
	}
	
	public Boolean logueo(Integer dni, String pass) {
		if(this.dni == dni && this.pass.equals(pass)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
}
