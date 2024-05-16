public class Main {
    public static void main(String[] args) {
        Mano manoCuprier = new Mano();
        Mano manoJugador = new Mano();
        Carta carta = new Carta();

        manoCuprier.agregarCartaManoCuprier();
        manoCuprier.mostrarCartaManoCuprier();
        manoJugador.agregarCartaManoJugador();
        manoJugador.mostrarManoJugador();
    }
}