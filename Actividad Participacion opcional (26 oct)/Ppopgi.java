//Ian Alexander Paz Hernandez
//TI (Tecnologias de la informacion)
//ID: 00603548

public class Ppopgi extends SquidGame {
    private int forma; // 1: Paraguas, 2: Triángulo, 3: Círculo

    public void setForma(int forma) {
        this.forma = forma;
    }

    public int getForma() {
        return forma;
    }

    @Override
    public void jugar() {
        double jugadoresActuales = getNumJugadores();
        String nombreForma = "";
        double porcentajeReduccion = 0.0;

        switch (this.forma) {
            case 1:
                nombreForma = "Paraguas";
                porcentajeReduccion = 0.10; // 10%
                break;
            case 2:
                nombreForma = "Triángulo";
                porcentajeReduccion = 0.20; // 20%
                break;
            case 3:
                nombreForma = "Círculo";
                porcentajeReduccion = 0.20; // 20%
                break;
            default:
                System.out.println("Forma no válida.");
                return;
        }

        System.out.println("A " + (int)jugadoresActuales + " jugadores les tocó el " + nombreForma + ".");
        
        double eliminados = jugadoresActuales * porcentajeReduccion;
        setNumJugadores(jugadoresActuales - eliminados);

        System.out.println("Jugadores restantes tras esta ronda: " + (int)getNumJugadores());
    }
}