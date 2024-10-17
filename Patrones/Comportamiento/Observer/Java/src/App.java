public class App {
    public static void main(String[] args) {

        // El producto es el sujeto, es el objeto OBSERVADO
        Producto producto = new Producto("Notebook", 1500.00);

        // Los clientes son los OBSERVADORES, son quienes necesitan enterarse de los cambios del producto
        Cliente cliente1 = new Cliente("Pablo");
        Cliente cliente2 = new Cliente("Ale");

        // Los clientes se suscriben el producto
        producto.suscribir(cliente1);
        producto.suscribir(cliente2);

        // Al cambiar el precio del producto, este deberá notificar a sus suscriptores que hubo un cambio
        producto.setPrecio(1400.00);
        System.out.println();
        producto.setPrecio(900.00);
    }
}
