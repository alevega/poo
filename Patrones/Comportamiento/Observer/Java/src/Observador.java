// Esta es la interfaz que en el modelo se llama Subscriber
// Quienes quieran suscribirse a un objeto observado, deberan implementar esta interfaz
public interface Observador {
    // Este es el metodo que los observados usaran para notificar
    // Los parametros varian segun el problema que estemos resolviendo,
    // en este caso son producto y precio pero podria ser cualquier otro objeto que necesitemos
    void actualizar(String producto, double precio);
}