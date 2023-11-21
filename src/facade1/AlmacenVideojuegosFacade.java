package facade1;

public class AlmacenVideojuegosFacade {
    private Inventario inventario;
    private Pagos pagos;
    private Envio envio;
    public AlmacenVideojuegosFacade() {
        this.inventario = new Inventario();
        this.pagos = new Pagos();
        this.envio = new Envio();
    }
    public void comprarJuego(String juego, double monto, String direccion) {
        inventario.verificarStock(juego);
        pagos.procesarPago(juego, monto);
        envio.enviarJuego(juego, direccion);
        System.out.println("¡Compra completada!");
    }
}
