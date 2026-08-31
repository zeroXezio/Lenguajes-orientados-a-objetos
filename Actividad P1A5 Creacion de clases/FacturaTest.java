// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

import java.util.Scanner;

class Factura {
    private String numPiezas;
    private String descripcion;
    private int cantidad;
    private double precio;

    public Factura(String numPiezas, String descripcion, int cantidad, double precio) {
        this.numPiezas = numPiezas;
        this.descripcion = descripcion;
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public void setNumPiezas(String numPiezas) {
        this.numPiezas = numPiezas;
    }

    public String getNumPiezas() {
        return numPiezas;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            this.cantidad = 0;
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0.0) {
            this.precio = precio;
        } else {
            this.precio = 0.0;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public double obtenerMontoFactura() {
        return cantidad * precio;
    }
}

public class FacturaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa el numero de piezas: ");
        String numPiezas = input.nextLine();

        System.out.print("Agrega la descripcion: ");
        String descripcion = input.nextLine();

        System.out.print("Ingresa la cantidad: ");
        int cantidad = input.nextInt();

        System.out.print("Ingresa el precio: ");
        double precio = input.nextDouble();

        Factura ferre = new Factura(numPiezas, descripcion, cantidad, precio);

        System.out.println("----------------------------------------");
        System.out.println("Numero de pieza: " + ferre.getNumPiezas());
        System.out.println("Descripcion: " + ferre.getDescripcion());
        System.out.println("Cantidad: " + ferre.getCantidad());
        System.out.println("Precio unitario: " + ferre.getPrecio());
        System.out.println("Factura: " + ferre.obtenerMontoFactura());
    }
}