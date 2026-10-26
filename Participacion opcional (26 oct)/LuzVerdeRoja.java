//Ian Alexander Paz Hernandez
//TI (Tecnologias de la informacion)
//ID: 00603548

public class LuzVerdeRoja extends SquidGame {
    private int luz;

    public void setLuz(int luz) {
        this.luz = luz;
    }

    public int getLuz() {
        return luz;
    }

    @Override
    public void jugar() {
        if (this.luz == 1) {
            System.out.println("Los jugadores se mueven rápidamente.");
        } else {
            System.out.println("Los jugadores se detienen.");
            // Reduce el número de jugadores en un 10%
            double jugadoresActuales = getNumJugadores();
            double eliminados = jugadoresActuales * 0.10;
            setNumJugadores(jugadoresActuales - eliminados);
        }
        System.out.println("Jugadores restantes tras esta ronda: " + (int)getNumJugadores());
    }
}