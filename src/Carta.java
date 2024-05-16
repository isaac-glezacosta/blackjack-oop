import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Carta {
    Random rand = new Random();
    private ArrayList<Character> cartas = new ArrayList<>(Arrays.asList('A', '2', '3', '4', '5', '6', '7', '8', '9', 'D', 'J', 'Q', 'K'));
    private int numeroAleatorio;

    public Character sacarCarta() {
        numeroAleatorio = rand.nextInt(13);
        return cartas.get(numeroAleatorio);
    }
}
