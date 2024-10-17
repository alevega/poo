package transportes;

public class Camion implements Transporte {
    @Override
    public void entregar() {
        System.out.println("El producto será entregado por carretera en un camión.");
    }
}