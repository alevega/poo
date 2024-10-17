public class Trabajador implements Empleado {
    private final String nombre;
    private final String puesto;

    public Trabajador(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Trabajador: " + nombre + ", Puesto: " + puesto);
    }
}
