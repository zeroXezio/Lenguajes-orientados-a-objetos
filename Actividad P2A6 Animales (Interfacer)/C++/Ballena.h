//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#pragma once
#include "Mamifero.h"
using namespace std;

class Ballena : public Mamifero{
public:
    Ballena(string n = "", double p = 0.0);
    
    void alimentarse() override;
    void emitirSonido() override;
};