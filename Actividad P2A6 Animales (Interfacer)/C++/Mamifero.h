//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#pragma once
#include <iostream>
#include "ISonido.h"
using namespace std;

class Mamifero : public ISonido{
private:
    string nombre;
    double peso;
    
public:
    Mamifero(string n ="", double p = 0.0);
    virtual ~Mamifero() = default;
    
    string getNombre();
    void setNombre(string n);
    
    double getPeso();
    void setPeso(double p);
    
    void comer();
    void comer(string comida);
    void comer(string comida, int cantidad);
    
    virtual void alimentarse() = 0;
};