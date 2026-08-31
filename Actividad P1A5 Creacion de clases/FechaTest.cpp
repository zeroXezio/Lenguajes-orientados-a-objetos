// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

#include <iostream>
#include <string>

using namespace std;

class Fecha {
public:
    int unMes;
    int unDia;
    int unAnio;
    
    Fecha() {
        unMes = 0;
        unDia = 0;
        unAnio = 0;
    }
    
    Fecha(int mes, int dia, int anio) {
        unMes = mes;
        unDia = dia;
        unAnio = anio;
    }
    
    string mostrarFecha() {
        return to_string(unMes) + "/" + to_string(unDia) + "/" + to_string(unAnio);
    }
};

int main() {
    Fecha fechaActual;
    
    cout << "Ingrese los siguientes valores en numeros" << endl;
    
    cout << "Que dia es hoy: " << endl;
    cin >> fechaActual.unDia;
    
    cout << "En que mes estamos: " << endl;
    cin >> fechaActual.unMes;
    
    cout << "En que anio estamos: " << endl;
    cin >> fechaActual.unAnio;
    
    cout << "\n---------------- FECHA ACTUAL ----------------" << endl;
    cout << fechaActual.mostrarFecha() << endl;
    
    return 0;
}