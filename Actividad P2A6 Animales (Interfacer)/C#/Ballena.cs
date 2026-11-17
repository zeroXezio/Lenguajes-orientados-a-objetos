//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
using System;

public class Ballena : Mamifero
{
    public Ballena(string n = "", double p = 0.0) : base(n, p)
    {
    }

    public override void Alimentarse()
    {
        Console.WriteLine($"{Nombre} se alimenta de plancton y krill");
    }

    public override void EmitirSonido()
    {
        Console.WriteLine($"{Nombre} emite un canto de ballena");
    }
}