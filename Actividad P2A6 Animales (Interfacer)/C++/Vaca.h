//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#pragma once
#include "Mamifero.h"
using namespace std;

class Vaca : public Mamifero{
private:
    double litrosDeLeche;
    
public:
    Vaca(string n = "", double p = 0.0, double l = 0.0);
    
    double getLitrosDeLeche();
    void setLitrosDeLeche(double n);
    
    void alimentarse() override;
    void emitirSonido() override;
};