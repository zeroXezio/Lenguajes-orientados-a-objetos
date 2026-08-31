// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

import java.util.Scanner;

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

    public String mostrarFecha() {
        return unMes + "/" + unDia + "/" + unAnio;
    }
}

public class FechaTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fecha fechaActual = new Fecha();
        
        System.out.println("Ingrese los siguientes valores en numeros");
        
        System.out.println("Que dia es hoy: ");
        fechaActual.unDia = input.nextInt();
        
        System.out.println("En que mes estamos: ");
        fechaActual.unMes = input.nextInt();
        
        System.out.println("En que anio estamos: ");
        fechaActual.unAnio = input.nextInt();
        
        System.out.println("\n---------------- FECHA ACTUAL ----------------");
        System.out.println(fechaActual.mostrarFecha());
    }
}