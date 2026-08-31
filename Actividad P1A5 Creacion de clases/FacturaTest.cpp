// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

#include <iostream>
#include <string>

using namespace std;

class Factura {
private:
    string numPiezas;
    string descripcion;
    int cantidad;
    double precio;

public:
    Factura(string nPiezas, string desc, int cant, double prec) {
        numPiezas = nPiezas;
        descripcion = desc;
        if (cant > 0) {
            cantidad = cant;
        } else {
            cantidad = 0;
        }
        if (prec > 0.0) {
            precio = prec;
        } else {
            precio = 0.0;
        }
    }

    void setNumPiezas(string nPiezas) {
        numPiezas = nPiezas;
    }

    string getNumPiezas() {
        return numPiezas;
    }

    void setDescripcion(string desc) {
        descripcion = desc;
    }

    string getDescripcion() {
        return descripcion;
    }

    void setCantidad(int cant) {
        if (cant > 0) {
            cantidad = cant;
        } else {
            cantidad = 0;
        }
    }

    int getCantidad() {
        return cantidad;
    }

    void setPrecio(double prec) {
        if (prec > 0.0) {
            precio = prec;
        } else {
            precio = 0.0;
        }
    }

    double getPrecio() {
        return precio;
    }

    double obtenerMontoFactura() {
        return cantidad * precio;
    }
};

int main() {
    string numPiezas, descripcion;
    int cantidad;
    double precio;

    cout << "Numero de piezas: ";
    cin >> numPiezas;

    cout << "Descripcion: ";
    cin >> descripcion;

    cout << "Cantidad: ";
    cin >> cantidad;

    cout << "Precio: ";
    cin >> precio;

    Factura ferre(numPiezas, descripcion, cantidad, precio);

    cout << "----------------------------------------" << endl;
    cout << "Numero de pieza: " << ferre.getNumPiezas() << endl;
    cout << "Descripcion: " << ferre.getDescripcion() << endl;
    cout << "Cantidad: " << ferre.getCantidad() << endl;
    cout << "Precio unitario: " << ferre.getPrecio() << endl;
    cout << "Factura: " << ferre.obtenerMontoFactura() << endl;

    return 0;
}