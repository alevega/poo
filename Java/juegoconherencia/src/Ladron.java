public class Ladron extends Personaje{

    private static final int VIDA_POR_DEFECTO = 80;
    
    public Ladron(String nombre, int vida) {
        super(nombre, vida);
    }
    
    public Ladron() {
        this("Ladron Generico 44", VIDA_POR_DEFECTO);
    }

    public Ladron(String nombre) {
        this(nombre, VIDA_POR_DEFECTO);
    }

    @Override
    public void recibirDano(int dano) {
        super.recibirDano(dano);
        this.hablidadEspecial(dano);
    }

    @Override
    protected Integer hablidadEspecial(int dano) {
        System.out.println("Ha robado un item");
        return dano;
    }
}
