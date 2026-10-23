package pms.lychi;

public class CongeladoPorAire extends ProductoCongelado{
    private int total;
    private  double porcentajeNitrogeno, porcentajeOxigeno, porcentajeCO2, porcentajeVaporAgua;

    public CongeladoPorAire(double n, double o, double c, double v){
        super();
        this.porcentajeNitrogeno = n;
        this.porcentajeOxigeno = o;
        this.porcentajeCO2 = c;
        this.porcentajeVaporAgua = v;
    }

    public boolean validarPorcentajes(){
        if(this.porcentajeNitrogeno >= 0 && this.porcentajeOxigeno >= 0 && this.porcentajeCO2 >= 0 && this.porcentajeVaporAgua >= 0 && (this.porcentajeNitrogeno + this.porcentajeOxigeno + this.porcentajeCO2 + this.porcentajeVaporAgua <= 100)){
            return true;
        }
        return false;
    }

    @Override
    public String mostrarInformacion(){
        return super.getTemperatura() +
                "% de Nitrogeno: " + this.porcentajeNitrogeno +
                "% de Oxigeno: " + this.porcentajeOxigeno +
                "% de CO2: " + this.porcentajeCO2 +
                "% de Vapor Agua: " + this.porcentajeVaporAgua +
                "Porcentajes validos: " + validarPorcentajes();
    }

}
