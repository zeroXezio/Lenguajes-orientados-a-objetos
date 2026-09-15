public class Auto {

    private int modelo;
    public String marca;

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /*public void imprimir() {
        System.out.println("\nModelo: " + this.modelo + "\nMarca: " + this.marca);
    }*/
    
    @Override
    public String toString(){
        return "\nModelo: " + this.modelo + "\nMarca: " + this.marca;
    }
}
