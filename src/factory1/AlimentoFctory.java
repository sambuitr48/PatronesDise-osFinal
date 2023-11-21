package factory1;

public class AlimentoFctory {
    public static Alimento getAlimento(String tipo){
        if (tipo.equalsIgnoreCase("A")) {
            return new AlimentoA();
        } else if (tipo.equalsIgnoreCase("B")) {
            return new AlimentoB();
        }
        return null;
    }
}
