//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
using System;

public class Vaca : Mamifero
{
    private double litrosDeLeche;

    public Vaca(string n = "", double p = 0.0, double l = 0.0) : base(n, p)
    {
        litrosDeLeche = l;
    }

    public double LitrosDeLeche
    {
        get { return litrosDeLeche; }
        set { litrosDeLeche = value; }
    }

    public override void Alimentarse()
    {
        Console.WriteLine($"{Nombre} se alimenta de pasto y heno");
    }

    public override void EmitirSonido()
    {
        Console.WriteLine($"{Nombre} dice: Muuu!");
    }
}