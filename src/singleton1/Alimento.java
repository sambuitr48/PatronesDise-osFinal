package singleton1;

public class Alimento {
    private static Alimento instance;
    private String nombre;
    private double precio;

    public Alimento() {}

    public static Alimento getInstance() {
        return instance;
    }

    public static void setInstance(Alimento instance) {
        Alimento.instance = instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
