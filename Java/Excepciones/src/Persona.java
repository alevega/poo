
public class Persona {

	private String nombre;
	private Integer vida;
	
	public Persona(){
		this.nombre = "prueba";
		this.vida = 10;
	}	
	
	public void pelear(Integer danio) throws ExcepcionPersonalizada {
		this.vida -= danio;
		if(this.vida < 0 ) {
			throw new ExcepcionPersonalizada("La edad es menor a 0");
		}
	}
	
	public void pelear2(Integer danio) {
		try {
			this.vida -= danio;
			if(this.vida < 0 ) {
				throw new ExcepcionPersonalizada("error");
			}
		} catch (ExcepcionPersonalizada exc) {
			//Hago lo posible salvar esta situacion
		}
		
	}
	
}
