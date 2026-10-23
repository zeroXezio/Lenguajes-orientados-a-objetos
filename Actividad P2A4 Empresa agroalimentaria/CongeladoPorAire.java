package pms.lychi;

public class CongeladoPorAire extends ProductoCongelado{
    private  double porcentajeNitrogeno, porcentajeOxigeno, porcentajeCO2, porcentajeVaporAgua;

    public CongeladoPorAire(double n, double o, double c, double v){
        super();
        setPorcentajeNitrogeno(n);
        setPorcentajeOxigeno(o);
        setPorcentajeCO2(c);
        setPorcentajeVaporAgua(v);
    }

    public double getPorcentajeNitrogeno(){
        return this.porcentajeNitrogeno;
    }

    public void setPorcentajeNitrogeno(double n){
        if (n >= 0 && n <= 100) {
            this.porcentajeNitrogeno = n;
        }
    }

    public double getPorcentajeOxigeno(){
        return this.porcentajeOxigeno;
    }

    public void setPorcentajeOxigeno(double o){
        if (o >= 0 && o <= 100) {
            this.porcentajeOxigeno = o;
        }
    }

    public double getPorcentajeCO2(){
        return this.porcentajeCO2;
    }

    public void setPorcentajeCO2(double c){
        if (c >= 0 && c <= 100) {
            this.porcentajeCO2 = c;
        }
    }
    
    public double getPorcentajeVaporAgua(){
        return this.porcentajeVaporAgua;
    }

    public void setPorcentajeVaporAgua(double v){
        if (v >= 0 && v <= 100) {
            this.porcentajeVaporAgua = v;
        }
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +
                "\n% de Nitrogeno: " + this.porcentajeNitrogeno +
                "\n% de Oxigeno: " + this.porcentajeOxigeno +
                "\n% de CO2: " + this.porcentajeCO2 +
                "\n% de Vapor Agua: " + this.porcentajeVaporAgua;
    }

}
