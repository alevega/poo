public class ProductoSeleccionado implements Estado {
    @Override
    public void insertarDinero(MaquinaExpendedora maquina) {
        System.out.println("Ya has seleccionado un producto. Espera la dispensación.");
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora maquina) {
        System.out.println("Ya seleccionaste un producto. Espera la dispensación.");
    }

    @Override
    public void dispensar(MaquinaExpendedora maquina) {
        System.out.println("Dispensando el producto...");
        maquina.setEstado(new SinDinero());
    }
}
