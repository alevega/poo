public class App {
    public static void main(String[] args) throws Exception {
        // Crear trabajadores individuales
        Empleado trabajador1 = new Trabajador("Carlos Perez", "Desarrollador");
        Empleado trabajador2 = new Trabajador("Ana Lopez", "Diseñadora");
        Empleado trabajador3 = new Trabajador("Mario Diaz", "QA");

        // Crear supervisores
        Supervisor supervisor1 = new Supervisor("Laura Gutierrez", "Gerente de Proyectos");
        Supervisor supervisor2 = new Supervisor("Pedro Morales", "Jefe de Equipo");

        // Agregar trabajadores a los supervisores
        supervisor1.agregarSubordinado(trabajador1);
        supervisor1.agregarSubordinado(trabajador2);
        supervisor2.agregarSubordinado(trabajador3);

        // Agregar un supervisor a otro supervisor
        supervisor1.agregarSubordinado(supervisor2);

        // Mostrar detalles de toda la organización
        supervisor1.mostrarDetalles();
        
    }
}
