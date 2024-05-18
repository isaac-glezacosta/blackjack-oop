import java.util.InputMismatchException;
import java.util.Scanner;

public class Jugador {
    private int desicion;
    Scanner sc = new Scanner(System.in);

    // Jugador toma desición
    public boolean desicionJugador() {
        try {
            desicion = sc.nextInt();
            System.out.println("");

            if (desicion == 0) {
                return true;
            } else {
                return false;
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, ingresa una de las opciones.");
            sc.next();
            return desicionJugador();
        }
    }
}
