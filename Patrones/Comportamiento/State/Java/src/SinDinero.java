public class SinDinero implements Estado {
    @Override
    public void insertarDinero(MaquinaExpendedora maquina) {
        System.out.println("Dinero insertado correctamente.");
        maquina.setEstado(new ConDinero());
    }

    @Override
    public void seleccionarProducto(MaquinaExpendedora maquina) {
        System.out.println("No puedes seleccionar un producto sin insertar dinero.");
    }

    @Override
    public void dispensar(MaquinaExpendedora maquina) {
        System.out.println("Primero debes insertar dinero.");
    }
}
