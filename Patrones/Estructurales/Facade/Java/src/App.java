public class App {
    public static void main(String[] args) throws Exception {
        // Crear una instancia de la fachada del cine
        CineFacade cineFacade = new CineFacade();

        // Utilizar la fachada para iniciar la experiencia de cine
        cineFacade.iniciarCine("A12", 5);

        // Apagar el cine
        cineFacade.apagarCine();
    }
}
