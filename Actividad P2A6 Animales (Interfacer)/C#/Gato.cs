//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
using System;

public class Gato : Mamifero
{
    private int nBigotes;

    public Gato(string n = "", double p = 0.0, int b = 0) : base(n, p)
    {
        nBigotes = b;
    }

    public int NBigotes
    {
        get { return nBigotes; }
        set { nBigotes = value; }
    }

    public override void Alimentarse()
    {
        Console.WriteLine($"{Nombre} se alimenta de croquetas y carne");
    }

    public override void EmitirSonido()
    {
        Console.WriteLine($"{Nombre} dice: Miau!");
    }
}