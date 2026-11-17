//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#include "Vaca.h"
#include <iostream>
using namespace std;

Vaca::Vaca(string n, double p, double l) : Mamifero(n, p){
    litrosDeLeche = l;
}

double Vaca::getLitrosDeLeche() { return litrosDeLeche; }
void Vaca::setLitrosDeLeche(double n) { litrosDeLeche = n; }

void Vaca::alimentarse(){
    cout << getNombre() << " se alimenta de pasto y heno" << endl;
}

void Vaca::emitirSonido(){
    cout << getNombre() << " dice: Muuu!" << endl;
}