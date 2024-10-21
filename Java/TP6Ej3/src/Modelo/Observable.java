package Modelo;

public interface Observable {
	public void addObserver(Cronometrar observer);
	public void removeObserver(Cronometrar observer);
}
