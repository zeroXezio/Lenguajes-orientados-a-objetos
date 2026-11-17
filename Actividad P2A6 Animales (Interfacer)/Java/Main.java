//Ian Alexander Paz Hernández
//Carrera: TI
//ID: 00603548
public class Main {
    public static void main(String[] args) {
        Gato miGato = new Gato("Tamal", 5.37, 36);
        Vaca miVaca = new Vaca("Clarabella", 900.0, 25.5);
        Ballena miBallena = new Ballena("Preciosa", 340000.0);

        System.out.println("Nombre: " + miGato.getNombre() + "\nPeso: " + miGato.getPeso() + "kg\nNumero de Bigotes: " + miGato.getNBigotes());
        miGato.comer();
        miGato.comer("Pescado");
        miGato.comer("Croquetas", 2);
        miGato.alimentarse();
        miGato.emitirSonido();

        System.out.println();

        System.out.println("Nombre: " + miVaca.getNombre() + "\nPeso: " + miVaca.getPeso() + "kg\nLeche Producida al dia: " + miVaca.getLitrosDeLeche() + "l");
        miVaca.comer();
        miVaca.comer("Pasto");
        miVaca.comer("Heno", 2);
        miVaca.alimentarse();
        miVaca.emitirSonido();

        System.out.println();

        System.out.println("Nombre: " + miBallena.getNombre() + "\nPeso: " + miBallena.getPeso() + "kg");
        miBallena.comer();
        miBallena.comer("Plancton");
        miBallena.comer("Krill", 2);
        miBallena.alimentarse();
        miBallena.emitirSonido();
    }
}