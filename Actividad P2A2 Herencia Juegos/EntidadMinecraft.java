public class EntidadMinecraft {
    private String nombre;
    protected double vida;

    public EntidadMinecraft(String n, double v) {
        this.nombre = n;
        this.vida = v;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public double getVida() {
        return this.vida;
    }

    public void setVida(double v) {
        this.vida = v;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre +
               "\nVida: " + this.vida;
    }
}

class Jugador extends EntidadMinecraft {
    private int nivelExperiencia;

    public Jugador(String n, double v, int exp) {
        super(n, v);
        this.nivelExperiencia = exp;
    }

    public void atacar() {
        System.out.println(getNombre() + " ataco a un objetivo provocando danio.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nNivel de Experiencia: " + this.nivelExperiencia;
    }
}

class Creeper extends EntidadMinecraft {
    private double radioExplosion;

    public Creeper(String n, double v, double r) {
        super(n, v);
        this.radioExplosion = r;
    }

    public void explotar() {
        System.out.println("SSSSS... BOOM! " + getNombre() + " exploto con un radio de " + this.radioExplosion + " bloques.");
        this.vida = 0; // El Creeper muere al explotar
    }

    @Override
    public String toString() {
        return super.toString() + "\nRadio de Explosion: " + this.radioExplosion + " bloques";
    }
}

class Aldeano extends EntidadMinecraft {
    private String profesion;

    public Aldeano(String n, double v, String prof) {
        super(n, v);
        this.profesion = prof;
    }

    public void comerciar() {
        System.out.println("El aldeano " + getNombre() + " (" + this.profesion + ") te ofrece esmeraldas por tus materiales.");
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfesion: " + this.profesion;
    }
}