using System;

public class Auto {

	private int modelo;
	public string marca;

	public int Modelo {
		get { return this.modelo; }
		set { this.modelo = value; }
	}

	/*public void imprimir() {
		Console.WriteLine("\nModelo: " + this.modelo + "\nMarca: " + this.marca);
	}*/
	
	public override string ToString(){
	    return $"\nModelo: " + this.modelo + "\nMarca: " + this.marca; //$ es como la f de formato 
	}
	
}