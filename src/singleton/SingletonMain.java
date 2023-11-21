package singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonEx adopcion = SingletonEx.getAdopcion();

        adopcion.setColor("Verdiamarillo");
        adopcion.setId(91283812);
        adopcion.setNombre("Diego");
        System.out.println(adopcion);

 ;
    }
}
