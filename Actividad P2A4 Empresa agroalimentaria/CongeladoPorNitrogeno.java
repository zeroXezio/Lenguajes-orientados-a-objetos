package pms.lychi;

public class CongeladoPorNitrogeno extends ProductoCongelado{
    private String metodoCongelacion;
    private double tiempoExposicion;

    public CongeladoPorNitrogeno(String m, double t){
        super();
        this.metodoCongelacion = m;
        setTiempoExposicion(t);
    }

    public String getMetodoCongelacion(){
        return this.metodoCongelacion;
    }

    public void setMetodoCongelacion(String mc){
        this.metodoCongelacion = mc;
    }

    public double getTiempoExposicion(){
        return this.tiempoExposicion;
    }

    public void setTiempoExposicion(double segundos){
    if(segundos >= 0){
        this.tiempoExposicion = segundos;
        }
    }

    public void setTiempoExposicion(double valor, String unidad){
        if (unidad.equalsIgnoreCase("segundos")){
            setTiempoExposicion(valor);
        }
        else if (unidad.equalsIgnoreCase("minutos")){
            setTiempoExposicion(valor * 60);
        }
        else {
            System.out.println("Debes usar una unidad valida");
        }
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +
                "\nMetodo de congelacion: " + this.metodoCongelacion +
                "\nTiempo de exposicion: " + this.tiempoExposicion;
    }
}
