public class PagoConTarjetaDeCredito implements EstrategiaDePago {
    private String numeroTarjeta;
    private String titular;

    public PagoConTarjetaDeCredito(String numeroTarjeta, String titular) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
    }

    @Override
    public void pagar(double pago) {
        System.out.println("Pagando " + pago + " usando tarjeta de crédito. Detalles: " + 
                            "Número de tarjeta: " + numeroTarjeta + ", Titular: " + titular);
    }
}
