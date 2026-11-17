//Ian Alexander Paz Hernández 
//Carrera: TI 
//ID: 00603548
using System;

class Program
{
    static void Main(string[] args)
    {
        Gato miGato = new Gato("Tamal", 5.37, 36);
        Vaca miVaca = new Vaca("Clarabella", 900.0, 25.5);
        Ballena miBallena = new Ballena("Preciosa", 340000.0);

        Console.WriteLine($"Nombre: {miGato.Nombre}\nPeso: {miGato.Peso}kg\nNumero de Bigotes: {miGato.NBigotes}");
        miGato.Comer();
        miGato.Comer("Pescado");
        miGato.Comer("Croquetas", 2);
        miGato.Alimentarse();
        miGato.EmitirSonido();

        Console.WriteLine();

        Console.WriteLine($"Nombre: {miVaca.Nombre}\nPeso: {miVaca.Peso}kg\nLeche Producida al dia: {miVaca.LitrosDeLeche}l");
        miVaca.Comer();
        miVaca.Comer("Pasto");
        miVaca.Comer("Heno", 2);
        miVaca.Alimentarse();
        miVaca.EmitirSonido();

        Console.WriteLine();

        Console.WriteLine($"Nombre: {miBallena.Nombre}\nPeso: {miBallena.Peso}kg");
        miBallena.Comer();
        miBallena.Comer("Plancton");
        miBallena.Comer("Krill", 2);
        miBallena.Alimentarse();
        miBallena.EmitirSonido();
    }
}