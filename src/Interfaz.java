public class Interfaz {
    public void mostrarMenu() {
        System.out.println("¡Bienvenido al juego Blackjack!");
        System.out.println("(R) - Leer reglas");
        System.out.println("(J) - Jugar");
        System.out.print("Ingresa tu opción (R/J): ");
    }

    public static void mostrarReglas() {
        System.out.println("Reglas del juego Blackjack:");
        System.out.println("1. El jugador y el Cuprier reciben dos cartas al inicio, una de las cuales el jugador puede ver del Cuprier.");
        System.out.println("2. El jugador gana automáticamente si obtiene un Blackjack (suma de 21 con las dos primeras cartas) y el Cuprier no lo hace. Si ambos obtienen Blackjack, es un empate.");
        System.out.println("3. Durante su turno, el jugador puede pedir otra carta (0) o parar (1). Si la suma de cartas del jugador supera 21 al pedir otra carta, pierde.");
        System.out.println("4. Durante el turno del Cuprier, debe pedir carta si su suma total es 16 o menos, y parar si es 17 o más.");
        System.out.println("5. Gana el jugador con la suma total más cercana a 21 sin pasarse. En caso de empate, el juego termina en empate.");
        System.out.println("6. Los ases pueden valer 1 o 11, dependiendo de si la suma total de cartas supera 21 o no.");
        System.out.println("Ingresa cualquier letra para salir...");
    }

    public void mostrarPrimeraMano(Mano manoCuprier, Mano manoJugador) {
        System.out.println("PRIMERA MANO");
        manoCuprier.mostrarCartaManoCuprier(); // Mostrar carta visible mano Cuprier
        manoJugador.valorManoJugador(); // Valor mano Jugador
        manoJugador.mostrarManoJugador(); // Mostrar primera mano Jugador
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador() + "\n"); // Mostrar suma mano Jugador
    }

    public void mostrarBlackjackPrimeraMano(Mano manoCuprier, Mano manoJugador) {
        System.out.println("¡BLACKJACK!");
        System.out.println("Puntos Jugador" + manoJugador.valorManoJugador());
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier() + "\n");
    }

    public void mostrarMensajeDesicionJugador() {
        System.out.println("(0) - Pedir");
        System.out.println("(1) - Parar");
        System.out.print("Ingresa tu opción (0/1): ");
    }

    public void mostrarJugadorPideCarta(Mano manoCuprier, Mano manoJugador) {
        System.out.println("PIDES CARTA");
        manoCuprier.mostrarCartaManoCuprier();
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador() + "\n");
    }

    public void mostrarJugadorPasaPuntaje(Mano manoCuprier, Mano manoJugador) {
        System.out.println("TU MANO SUPERA LOS 21 PUNTOS");
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador() + "\n");
        System.out.println("CUPRIER GANA");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier() + "\n");
    }

    public void mostrarTurnoCuprier(Mano manoCuprier) {
        System.out.println("TURNO CUPRIER");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier() + "\n");
    }

    public void mostrarCuprierPideCarta(Mano manoCuprier) {
        System.out.println("CUPRIER PIDE CARTA");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier() + "\n");
    }

    public void mostrarResultadoEmpate(Mano manoCuprier, Mano manoJugador) {
        System.out.println("EMPATE");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier());
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador() + "\n");
    }

    public void mostrarCuprierPasaPuntaje(Mano manoCuprier, Mano manoJugador) {
        System.out.println("LA MANO DEL CUPRIER SUPERA LOS 21 PUNTOS");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier() + "\n");
        System.out.println("¡JUGADOR GANA!");
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador() + "\n");
    }

    public void mostrarCuprierGana(Mano manoCuprier, Mano manoJugador) {
        System.out.println("CUPRIER GANA");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier());
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador());
    }

    public void mostrarJugadorGana(Mano manoCuprier, Mano manoJugador) {
        System.out.println("JUGADOR GANA");
        manoCuprier.mostrarManoCuprier();
        System.out.println("Puntos Cuprier: " + manoCuprier.valorManoCuprier());
        manoJugador.mostrarManoJugador();
        System.out.println("Puntos Jugador: " + manoJugador.valorManoJugador());
    }
}