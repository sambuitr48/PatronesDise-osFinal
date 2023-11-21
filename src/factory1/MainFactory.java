package factory1;

import java.util.Objects;

public class MainFactory {
    public static void main(String[] args) {
        Alimento a1 = AlimentoFctory.getAlimento("A");
        Objects.requireNonNull(a1).mostrarInfo();
        Alimento a2 = AlimentoFctory.getAlimento("B");
        Objects.requireNonNull(a2).mostrarInfo();
    }
}
