#pragma once
#include <string>

using namespace std;

class PedidoPizza{
    
private:
    string tamanio;
    int noIngredientes;
    string descripcion;
    
public:
    double precioBase;
    
    PedidoPizza();
    
    PedidoPizza(string t, int i, string d);
    
    string getTamanio();
    void setTamanio(string t);
    
    int getIngredientes();
    void setIngredientes(int i);
    
    string getDescripcion();
    void setDescripcion(string d);
    
    double calcularTotal();
    
    void generarResumenPedido();
    
};