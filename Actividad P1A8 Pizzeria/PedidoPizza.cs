using System;

public class PedidoPizza
{
    private string tamanio;
    private int noIngredientes;
    private string descripcion;

    public double precioBase;

    public PedidoPizza()
    {
        this.tamanio = "";
        this.noIngredientes = 0;
        this.descripcion = "";
        this.precioBase = 0.0;
    }

    public PedidoPizza(string t, int i, string d)
    {
        this.tamanio = t;
        this.noIngredientes = i;
        this.descripcion = d;

        if (t == "Chica") this.precioBase = 80.00;
        if (t == "Mediana") this.precioBase = 100.00;
        if (t == "Grande") this.precioBase = 120.00;
    }

    public string GetTamanio()
    {
        return this.tamanio;
    }

    public void SetTamanio(string t)
    {
        this.tamanio = t;

        if (t == "Chica") this.precioBase = 80.00;
        if (t == "Mediana") this.precioBase = 100.00;
        if (t == "Grande") this.precioBase = 120.00;
    }

    public int GetIngredientes()
    {
        return this.noIngredientes;
    }

    public void SetIngredientes(int i)
    {
        this.noIngredientes = i;
    }

    public string GetDescripcion()
    {
        return this.descripcion;
    }

    public void SetDescripcion(string d)
    {
        this.descripcion = d;
    }

    public double CalcularTotal()
    {
        return precioBase + this.noIngredientes * 15;
    }

    public void GenerarResumenPedido()
    {
        Console.Write("-----TICKET PIZZERIA-----");
        Console.WriteLine("Pizza: " + GetTamanio());
        Console.WriteLine("Ingredientes extra: " + GetIngredientes());
        Console.WriteLine("Precio pizza: $" + this.precioBase);
        Console.WriteLine("Total a pagar: $" + CalcularTotal());
        Console.Write("-----GRACIAS POR SU COMPRA-----");
    }
}