package pms.lychi;

public class CongeladoPorNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private double tiempoExposicion;

    public CongeladoPorNitrogeno(String m, double t){
        super();
        this.metodoCongelacion = m;
        this.tiempoExposicion = t;
    }

    public void setTiempoExposicion(double segundos){
        this.tiempoExposicion = segundos;
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +
                "\nMetodo de congelacion: " + this.metodoCongelacion +
                "\nTiempo de exposicion: " + this.tiempoExposicion;
    }
}
