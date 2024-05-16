import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mano {
    private ArrayList<Character> manoCuprier = new ArrayList<>();
    private ArrayList<Character> manoJugador = new ArrayList<>();
    List<Character> cartasDiezPuntos = Arrays.asList('D', 'J', 'Q', 'K');
    Carta carta = new Carta();
    private int valorManoCuprier = 0;
    private int valorManoJugador = 0;

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

    // Calcular el valor de la mano del Cuprier
    public int valorManoCuprier() {
        for (int i = 0; i < manoCuprier.size(); i++) {
            if (manoCuprier.get(i) == 'A') {
                if (valorManoCuprier + 11 <= 21) {
                    valorManoCuprier += 11;
                } else {
                    valorManoCuprier += 1;
                }
            } else if (cartasDiezPuntos.contains(manoCuprier.get(i))) {
                valorManoCuprier += 10;
            } else {
                valorManoCuprier += Integer.parseInt(String.valueOf(manoCuprier.get(i)));
            }
        }

        return valorManoCuprier;
    }

    // Agrega carta a mano Jugador
    public void agregarCartaManoJugador() {
        manoJugador.add(carta.sacarCarta());
    }

    // Muestra una lista de las cartas de la mano del Jugador
    public void mostrarManoJugador() {
        System.out.println("Mano Jugador: " + manoJugador);
    }

    // Calcular el valor de la mano del Jugador
    public int valorManoJugador() {
        for (int i = 0; i < manoJugador.size(); i++) {
            if (manoJugador.get(i) == 'A') {
                if (valorManoJugador + 11 <= 21) {
                    valorManoJugador += 11;
                } else {
                    valorManoJugador += 1;
                }
            } else if (cartasDiezPuntos.contains(manoJugador.get(i))) {
                valorManoJugador += 10;
            } else {
                valorManoJugador += Integer.parseInt(String.valueOf(manoJugador.get(i)));
            }
        }

        return valorManoJugador;
    }
}
