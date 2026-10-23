package pms.lychi;

public class CongeladoPorAgua extends ProductoCongelado{
    private double salinidad;

    public CongeladoPorAgua(double s){
        super();
        this.salinidad = s;
    }

    public double getSalinidad(){
        return this.salinidad;
    }

    public void setSalinidad(double salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +
                "\nSalinidad: " + this.salinidad;
    }
}
