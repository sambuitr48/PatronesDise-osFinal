package facade;

public class Main {
    public static void main(String[] args) {
        Switche switche = new Switche();
        FacadeEx homeFacade = new FacadeEx(switche);

        homeFacade.prender();
        System.out.println("las luces estan prendidas");

        homeFacade.apagar();
    }
}
