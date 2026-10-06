public class Main {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Steve", 20.0, 15);
        jugador1.atacar();
        System.out.println(jugador1);

        System.out.println();

        Creeper creeper1 = new Creeper("Creeper Electrificado", 20.0, 6.0);
        creeper1.explotar();
        System.out.println(creeper1);

        System.out.println();

        Aldeano aldeano1 = new Aldeano("Villager #4", 20.0, "Armero");
        aldeano1.comerciar();
        System.out.println(aldeano1);

    }
}