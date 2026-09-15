#pragma once

#include <iostream>
using namespace std;

class Auto {

private:
	int modelo;

public:
	string marca;

	int getModelo();
	void setModelo(int modelo);
	//void imprimir();
	string toString();
};