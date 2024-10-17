public class App {
    public static void main(String[] args) throws Exception {
        // Obtener la instancia única de la base de datos
        BaseDeDatos bd1 = BaseDeDatos.obtenerInstancia();
        bd1.ejecutarConsulta("SELECT * FROM usuarios");

        // Intentar obtener otra instancia de la base de datos
        BaseDeDatos bd2 = BaseDeDatos.obtenerInstancia();
        bd2.ejecutarConsulta("SELECT * FROM productos");

        // Comprobar que ambas instancias son iguales
        if (bd1 == bd2) {
            System.out.println("Ambas referencias apuntan a la misma instancia.");
        }
    }
}
