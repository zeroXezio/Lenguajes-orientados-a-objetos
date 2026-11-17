//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
#include "Mamifero.h"
#include <iostream>
using namespace std;

Mamifero::Mamifero(string n, double p){
    this->nombre = n;
    this->peso = p;
}

string Mamifero::getNombre(){
    return this->nombre;
}

void Mamifero::setNombre(string n){
    this->nombre = n;
}

double Mamifero::getPeso(){
    return this->peso;
}

void Mamifero::setPeso(double p){
    this->peso = p;
}

void Mamifero::comer(){
    cout << nombre << " esta comiendo" << endl;
}

void Mamifero::comer(string comida){
    cout << nombre << " esta comiendo " << comida << endl;
}

void Mamifero::comer(string comida, int cantidad){
    cout << nombre << " esta comiendo " << cantidad << " porciones de " << comida << endl;
}