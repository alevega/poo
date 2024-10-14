public class PagoConDebito implements EstrategiaDePago {
    private String email;

    public PagoConDebito(String email) {
        this.email = email;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " usando PayPal. Email: " + email);
    }
}
