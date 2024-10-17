public class PagoConBitcoin implements EstrategiaDePago {
    private String direccionWallet;

    public PagoConBitcoin(String direccionWallet) {
        this.direccionWallet = direccionWallet;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " usando Bitcoin. Wallet: " + direccionWallet);
    }
}
