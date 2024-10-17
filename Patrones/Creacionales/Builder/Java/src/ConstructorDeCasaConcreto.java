public class ConstructorDeCasaConcreto extends ConstructorDeCasa {
    @Override
    public void construirCimientos() {
        casa.setFoundation("Cimientos de concreto");
    }

    @Override
    public void construirEstructura() {
        casa.setEstructura("Estructura de madera");
    }

    @Override
    public void construirTecho() {
        casa.setTecho("Techo de tejas");
    }

    @Override
    public void construirGarage() {
        casa.setGarage(true);  // Optional
    }

    @Override
    public void construirPiscina() {
        casa.setPiscina(false);  // Optional
    }

    @Override
    public void construirJardin() {
        casa.setJardin(true);  // Optional
    }
}
