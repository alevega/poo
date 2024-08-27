
public class main {

	public static void main(String[] args) {
	
		Persona persona = new Persona();
		
		try {
			persona.pelear(20);
		} catch (ExcepcionPersonalizada e) {
			
			e.printStackTrace();
		}

	}

}
