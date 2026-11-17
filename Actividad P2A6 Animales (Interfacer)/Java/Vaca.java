//Ian Alexander Paz Hernández
//Carrera: TI
//ID: 00603548
public class Vaca extends Mamifero {
    private double litrosDeLeche;

    public Vaca(String n, double p, double l) {
        super(n, p);
        this.litrosDeLeche = l;
    }

    public Vaca() {
        super();
        this.litrosDeLeche = 0.0;
    }

    public double getLitrosDeLeche() {
        return litrosDeLeche;
    }

    public void setLitrosDeLeche(double litrosDeLeche) {
        this.litrosDeLeche = litrosDeLeche;
    }

    @Override
    public void alimentarse() {
        System.out.println(getNombre() + " se alimenta de pasto y heno");
    }

    @Override
    public void emitirSonido() {
        System.out.println(getNombre() + " dice: Muuu!");
    }
}