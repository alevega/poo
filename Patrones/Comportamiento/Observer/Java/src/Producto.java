import java.util.ArrayList;
import java.util.List;

// Esta es la clase Publisher, es la que puede tener suscriptores
// y la que debera notificar a sus suscriptores cada vez que haya algun cambio importante
public class Producto {

    private String nombre;
    private double precio;
    // Esta es la lista de suscriptores, contiene los objetos a los que se notificara cuando haya algun cambio
    // Todo aquel objeto que implemente la interfaz Observador puede ser agregado a esta lista
    private List<Observador> suscriptores = new ArrayList<>();

    public Producto(String name, double precio) {
        this.nombre = name;
        this.precio = precio;
    }

    // Este metodo permite agregar suscriptores
    public void suscribir(Observador cliente) {
        suscriptores.add(cliente);
    }

    // Este metodo permite quitar suscriptores
    public void desuscribir(Observador cliente) {
        suscriptores.remove(cliente);
    }

    // Este metodo es el que puede provocar una notificacion
    // Muchos metodos pueden generar una notificacion, no tiene que ser solamente uno
    // Podria tener otro metodo que cambie el nombre y tambien podria generar notificaciones
    // Para ello deben llamar al metodo privado notificar
    public void setPrecio(double precio) {
        String mensaje = String.format("El producto %s cambio su precio a de %.2f a %.2f", this.nombre, this.precio, precio);
        System.out.println(mensaje);
        this.precio = precio;
        notificar();
    }

    // Este es el metodo que notifica a los suscriptores,
    // aquel metodo que quiera que se notifique a los suscriptores 
    // sobre algun cambio
    private void notificar() {
        for (Observador cliente : suscriptores) {
            // Usamos el metodo actualizar declarado en la interfaz para notificar 
            cliente.actualizar(nombre, precio);
        }
    }
}