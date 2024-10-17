package transportes;

public class Barco implements Transporte {
    @Override
    public void entregar() {
        System.out.println("El producto será entregado por mar en un barco.");
    }
}
