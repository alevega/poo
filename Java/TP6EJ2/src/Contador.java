
public class Contador {
	
	private Integer contador = 0;
	
	public synchronized void incrementar() {
		this.contador++;
	}
	
	public Integer getContador() {
		return this.contador;
	}

}
