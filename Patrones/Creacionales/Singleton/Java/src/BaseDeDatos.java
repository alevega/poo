import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BaseDeDatos {
    // Variable estática que almacena la única instancia de la clase
    private static BaseDeDatos instancia;

    private String name;

    // Constructor privado para evitar que se creen instancias desde fuera de la clase
    private BaseDeDatos() {
        this.name = "MiBaseDeDatos " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println("Conectando a la base de datos...");
    }

    // Método público estático para obtener la única instancia de la clase
    public static BaseDeDatos obtenerInstancia() {
        if (instancia == null) {
            instancia = new BaseDeDatos();
        }
        return instancia;
    }

    // Un método de ejemplo para mostrar que la instancia es única
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta: " + consulta + " con BD: " + this.name);
    }
}
