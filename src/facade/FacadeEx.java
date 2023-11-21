package facade;

public class FacadeEx {
    private Switche switche;

    public FacadeEx(Switche switche) {
        this.switche = switche;
    }

    public void prender() {
        System.out.println("se sube el switche");
        switche.turnOn();
    }

    public void apagar() {
        System.out.println("Se baja el switche");
        System.out.println("apagando las luces");
        switche.turnOff();
    }
}
