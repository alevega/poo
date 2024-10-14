public class App {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        // Usar la estrategia de pago con tarjeta de crédito
        tienda.setEstrategiaDePago(new PagoConTarjetaDeCredito("1234 5678 9876 5432", "Juan Pérez"));
        tienda.pagar(100.0);

        System.out.println();

        // Usar la estrategia de pago con PayPal
        tienda.setEstrategiaDePago(new PagoConDebito("juan.perez@example.com"));
        tienda.pagar(150.0);

        System.out.println();

        // Usar la estrategia de pago con Bitcoin
        tienda.setEstrategiaDePago(new PagoConBitcoin("direccion-de-wallet"));
        tienda.pagar(200.0);
    }
}
