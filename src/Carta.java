import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Carta {
    Random rand = new Random();
    ArrayList<Object> cartas = new ArrayList<>(Arrays.asList('A', 2, 3, 4, 5, 6, 7, 8, 9, 10, 'J', 'Q', 'K'));
    int numeroAleatorio;

    public Object sacarCarta() {
        numeroAleatorio = rand.nextInt(13);
        return cartas.get(numeroAleatorio);
    }
}
