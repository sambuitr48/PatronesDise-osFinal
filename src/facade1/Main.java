package facade1;

public class Main {
    public static void main(String[] args) {
        AlmacenVideojuegosFacade almacenFacade = new AlmacenVideojuegosFacade();
        almacenFacade.comprarJuego("The Legend of Zelda", 59.99, "Calle Principal 123");
    }
}
