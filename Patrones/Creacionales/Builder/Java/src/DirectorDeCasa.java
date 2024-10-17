public class DirectorDeCasa {
    private final ConstructorDeCasa constructorDeCasa;

    public DirectorDeCasa(ConstructorDeCasa constructorDeCasa) {
        this.constructorDeCasa = constructorDeCasa;
    }

    public void construirCasaSimple() {
        this.construccionBasica("Simple");
        constructorDeCasa.construirGarage();
    }

    public void construirCasaCompleta() {
        this.construccionBasica("Completa");
        constructorDeCasa.construirGarage();
        constructorDeCasa.construirPiscina();
        constructorDeCasa.construirJardin();
    }

    private void construccionBasica(String nombre)
    {
        constructorDeCasa.crearNuevaCasa(nombre);
        constructorDeCasa.construirCimientos();
        constructorDeCasa.construirEstructura();
        constructorDeCasa.construirTecho();
    }

    public Casa getCasa() {
        return constructorDeCasa.getCasa();
    }
}
