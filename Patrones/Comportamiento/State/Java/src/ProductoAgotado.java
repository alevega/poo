public class ProductoAgotado implements Estado {
    @Override
    public void insertarDinero(MaquinaExpendedora maquina) {
        System.out.println("No puedes insertar dinero. El producto está agotado.");
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora maquina) {
        System.out.println("Producto agotado. No puedes seleccionarlo.");
    }

    @Override
    public void dispensar(MaquinaExpendedora maquina) {
        System.out.println("Producto agotado. No se puede dispensar.");
    }
}
