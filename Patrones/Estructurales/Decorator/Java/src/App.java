public class App {
    public static void main(String[] args) throws Exception {
        // Crear un café básico
        Bebida miCafe = new Cafe();
        System.out.println(miCafe.getDescripcion() + " cuesta $" + miCafe.getCosto());

        // Agregarle leche al café
        miCafe = new Leche(miCafe);
        System.out.println(miCafe.getDescripcion() + " cuesta $" + miCafe.getCosto());

        // Agregarle azúcar al café con leche
        miCafe = new Azucar(miCafe);
        System.out.println(miCafe.getDescripcion() + " cuesta $" + miCafe.getCosto());
    }
}
