public class MaquinaExpendedora {
    private Estado estadoActual;

    public MaquinaExpendedora() {
        // Estado inicial: Sin Dinero
        this.estadoActual = new SinDinero();
    }

    // Cambiar el estado actual
    public void setEstado(Estado nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    // Métodos que delegan la operación al estado actual
    public void insertarDinero() {
        estadoActual.insertarDinero(this);
    }

    public void seleccionarProducto() {
        estadoActual.seleccionarProducto(this);
    }

    public void dispensar() {
        estadoActual.dispensar(this);
    }
}
