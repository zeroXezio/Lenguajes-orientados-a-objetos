//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#include "Ballena.h"
#include <iostream>
using namespace std;

Ballena::Ballena(string n, double p) : Mamifero(n, p){}

void Ballena::alimentarse(){
    cout << getNombre() << " se alimenta de plancton y krill" << endl;
}

void Ballena::emitirSonido(){
    cout << getNombre() << " emite un canto de ballena" << endl;
}