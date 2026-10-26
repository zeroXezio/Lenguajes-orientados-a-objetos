//Ian Alexander Paz Hernandez
//TI (Tecnologias de la informacion)
//ID: 00603548

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objetos de las clases LuzVerdeRoja y Ppopgi
        LuzVerdeRoja juego1 = new LuzVerdeRoja();
        Ppopgi juego2 = new Ppopgi();

        System.out.println("=== BIENVENIDO A SQUID GAME ===");
        
        // Solicitud del monto del premio y cantidad de jugadores
        System.out.print("Ingrese el monto del premio (en millones): ");
        double premio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad inicial de jugadores: ");
        double numJugadores = scanner.nextDouble();

        juego1.setPremio(premio);
        juego1.setNumJugadores(numJugadores);

        // --- PRIMER JUEGO: Luz Verde, Luz Roja ---
        System.out.println("\n--- PRIMER JUEGO: Luz Verde, Luz Roja ---");
        System.out.println("Elija una opción:");
        System.out.println("1. Luz Verde");
        System.out.println("2. Luz Roja");
        System.out.print("Opción: ");
        int opcionLuz = scanner.nextInt();

        juego1.setLuz(opcionLuz);
        juego1.jugar();

        double jugadoresPostJuego1 = juego1.getNumJugadores();
        System.out.println(">> Jugadores que pasan a la siguiente ronda: " + (int)jugadoresPostJuego1);

        if (jugadoresPostJuego1 <= 0) {
            System.out.println("¡Todos los jugadores han sido eliminados! Fin del juego.");
            scanner.close();
            return;
        }

        // --- SEGUNDO JUEGO: Ppopgi ---
        System.out.println("\n--- SEGUNDO JUEGO: Ppopgi ---");
        juego2.setPremio(premio);
        juego2.setNumJugadores(jugadoresPostJuego1);

        System.out.println("Elija una forma para la galleta:");
        System.out.println("1. Paraguas");
        System.out.println("2. Triángulo");
        System.out.println("3. Círculo");
        System.out.print("Opción: ");
        int opcionForma = scanner.nextInt();

        juego2.setForma(opcionForma);
        juego2.jugar();

        double jugadoresPostJuego2 = juego2.getNumJugadores();
        System.out.println(">> Jugadores que quedan después del segundo juego: " + (int)jugadoresPostJuego2);

        if (jugadoresPostJuego2 <= 0) {
            System.out.println("¡Todos los jugadores han sido eliminados! Fin del juego.");
            scanner.close();
            return;
        }

        // --- DECISIÓN FINAL ---
        System.out.println("\n--- DECISIÓN FINAL ---");
        System.out.println("¿Desea seguir jugando?");
        System.out.println("1. Continuar jugando");
        System.out.println("2. Terminar juego");
        System.out.print("Opción: ");
        int decision = scanner.nextInt();

        juego2.finJuego(decision);

        scanner.close();
    }
}