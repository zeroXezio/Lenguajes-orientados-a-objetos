// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

using System;

class Factura {
    private string numPiezas;
    private string descripcion;
    private int cantidad;
    private double precio;

    public Factura(string numPiezas, string descripcion, int cantidad, double precio) {
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

    public string NumPiezas {
        get { return numPiezas; }
        set { numPiezas = value; }
    }

    public string Descripcion {
        get { return descripcion; }
        set { descripcion = value; }
    }

    public int Cantidad {
        get { return cantidad; }
        set {
            if (value > 0) {
                cantidad = value;
            } else {
                cantidad = 0;
            }
        }
    }

    public double Precio {
        get { return precio; }
        set {
            if (value > 0.0) {
                precio = value;
            } else {
                precio = 0.0;
            }
        }
    }

    public double ObtenerMontoFactura() {
        return cantidad * precio;
    }
}

class FacturaTest {
    static void Main(string[] args) {
        Console.Write("Numero de piezas: ");
        string numPiezas = Console.ReadLine();

        Console.Write("Descripcion: ");
        string descripcion = Console.ReadLine();

        Console.Write("Cantidad: ");
        int cantidad = Convert.ToInt32(Console.ReadLine());

        Console.Write("Precio: ");
        double precio = Convert.ToDouble(Console.ReadLine());

        Factura ferre = new Factura(numPiezas, descripcion, cantidad, precio);

        Console.WriteLine("----------------------------------------");
        Console.WriteLine("Numero de pieza: " + ferre.NumPiezas);
        Console.WriteLine("Descripcion: " + ferre.Descripcion);
        Console.WriteLine("Cantidad: " + ferre.Cantidad);
        Console.WriteLine("Precio unitario: " + ferre.Precio);
        Console.WriteLine("Factura: " + ferre.ObtenerMontoFactura());
    }
}