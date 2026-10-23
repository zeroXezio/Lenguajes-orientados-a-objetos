package pms.lychi;

public abstract class ProductoConTemperatura extends ProductoEnvasado{
    private double temperaturaMantenimiento;

    public ProductoConTemperatura(){
        super();
        this.temperaturaMantenimiento = 0.0;
    }

    public ProductoConTemperatura(double t){
        super();
        this.temperaturaMantenimiento = t;
    }

    public double getTemperatura(){
        return this.temperaturaMantenimiento;
    }

    public void setTemperatura(double t){
        this.temperaturaMantenimiento = t;
    }

    public void actualizarTemperatura(double celsius){
        this.temperaturaMantenimiento = celsius;
    }

    public void actualizarTemperatura(double valor, String unidad){
        if (unidad.equalsIgnoreCase("celsius")){
            this.temperaturaMantenimiento = valor;
        }
        else if (unidad.equalsIgnoreCase("kelvin")){
            this.temperaturaMantenimiento = valor - 273.15;
        }
        else if (unidad.equalsIgnoreCase("fahrenheit")){
            this.temperaturaMantenimiento = (valor - 32) * 5 / 9.0;
        } else {
            System.out.println("Debes usar una unidad valida");
        }
    }

    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() +
                "\nTemperatura: " + this.temperaturaMantenimiento;
    }
}
