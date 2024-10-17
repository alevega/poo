package logisticas;

import transportes.Camion;
import transportes.Transporte;

public class LogisticaTerrestre extends Logistica {
    @Override
    protected Transporte crearTransporte() {
        return new Camion();  // Devuelve un camión
    }
}