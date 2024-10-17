public class Azucar extends DecoradorBebida {
    public Azucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebidaDecorada.getDescripcion() + ", con Azúcar";
    }

    @Override
    public double getCosto() {
        return bebidaDecorada.getCosto() + 5.0;
    }
}
