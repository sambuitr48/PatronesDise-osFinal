package factory;

public class FactoryExMain {
    public static void main(String[] args) {
        FactoryEx factory = new FactoryEx();

        FactoryInterface celular = factory.createProduct("Phone");
        celular.prendiendo();
        celular.ocupado();
        celular.apagar();
    }
}