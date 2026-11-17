//Ian Alexander Paz Hernández
//Carrera: TI
//ID: 00603548
public class Gato extends Mamifero {
    private int nBigotes;

    public Gato(String n, double p, int b) {
        super(n, p);
        this.nBigotes = b;
    }

    public Gato() {
        super();
        this.nBigotes = 0;
    }

    public int getNBigotes() {
        return nBigotes;
    }

    public void setNBigotes(int nBigotes) {
        this.nBigotes = nBigotes;
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " se alimenta de croquetas y carne");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: Miau!");
    }
}