public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina = new MaquinaExpendedora();

        // Intentando seleccionar un producto sin insertar dinero
        System.out.println("Seleccionar un producto...");
        maquina.seleccionarProducto();

        // Insertar dinero y seleccionar producto
        System.out.println();
        maquina.insertarDinero();
        System.out.println("Seleccionar un producto...");
        maquina.seleccionarProducto();

        // Dispensar el producto
        System.out.println();
        maquina.dispensar();

        // Intentar dispensar nuevamente sin dinero
        System.out.println();
        System.out.println("Dispensar otro producto...");
        maquina.dispensar();
    }
}
