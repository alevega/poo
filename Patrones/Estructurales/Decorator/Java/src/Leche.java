public class Leche extends DecoradorBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", con Leche";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 10.0;
    }
}
