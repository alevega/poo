public class App {
    public static void main(String[] args) throws Exception {
        Mago mago = new Mago("Gandalf");
        Espadachin espadachin = new Espadachin("Aragorn", 150);
        Ladron ladron = new Ladron("Frodo");

        ladron.atacar(espadachin);
        espadachin.atacar(ladron);

        mago.atacar(espadachin);
        espadachin.atacar(mago);

        mago.atacar(ladron);
        ladron.atacar(mago);

        System.out.println("Otro personaje se suma la batalla\n");

        Espadachin espadachin2 = new Espadachin("Faramir");

        espadachin2.atacar(mago);

        System.out.println("Otro personaje se suma la batalla\n");

        Ladron ladron2 = new Ladron();

        ladron2.atacar(espadachin);

        System.out.println("Resultado");
        System.out.println(espadachin.getNombre() + " tiene " + espadachin.getVida() + " puntos de vida");
        System.out.println(mago.getNombre() + " tiene " + mago.getVida() + " puntos de vida");
        System.out.println(ladron.getNombre() + " tiene " + ladron.getVida() + " puntos de vida");
    }
}
