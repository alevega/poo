import java.util.ArrayList;
import java.util.List;

public class Supervisor implements Empleado {
    private final String nombre;
    private final String puesto;
    private final List<Empleado> subordinados;

    public Supervisor(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        subordinados = new ArrayList<>();
    }

    public void agregarSubordinado(Empleado empleado) {
        subordinados.add(empleado);
    }

    public void removerSubordinado(Empleado empleado) {
        subordinados.remove(empleado);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Supervisor: " + nombre + ", Puesto: " + puesto);
        System.out.println("Subordinados:");
        for (Empleado subordinado : subordinados) {
            subordinado.mostrarDetalles();  // Recursivamente muestra los detalles de subordinados
        }
    }
}
