//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
using System;

public abstract class Mamifero : ISonido
{
    private string nombre;
    private double peso;

    public Mamifero(string n = "", double p = 0.0)
    {
        this.nombre = n;
        this.peso = p;
    }

    public string Nombre
    {
        get { return nombre; }
        set { nombre = value; }
    }

    public double Peso
    {
        get { return peso; }
        set { peso = value; }
    }

    public void Comer()
    {
        Console.WriteLine($"{nombre} esta comiendo");
    }

    public void Comer(string comida)
    {
        Console.WriteLine($"{nombre} esta comiendo {comida}");
    }

    public void Comer(string comida, int cantidad)
    {
        Console.WriteLine($"{nombre} esta comiendo {cantidad} porciones de {comida}");
    }

    public abstract void Alimentarse();
    public abstract void EmitirSonido();
}