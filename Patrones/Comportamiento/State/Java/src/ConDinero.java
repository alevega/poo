public class ConDinero implements Estado {
    @Override
    public void insertarDinero(MaquinaExpendedora maquina) {
        System.out.println("Ya has insertado dinero. Selecciona un producto.");
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora maquina) {
        System.out.println("Producto seleccionado.");
        maquina.setEstado(new ProductoSeleccionado());
    }

    @Override
    public void dispensar(MaquinaExpendedora maquina) {
        System.out.println("Primero selecciona un producto.");
    }
}
