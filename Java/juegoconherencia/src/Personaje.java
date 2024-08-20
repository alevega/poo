public abstract class Personaje {

    protected String nombre;
    protected int vida;

    public Personaje(String nombre, int vida){
        this.nombre = nombre;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDano(int dano) {
        vida -= dano;
        if (vida < 0)
            vida = 0;
    }

    public void atacar(Personaje objetivo, int dano) {
        System.out.println(getNombre() + " ataca a " + objetivo.getNombre() + "!");
        objetivo.recibirDano(dano);
        System.out.println(objetivo.getNombre() + " tiene " + objetivo.getVida() + " puntos de vida restantes.");
        System.out.println();
    }
    
    protected abstract Integer hablidadEspecial(int dano);
}
