package pms.lychi;

import java.time.LocalDate;

public class ProductoFresco extends ProductoEnvasado {
    private String tipoProducto;

    public ProductoFresco(LocalDate fc, String nl, LocalDate fe, String po, String tp){
        super(fc, nl, fe, po);
        this.tipoProducto = tp;
    }

    public ProductoFresco(String nl, LocalDate fc, String po){
        super(fc, nl, LocalDate.now(), po);
        this.tipoProducto = "Fresco";
    }

    public String getTipoProducto(){
        return  this.tipoProducto;
    }

    public void setTipoProducto(String tp){
        this.tipoProducto = tp;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + "\nTipo: " + this.tipoProducto;
    }
}
