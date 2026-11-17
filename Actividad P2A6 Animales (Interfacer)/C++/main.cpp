//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#include <iostream>
#include "Gato.h"
#include "Vaca.h"
#include "Ballena.h"
using namespace std;

int main(){
    Gato miGato("Tamal", 5.37, 36);
    Vaca miVaca("Clarabella", 900.0, 25.5);
    Ballena miBallena("Preciosa", 340000.0);
    
    cout << "Nombre: " << miGato.getNombre() << "\nPeso: " << miGato.getPeso() << "kg\nNumero de Bigotes: " << miGato.getNBigotes() << endl;
    miGato.comer();
    miGato.comer("Pescado");
    miGato.comer("Croquetas", 2);
    
    cout << "" << endl;
    
    cout << "Nombre: " << miVaca.getNombre() << "\nPeso: " << miVaca.getPeso() << "kg\nLeche Producida al dia: " << miVaca.getLitrosDeLeche() << "l" << endl;
    miVaca.comer();
    miVaca.comer("Pasto");
    miVaca.comer("Heno", 2);
    miVaca.alimentarse();
    miVaca.emitirSonido();
    
    cout << "" << endl;
    
    cout << "Nombre: " << miBallena.getNombre() << "\nPeso: " << miBallena.getPeso() << "kg" << endl;
    miBallena.comer();
    miBallena.comer("Plancton");
    miBallena.comer("Krill", 2);
    miBallena.alimentarse();
    miBallena.emitirSonido();

    return 0;
}