public abstract class DecoradorBebida implements Bebida {
    protected Bebida bebidaDecorada;

    public DecoradorBebida(Bebida bebida) {
        this.bebidaDecorada = bebida;
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion();
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto();
    }
}
