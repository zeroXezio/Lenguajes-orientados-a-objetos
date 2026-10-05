//Ian A. Paz Hernandez
//Tecnologias de la informacion
//ID: 00603548

public class Main {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("YZA-8901", "Mazda", "3");
        Coche coche2 = new Coche("QWE-2345", "Nissan", "Sentra");

        Secretario secretario1 = new Secretario("Valeria", "Rios", "98765432X", "Av. Tecnologico #45", 4, "999222333", 1800.0, "Oficina 204", "999222334");
        Vendedor vendedor1 = new Vendedor("Fernando", "Herrera", "45612378Y", "Calle 60 #120", 1, "999444555", 1350.0, coche1, "999888999", "Zona Sur", 7.5);
        JefeDeZona jefe1 = new JefeDeZona("Gabriel", "Mendoza", "12398745Z", "Av. Paseo Montejo #88", 8, "999666777", 3500.0, "Oficina Ejecutiva", coche2);

        jefe1.cambiarSecretario(secretario1);
        secretario1.cambiarSupervisor(jefe1);
        jefe1.darAltaVendedor(vendedor1);

        vendedor1.darAltaCliente("Distribuidora Peninsula");
        vendedor1.darAltaCliente("Comercializadora del Sur");

        System.out.println(secretario1);
        System.out.println();

        System.out.println(vendedor1);
        System.out.println();

        System.out.println(jefe1);
        System.out.println();

        System.out.println("--- INCREMENTOS DE SALARIO ---");
        
        System.out.println("Salario previo Secretario: " + secretario1.getSalario());
        secretario1.incrementarSalario();
        System.out.println("Salario con incremento (5%): " + secretario1.getSalario());
        System.out.println();

        System.out.println("Salario previo Vendedor: " + vendedor1.getSalario());
        vendedor1.incrementarSalario();
        System.out.println("Salario con incremento (10%): " + vendedor1.getSalario());
        System.out.println();

        System.out.println("Salario previo Jefe de Zona: " + jefe1.getSalario());
        jefe1.incrementarSalario();
        System.out.println("Salario con incremento (20%): " + jefe1.getSalario());
    }
}