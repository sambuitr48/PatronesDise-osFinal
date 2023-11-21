package factory;

public class FactoryCelular implements FactoryInterface {
    @Override
    public void prendiendo() {
        System.out.println("prendiendo el celular");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el celular");
    }

    @Override
    public void ocupado() {
        System.out.println("celular ocupado");
    }
}
