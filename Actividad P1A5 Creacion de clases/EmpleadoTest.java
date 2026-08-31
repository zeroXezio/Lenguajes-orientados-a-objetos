// Ian Alexander Paz Hernández
// Carrera: TI
// 00603548

import java.util.Scanner;

class Empleado {
    public String primerNombre;
    public String apellidoPaterno;
    public double salarioMensual;

    public Empleado() {
        primerNombre = "";
        apellidoPaterno = "";
        salarioMensual = 0.0;
    }

    public double obtenerSalarioAnual() {
        return salarioMensual * 12;
    }
}

public class EmpleadoTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Empleado emp1 = new Empleado();   
        
        System.out.print("Primer nombre del empleado 1: ");
        emp1.primerNombre = input.nextLine();
        
        System.out.print("Apellido paterno del empleado 1: ");
        emp1.apellidoPaterno = input.nextLine();
        
        System.out.print("Salario mensual del empleado 1: ");
        emp1.salarioMensual = input.nextDouble();
        
        input.nextLine();
        
        if (emp1.salarioMensual < 0.0) emp1.salarioMensual = 0.0;
        
        Empleado emp2 = new Empleado();
        
        System.out.print("Primer nombre del empleado 2: ");
        emp2.primerNombre = input.nextLine();
        
        System.out.print("Apellido paterno del empleado 2: ");
        emp2.apellidoPaterno = input.nextLine();
        
        System.out.print("Salario mensual del empleado 2: ");
        emp2.salarioMensual = input.nextDouble();
        
        if (emp2.salarioMensual < 0.0) emp2.salarioMensual = 0.0;
        
        System.out.println("\n---------------- SALARIOS ANUALES INICIALES ----------------");
        System.out.println(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.obtenerSalarioAnual());
        System.out.println(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.obtenerSalarioAnual());
        
        emp1.salarioMensual = emp1.salarioMensual * 1.10;
        emp2.salarioMensual = emp2.salarioMensual * 1.10;
        
        System.out.println("\n---------------- SALARIOS ANUALES FINALES ----------------");
        System.out.println(emp1.primerNombre + " " + emp1.apellidoPaterno + ": $" + emp1.obtenerSalarioAnual());
        System.out.println(emp2.primerNombre + " " + emp2.apellidoPaterno + ": $" + emp2.obtenerSalarioAnual());
    }
}