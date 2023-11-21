package singleton;
public class SingletonEx {
    private static SingletonEx adopcion;
    private static String color;
    private static Integer id;
    private static String nombre;

    public SingletonEx(String color, Integer id, String nombre) {
    this.color = color;
    this.id = id;
    this.nombre = nombre;
    }

    public static SingletonEx getAdopcion() {
        if(adopcion == null){
            adopcion = new SingletonEx(color, id, nombre);
        }
        return adopcion;
    }

    public static void setAdopcion(SingletonEx adopcion) {
        SingletonEx.adopcion = adopcion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "SingletonEx{" +
                "color='" + color + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
