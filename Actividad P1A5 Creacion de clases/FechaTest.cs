// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

using System;

class Fecha {
    public int unMes;
    public int unDia;
    public int unAnio;
    
    public Fecha() {
        unMes = 0;
        unDia = 0;
        unAnio = 0;
    }
    
    public Fecha(int mes, int dia, int anio) {
        unMes = mes;
        unDia = dia;
        unAnio = anio;
    }
    
    public string mostrarFecha() {
        return $"{unMes}/{unDia}/{unAnio}";
    }
}

class FechaTest {
    static void Main(string[] args) {
        Fecha fechaActual = new Fecha();
        
        Console.WriteLine("Ingrese los siguientes valores en numeros");
        
        Console.WriteLine("Que dia es hoy: ");
        fechaActual.unDia = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("En que mes estamos: ");
        fechaActual.unMes = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("En que anio estamos: ");
        fechaActual.unAnio = Convert.ToInt32(Console.ReadLine());
        
        Console.WriteLine("\n---------------- FECHA ACTUAL ----------------");
        Console.WriteLine(fechaActual.mostrarFecha());
    }
}