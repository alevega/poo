
public class HiloHolaMundo implements Runnable{

	private Integer numero;
	
	public HiloHolaMundo(Integer numero) {
		this.numero = numero;
	}
	
	
	@Override
	public void run() {
		Integer segundos = 0;
		try {
			segundos = this.numero * 1000;
			Thread.sleep(segundos);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		

		System.out.println("Hola mundo. Hilo = "+this.numero);
	}
	
	

}
