package modelo;

public class Docente extends Personal{

	private String categoria;
	
	public Docente(String nombre, Integer antiguedad, String sector, String categoria) {
		super(nombre, antiguedad, sector);
		this.categoria = categoria;
	}

	@Override
	public void set_horas_trabajadas() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
