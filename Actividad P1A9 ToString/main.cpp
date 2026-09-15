#include <iostream>
#include "Auto.h"

using namespace std;

int main()
{
	Auto carrito;

	carrito.setModelo(2025); //Modificación del atributo privado 'modelo'
	carrito.marca = "Nissan"; //modificación del atributo público 'marca'

	cout << "Modelo: " << carrito.getModelo();

	//carrito.imprimir(); // Invocación del método público 'imprimir()'
	
	cout << carrito.toString();

	return 0;
}