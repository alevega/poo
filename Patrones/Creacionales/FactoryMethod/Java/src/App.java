import logisticas.Logistica;
import logisticas.LogisticaMaritima;
import logisticas.LogisticaTerrestre;

public class App {
    public static void main(String[] args) throws Exception {
         Logistica logisticaTerrestre = new LogisticaTerrestre();
         logisticaTerrestre.planificarEntrega();
 
         Logistica logisticaMaritima = new LogisticaMaritima();
         logisticaMaritima.planificarEntrega();
    }
}
