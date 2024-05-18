import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Se crean las manos del Jugador y el Cuprier
        Mano manoCuprier = new Mano();
        Mano manoJugador = new Mano();

        // Se crea el objeto Jugador para controlar las acciones del Jugador
        Jugador jugador = new Jugador();

        // Se crea el objeto Interfaz para mostrar mensajes al Jugador
        Interfaz interfaz = new Interfaz();

        // Variables para controlar el flujo del juego
        boolean continuarJuegoCuprier = false; // Controla el turno del Cuprier
        int restanteJugador = 0; // Puntos restantes Jugador si no llega a 21
        int restanteCuprier = 0; // Puntos restantes Cuprier si no llega a 21
        String opcion; // Opción del menú de inicio

        // Menú de inicio
        do {
            // Se muestra las opciones del menú
            interfaz.mostrarMenu();
            opcion = sc.nextLine().toUpperCase(); // Jugador ingresa opción
            System.out.println("");

            // Se muestra las reglas del juego
            if (opcion.equals("R")) {
                interfaz.mostrarReglas();
                opcion = sc.nextLine().toUpperCase(); // Jugador ingresa cualquier letra para salir
                System.out.println("");
                if (opcion.equals("S")) {
                    continue;
                }
            } else if (opcion.equals("J")) {
                break; // Jugador inicia el juego
            } else {
                System.out.println("Opción inválida. Por favor, ingresa 'R' para leer las reglas o 'J' para jugar.");
            }
        } while (true);

        // Se reparten las cartas iniciales
        for (int i = 1; i <= 2; i++) {
            manoCuprier.agregarCartaManoCuprier();
            manoJugador.agregarCartaManoJugador();
        }

        // Se muestra la primera mano
        interfaz.mostrarPrimeraMano(manoCuprier, manoJugador);

        // Se comprueba si el Jugador ha conseguido blackjack en la primera mano
        if (manoJugador.valorManoJugador() == 21) {
            interfaz.mostrarBlackjackPrimeraMano(manoCuprier, manoJugador);

            if (manoCuprier.valorManoCuprier() == 21) {
                System.out.println("EMPATE");
            } else {
                System.out.println("¡BLACKJACK!");
                System.out.println("¡GANASTE!");
            }
        } else {
            // Turno del Jugador
            do {
                interfaz.mostrarMensajeDesicionJugador();
                boolean desicion = jugador.desicionJugador();

                if (desicion == true) {
                    manoJugador.agregarCartaManoJugador();
                    interfaz.mostrarJugadorPideCarta(manoCuprier, manoJugador);

                    if (manoJugador.valorManoJugador() == 21) {
                        System.out.println("¡BLACKJACK!\n");
                        break;
                    } else if (manoJugador.valorManoJugador() > 21) {
                            interfaz.mostrarJugadorPasaPuntaje(manoCuprier, manoJugador);
                            break;
                    }
                } else {
                    System.out.println("DECIDES PARAR\n");
                    interfaz.mostrarTurnoCuprier(manoCuprier);
                    continuarJuegoCuprier = true;
                    break;
                }
            } while (true);
        }

        // Turno del Cuprier
        while (continuarJuegoCuprier == true) {
            if (manoCuprier.valorManoCuprier() <= 16) {
                manoCuprier.agregarCartaManoCuprier();
                interfaz.mostrarCuprierPideCarta(manoCuprier);

                if (manoCuprier.valorManoCuprier() > 21) {
                    interfaz.mostrarCuprierPasaPuntaje(manoCuprier, manoJugador);
                    break;
                }
            } else {
                System.out.println("CUPRIER PARA\n");
                if (manoCuprier.valorManoCuprier() > manoJugador.valorManoJugador()) {
                    interfaz.mostrarCuprierGana(manoCuprier, manoJugador);
                } else if (manoCuprier.valorManoCuprier() == manoJugador.valorManoJugador()) {
                    interfaz.mostrarResultadoEmpate(manoCuprier, manoJugador);
                } else {
                    interfaz.mostrarJugadorGana(manoCuprier, manoJugador);
                }

                break;
            }
        }
    }
}