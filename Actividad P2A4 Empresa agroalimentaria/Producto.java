package pms.lychi;

import java.time.LocalDate;

public abstract class Producto {
    private LocalDate fechaCaducidad;
    private String numeroLote;

    public Producto(){
        this.fechaCaducidad = LocalDate.now();
        this.numeroLote = "LOTE-000000";
    }

    public Producto(LocalDate f, String n){
        this.fechaCaducidad = f;
        this.numeroLote = n;
    }

    public LocalDate getFechaCaducidad(){
        return this.fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate f){
        this.fechaCaducidad = f;
    }

    public String getNumeroLote(){
        return this.numeroLote;
    }

    public  void setNumeroLote(String n){
        this.numeroLote = n;
    }

    public abstract String mostrarInformacion();
}
