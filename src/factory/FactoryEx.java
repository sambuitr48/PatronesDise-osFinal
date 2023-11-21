package factory;

public class FactoryEx {
    public FactoryInterface createProduct(String producto) {
        if ("Phone".equalsIgnoreCase(producto)) {
            return new FactoryCelular();
        }return null;
    }
}
