//Ian Alexander Paz Hernández
//Carrera: TI
//ID: 00603548
public abstract class Mamifero implements ISonido {
    private String nombre;
    private double peso;

    public Mamifero(String n, double p) {
        this.nombre = n;
        this.peso = p;
    }

    public Mamifero() {
        this.nombre = "";
        this.peso = 0.0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    public void comer(String comida) {
        System.out.println(nombre + " esta comiendo " + comida);
    }

    public void comer(String comida, int cantidad) {
        System.out.println(nombre + " esta comiendo " + cantidad + " porciones de " + comida);
    }

    public abstract void alimentarse();

    @Override
    public abstract void emitirSonido();
}