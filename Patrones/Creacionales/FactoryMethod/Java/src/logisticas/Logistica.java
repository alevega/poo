package logisticas;

import transportes.Transporte;

public abstract class Logistica {
    
    // Factory Method
    protected abstract Transporte crearTransporte();

    // Operación que utiliza el Factory Method
    public void planificarEntrega() {
        // Llamada al método factory para obtener el transporte concreto
        Transporte transporte = crearTransporte();
        transporte.entregar();
    }
}
