//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#include "Gato.h"
#include <iostream>
using namespace std;

Gato::Gato(string n, double p, int b) : Mamifero(n, p){
    nBigotes = b;
}

int Gato::getNBigotes() { return nBigotes; }
void Gato::setNBigotes(int n) { nBigotes = n; } 

void Gato::alimentarse(){
    cout << getNombre() << " se alimenta de croquetas y carne" << endl;
}

void Gato::emitirSonido(){
    cout << getNombre() << " dice: Miau!" << endl;
}