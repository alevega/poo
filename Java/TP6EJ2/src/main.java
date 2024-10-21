import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		Contador compartido = new Contador();
		ArrayList<Hilo> hilos = new ArrayList<Hilo>();
		
		for(int i = 0; i < 4; i++) {
			hilos.add(new Hilo(compartido));
			hilos.get(i).start();
			try {
				hilos.get(i).join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		
		System.out.println("Resultado del contador: " + compartido.getContador());

	}

}
