
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Personaje> ejercitoNorte = new ArrayList<>();
        ArrayList<Personaje> ejercitoSur = new ArrayList<>();
        Random rnd = new Random();

        for(int i=0;i<5;i++){
            ejercitoNorte.add(new Mago("mago"+i));
            ejercitoSur.add(new Mago("mago"+i));
            ejercitoNorte.add(new Ladron("Ladron"+i));
            ejercitoSur.add(new Ladron("Ladron"+i));
            ejercitoNorte.add(new Espadachin("espada"+i));
            ejercitoSur.add(new Espadachin("espada"+i));
        }

        Collections.shuffle(ejercitoSur);
        Collections.shuffle(ejercitoNorte);
        int min = 10;
        int max = 70;

        int pos = 0;
        for(Personaje personaje:ejercitoNorte){
            personaje.atacar(ejercitoSur.get(pos), rnd.nextInt(min,max));
            if(ejercitoSur.get(pos).getVida()>0) ejercitoSur.get(pos).atacar(personaje, rnd.nextInt(min,max));
            pos++;
        }
        
        System.out.println("Resultado Ejercito del sur");
        for(Personaje personaje:ejercitoSur){
            System.out.println(personaje.getNombre() + " tiene " + personaje.getVida() + " puntos de vida");
        }
        
        System.out.println("Resultado Ejercito del norte");
        for(Personaje personaje:ejercitoNorte){
            System.out.println(personaje.getNombre() + " tiene " + personaje.getVida() + " puntos de vida");
        }
    }
}
