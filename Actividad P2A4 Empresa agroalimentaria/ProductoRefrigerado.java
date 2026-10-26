package pms.lychi;

public class ProductoRefrigerado extends ProductoConTemperatura{
    private String codigoSupervision;

    public ProductoRefrigerado(double temperatura, String cs){
        super(temperatura);
        this.codigoSupervision = cs;
    }
    
    public String getCodigoSupervision(){
        return this.codigoSupervision;
    }

    public void setCodigoSupervision(String cs){
        this.codigoSupervision = cs;
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + 
        "\nCodigo de supervision: " + this.codigoSupervision;
    }
}