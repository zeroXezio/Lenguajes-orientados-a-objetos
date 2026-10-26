package pms.lychi;

import java.time.LocalDate;

public abstract class ProductoEnvasado extends Producto {
    private LocalDate fechaEnvasado;
    private  String paisOrigen;

    public ProductoEnvasado(){
        super();
        this.fechaEnvasado = LocalDate.now();
        this.paisOrigen = "Null";
    }

    public ProductoEnvasado(LocalDate fc, String nl, LocalDate fe, String po){
        super(fc, nl);
        this.fechaEnvasado = fe;
        this.paisOrigen = po;
    }

    public LocalDate getFechaEnvasado() {
        return this.fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen(){
        return this.paisOrigen;
    }

    public void setPaisOrigen(String po){
        this.paisOrigen = po;
    }

    @Override
    public String mostrarInformacion() {
        return "\nLote: " + getNumeroLote() +
                "\nCaducidad: " + getFechaCaducidad() +
                "\nEnvasado: " + this.fechaEnvasado +
                "\nOrigen: " + this.paisOrigen;
    }
}
