using System;

class Program
{
    static void Main(string[] args)
    {
        PedidoPizza objeto1 = new PedidoPizza();

        objeto1.SetTamanio("Grande");
        objeto1.SetDescripcion("Masa tradicional");
        objeto1.SetIngredientes(2);
        objeto1.GenerarResumenPedido();

        Console.WriteLine();
        Console.WriteLine();

        PedidoPizza objeto2 = new PedidoPizza("Chica", 0, "Vegana");
        objeto2.GenerarResumenPedido();

        Console.WriteLine();
    }
}