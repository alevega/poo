import java.util.Random;

public class Espadachin extends Personaje{
    
    public Espadachin(String nombre, int vida) {
        super(nombre, vida);
    }

    public Espadachin(String nombre) {
        this(nombre, 100);
    }

    @Override
    public void atacar(Personaje objetivo, int dano) {
        if(new Random().nextBoolean()){
            dano  = this.hablidadEspecial(dano);
        }
        super.atacar(objetivo, dano);
    }

    @Override
    protected Integer hablidadEspecial(int dano) {
        return dano*20;
    }
}
