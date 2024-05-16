public class Main {
    public static void main(String[] args) {
        // Se crean las manos del Jugador y el Cuprier
        Mano manoCuprier = new Mano();
        Mano manoJugador = new Mano();

        // Se reparten las cartas iniciales
        for (int i = 1; i <= 2; i++) {
            manoCuprier.agregarCartaManoCuprier();
            manoJugador.agregarCartaManoJugador();
        }

        manoCuprier.mostrarManoCuprier();
        manoCuprier.mostrarCartaManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier());
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador());
    }
}