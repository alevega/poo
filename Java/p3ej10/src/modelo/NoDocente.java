package modelo;

public class NoDocente extends Personal{
	
	private String jornada;
	
	public NoDocente(String nombre, Integer antiguedad, String sector, String jornada) {
		super(nombre, antiguedad, sector);
		this.jornada = jornada;
	}

	@Override
	public void set_horas_trabajadas() {
		// TODO Auto-generated method stub
		
	}

}
