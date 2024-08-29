package p3ej10;

import java.util.ArrayList;
import java.util.Random;

import modelo.Docente;
import modelo.NoDocente;
import modelo.Personal;
import modelo.Reloj;

public class main {

	public static void main(String[] args) {
		ArrayList<String> categorias = new ArrayList<String>();
		categorias.add("Simple");
		categorias.add("Semiexclusiva");
		categorias.add("Exclusiva");
		ArrayList<String> jornadas = new ArrayList<String>();
		jornadas.add("Completa");
		jornadas.add("Reducida");
		ArrayList<Personal> personal = new ArrayList<>();
		
		for(int i = 0; i<10;i++) {
			if(new Random().nextInt(2) == 0) {
				personal.add(new Docente("nombre", new Random().nextInt(1,10), "sector",categorias.get(new Random().nextInt(3))));
			}else {
				personal.add(new NoDocente("nombre", new Random().nextInt(1,10), "sector",jornadas.get(new Random().nextInt(2))));
			}
		}
		
		new Reloj().informe(personal);

	}

}
