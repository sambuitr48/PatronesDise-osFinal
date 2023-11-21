package singleton1;

public class MainSingleton {
    public static void main(String[] args) {
        Alimento alimento = Alimento.getInstance();
        alimento.setNombre("Hamburguesa");
        alimento.setPrecio(456.0);
        System.out.println(alimento.getNombre());
        System.out.println(alimento.getPrecio());
    }
}
