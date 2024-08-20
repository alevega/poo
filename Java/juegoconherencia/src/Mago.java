
import java.util.Random;


public class Mago extends Personaje{
    
    private static final int VIDA_POR_DEFECTO = 100;

    public Mago(String nombre, int vida) {
        super(nombre, vida);
    }

    public Mago(String nombre) {
        this(nombre, VIDA_POR_DEFECTO);
    }

    @Override
    public void recibirDano(int dano) {
        if(new Random().nextBoolean()){
            dano  = this.hablidadEspecial(dano);
        }
        super.recibirDano(dano);
    }

    @Override
    protected Integer hablidadEspecial(int dano) {
        return (int) (dano*0.2);
    }
    
}
