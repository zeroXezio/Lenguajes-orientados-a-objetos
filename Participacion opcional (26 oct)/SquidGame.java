//Ian Alexander Paz Hernandez
//TI (Tecnologias de la informacion)
//ID: 00603548

public abstract class SquidGame {
    private double premio;
    private double numeroJugadores;

    public SquidGame() {
        this.premio = 0;
        this.numeroJugadores = 0;
    }

    public void setPremio(double premio) {
        this.premio = premio;
    }

    public double getPremio() {
        return premio;
    }

    public void setNumJugadores(double numeroJugadores) {
        this.numeroJugadores = numeroJugadores;
    }

    public double getNumJugadores() {
        return numeroJugadores;
    }

    public abstract void jugar();

    public boolean finJuego(int decision) {
        if (decision == 2) {
            System.out.println("¡Fin del juego! ¡Han perdido $" + premio + " millones, pero siguen vivos!");
            return true; // Juego terminado voluntariamente
        } else {
            System.out.println("El juego continúa.");
            return false;
        }
    }
}