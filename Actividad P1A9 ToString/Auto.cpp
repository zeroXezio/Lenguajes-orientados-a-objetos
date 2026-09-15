#include <iostream>
#include "Auto.h"

using namespace std;

int Auto::getModelo() {
	return this->modelo;
}

void Auto::setModelo(int modelo) {
	this->modelo = modelo;
}

/*void Auto::imprimir() {
	cout << "\nModelo: " << this->modelo << "\nMarca: " << this->marca;
}*/

string Auto::toString() { //Aqui tenemos 2 tipos de to string, el toString que retorna lo que queremos mostrar y el to_string() que transforma un int a un string para que se pueda poner en una cadena
    return "\nModelo: " + to_string(this->modelo) + "\nMarca: " + this->marca;
}