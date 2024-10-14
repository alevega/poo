public class CineFacade {
    private Proyector proyector;
    private SistemaDeSonido sistemaDeSonido;
    private Boleto boleto;

    public CineFacade() {
        proyector = new Proyector();
        sistemaDeSonido = new SistemaDeSonido();
        boleto = new Boleto();
    }

    // Método que combina todas las operaciones complejas en una sola llamada
    public void iniciarCine(String asiento, int volumen) {
        // Reservar boleto
        boleto.reservarAsiento(asiento);
        
        // Encender el proyector
        proyector.encender();
        proyector.configurarEntrada();

        // Encender y configurar el sistema de sonido
        sistemaDeSonido.encender();
        sistemaDeSonido.ajustarVolumen(volumen);
    }

    public void apagarCine() {
        proyector.apagar();
        sistemaDeSonido.apagar();
    }
}
