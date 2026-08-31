// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

#include <iostream>
#include <string>

using namespace std;

class Empleado {
public:
    string primerNombre;
    string apellidoPaterno;
    double salarioMensual;
    
    Empleado() {
        primerNombre = "";
        apellidoPaterno = "";
        salarioMensual = 0.0;
    }
    
    double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
};

int main() {
    Empleado emp1;
    
    cout << "Primer nombre del empleado 1: ";
    cin >> emp1.primerNombre;
    
    cout << "Apellido paterno del empleado 1: ";
    cin >> emp1.apellidoPaterno;
    
    cout << "Salario mensual del empleado 1: ";
    cin >> emp1.salarioMensual;
    
    if (emp1.salarioMensual < 0.0) {
        emp1.salarioMensual = 0.0;
    }
    
    Empleado emp2;
    
    cout << "Primer nombre del empleado 2: ";
    cin >> emp2.primerNombre;
    
    cout << "Apellido paterno del empleado 2: ";
    cin >> emp2.apellidoPaterno;
    
    cout << "Salario mensual del empleado 2: ";
    cin >> emp2.salarioMensual;
    
    if (emp2.salarioMensual < 0.0) {
        emp2.salarioMensual = 0.0;
    }
    
    cout << "\n---------------- SALARIOS ANUALES INICIALES ----------------" << endl;
    cout << emp1.primerNombre << " " << emp1.apellidoPaterno << ": $" << emp1.obtenerSalarioAnual() << endl; 
    cout << emp2.primerNombre << " " << emp2.apellidoPaterno << ": $" << emp2.obtenerSalarioAnual() << endl;
    
    emp1.salarioMensual = emp1.salarioMensual * 1.10;
    emp2.salarioMensual = emp2.salarioMensual * 1.10;
    
    cout << "\n---------------- SALARIOS ANUALES FINALES ----------------" << endl;
    cout << emp1.primerNombre << " " << emp1.apellidoPaterno << ": $" << emp1.obtenerSalarioAnual() << endl; 
    cout << emp2.primerNombre << " " << emp2.apellidoPaterno << ": $" << emp2.obtenerSalarioAnual() << endl;
    
    return 0;
}