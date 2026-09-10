#include <iostream>
#include "Pizzeria.h"

using namespace std;

int main() {
    
    PedidoPizza objeto1;
    
    objeto1.setTamanio("Grande");
    objeto1.setDescripcion("Masa tradicional");
    objeto1.setIngredientes(2);
    objeto1.generarResumenPedido();
    
    cout << endl;
    cout << endl;

    PedidoPizza objeto2("Chica", 0, "Vegana");
    objeto2.generarResumenPedido();
    
    cout << endl;

    
    return 0;
}
