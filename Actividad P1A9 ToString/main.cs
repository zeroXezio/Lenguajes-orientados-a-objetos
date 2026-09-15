using System;
class testAuto {
	static void Main() {
		Auto carrito = new Auto(); // Creación del objeto 'carrito' de la clase Auto

		carrito.Modelo = 2025; //Modificación del atributo privado 'modelo'
		carrito.marca = "Nissan"; //modificación del atributo público 'marca'

		Console.WriteLine("Modelo: "+ carrito.Modelo);

		//carrito.imprimir(); // Invocación del método público 'imprimir()'
		Console.WriteLine(carrito);
	}
}