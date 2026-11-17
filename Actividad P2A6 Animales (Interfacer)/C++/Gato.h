//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#pragma once
#include "Mamifero.h"
using namespace std;

class Gato : public Mamifero{
private: 
    int nBigotes;
    
public:
    Gato(string n = "", double p = 0.0, int b = 0);
    
    int getNBigotes();
    void setNBigotes(int n);
    
    void alimentarse() override;
    void emitirSonido() override;
};