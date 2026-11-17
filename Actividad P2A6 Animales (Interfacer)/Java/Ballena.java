//Ian Alexander Paz Hernández
//Carrera: TI
//ID: 00603548
public class Ballena extends Mamifero {
    public Ballena(String n, double p) {
        super(n, p);
    }

    public Ballena() {
        super();
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " se alimenta de plancton y krill");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " emite un canto de ballena");
    }
}