#include <iostream>
#include "Pizzeria.h"

using namespace std;

PedidoPizza::PedidoPizza(){
    this->tamanio = "";
    this->noIngredientes = 0;
    this->descripcion = "";
    this->precioBase = 0.0;
}



PedidoPizza::PedidoPizza(string t, int i, string d){
    this->tamanio = t;
    this->noIngredientes = i;
    this->descripcion = d;
    
    if (t == "Chica") this->precioBase = 80.00;
    if (t == "Mediana") this->precioBase = 100.00;
    if (t == "Grande") this->precioBase = 120.00;
    
}

string PedidoPizza::getTamanio(){
    return this->tamanio;
}
void PedidoPizza::setTamanio(string t){
    this->tamanio = t;
    
    if (t == "Chica") this->precioBase = 80.00;
    if (t == "Mediana") this->precioBase = 100.00;
    if (t == "Grande") this->precioBase = 120.00;
    
}
    
int PedidoPizza::getIngredientes(){
    return this->noIngredientes;
}
void PedidoPizza::setIngredientes(int i){
    this->noIngredientes = i;
}
    
string PedidoPizza::getDescripcion(){
    return this->descripcion;
}
void PedidoPizza::setDescripcion(string d){
    this->descripcion = d;
}
    
double PedidoPizza::calcularTotal(){
    return precioBase + this->noIngredientes * 15; 
}

void PedidoPizza::generarResumenPedido(){
    cout << "-----TICKET PIZZERIA-----";
    cout << "Pizza: " << getTamanio() << endl;
    cout << "Ingredientes extra: " << getIngredientes() << endl;
    cout << "Precio pizza: $" << this->precioBase << endl;
    cout << "Total a pagar: $" << calcularTotal()<< endl;
    cout << "-----GRACIAS POR SU COMPRA-----";
}