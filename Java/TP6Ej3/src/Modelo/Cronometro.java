package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.sound.midi.Track;

public class Cronometro implements Runnable, Observable{
	
	private Integer segundos;
	private Integer minutos;
	private Integer hora;
	private Thread hiloDeEjecucion;
	private ArrayList<Cronometrar> observers;
	
	public Cronometro(Integer hora, Integer minutos, Integer segundos) throws SecurityException{
		this.segundos = segundos;
		this.minutos = minutos;
		this.hora = hora;
		this.observers = new ArrayList<Cronometrar>();
		this.hiloDeEjecucion = new Thread(this);
		this.hiloDeEjecucion.setName("inicio");
	}

	public Thread getHiloDeEjecucion() {
		return hiloDeEjecucion;
	}

	@Override
	public void run() {
		synchronized (this) {
			
			while (this.hiloDeEjecucion == Thread.currentThread()) {
				try {
					// Esperamos un segundo.
					this.wait(1000);
					// Si el valor de segundos llega a 60.
					if (this.segundos + 1 == 60) {
						// Ponemos los segundos a 0.
						this.segundos = 0;
						// Si el valor de minutos llega a 60.
						if (this.minutos + 1 == 60) {
							// Ponemos los minutos a 0.
							this.minutos = 0;
							// Si el valor de las horas llega a 24.
							if (this.hora + 1 == 24) {
								// Ponemos el valor de las horas a 0.
								this.hora = 0;
							} else {
								// Si no incrementamos la hora en una unidad.
								this.hora += 1;
							}
						} else {
							// Si no incrementamos los minutos en una unidad.
							this.minutos += 1;
						}
					} else {
						// Si no incrementamos los segundos en una unidad.
						this.segundos += 1;
					}
					// Notificamos a los observadores que se ha producido un
					// cambio
					// en los valores del estado del objeto.
					notificar();
				} catch (InterruptedException ex) {
					// En caso de que se produzca alguna interrupcion del hilo
					// capturamos la excepcion y mostramos un mensaje.
					Logger.getLogger(Cronometro.class.getName()).log(Level.SEVERE,
							"Se produjo una excepcion en la ejecucion.", ex);
				}
			}
		}
	}
	
	public void stop(){
		Thread.currentThread().interrupt();
		this.hiloDeEjecucion = null;
	}

	@Override
	public void addObserver(Cronometrar observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(Cronometrar observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);
	}
	
	@Override
	public String toString() {
		return (this.hora < 10 ? "0" + this.hora : this.hora) + ":"
				+ (this.minutos < 10 ? "0" + this.minutos : this.minutos) + ":"
				+ (this.segundos < 10 ? "0" + this.segundos : this.segundos);
		
	}
	
	private void notificar() {
		for (Iterator<Cronometrar> it = observers.iterator(); it.hasNext();) {
			Cronometrar iObserver = it.next();
			iObserver.update();
		}
	}
	
	public void start() {
		this.hiloDeEjecucion.start();
	}

}
