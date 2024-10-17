// Esta clase es el ConcreteSubscriber
// Es la clase que implementa la interfaz Observador
public class Cliente implements Observador {

    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String producto, double precio) {
        System.out.println("El cliente " + nombre + " es notificado: El precio del producto " + producto + " se actualizo a $"
                + precio);
    }
}