public abstract class ConstructorDeCasa {
    protected Casa casa;

    public Casa getCasa() {
        return casa;
    }

    public void crearNuevaCasa(String nombre) {
        casa = new Casa(nombre);
    }

    public abstract void construirCimientos();
    public abstract void construirEstructura();
    public abstract void construirTecho();
    public abstract void construirGarage();
    public abstract void construirPiscina();
    public abstract void construirJardin();
}