public class App {
    public static void main(String[] args) throws Exception {
        ConstructorDeCasa constructorDeCasa = new ConstructorDeCasaConcreto();

        DirectorDeCasa director = new DirectorDeCasa(constructorDeCasa);

        director.construirCasaSimple();
        Casa casaSimple = director.getCasa();

        director.construirCasaCompleta();
        Casa casaCompleta = director.getCasa();

        System.out.println();
        System.out.println(casaSimple);

        System.out.println();
        System.out.println(casaCompleta);
    }
}
