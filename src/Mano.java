import java.util.ArrayList;

public class Mano {
    private ArrayList<Object> manoCuprier = new ArrayList<>();
    private ArrayList<Object> manoJugador = new ArrayList<>();
    Carta carta = new Carta();

    // Agrega carta a mano Cuprier
    public void agregarCartaManoCuprier() {
        manoCuprier.add(carta.sacarCarta());
    }

    // Muestra una lista de las cartas de la mano del Cuprier
    public void mostrarManoCuprier() {
        System.out.println(manoCuprier);
    }

    // Muestra solo la primera carta del Cuprier
    public void mostrarCartaManoCuprier() {
        System.out.println("Carta visible Cuprier: " + manoCuprier.get(0));
    }

    // Agrega carta a mano Jugador
    public void agregarCartaManoJugador() {
        manoJugador.add(carta.sacarCarta());
    }

    // Muestra una lista de las cartas de la mano del Jugador
    public void mostrarManoJugador() {
        System.out.println("Mano Jugador: " + manoJugador);
    }
}
