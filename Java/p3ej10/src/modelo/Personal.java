package modelo;

public abstract class Personal {

	protected String nombre;
	protected Integer antiguedad;
	protected String sector;
	protected Integer horas_trabajadas;
	protected Boolean cumplio;
	
	public Personal(String nombre, Integer antiguedad, String sector) {
		this.nombre = nombre;
		this.antiguedad = antiguedad;
		this.sector = sector;
		this.horas_trabajadas = 0;
		this.cumplio = 
	}
	
	public abstract void set_horas_trabajadas();
	
}
