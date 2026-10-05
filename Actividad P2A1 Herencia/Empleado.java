//Ian A. Paz Hernandez
//Tecnologias de la informacion
//ID: 00603548

public class Empleado {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private int anosAntiguedad;
    private String telefono;
    protected double salario;
    private Empleado supervisor;

    public Empleado(String nombre, String apellidos, String dni, String direccion, int anosAntiguedad, String telefono, double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.anosAntiguedad = anosAntiguedad;
        this.telefono = telefono;
        this.salario = salario;
        this.supervisor = null;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public double getSalario() {
        return this.salario;
    }

    public void cambiarSupervisor(Empleado nuevoSupervisor) {
        this.supervisor = nuevoSupervisor;
    }

    public void incrementarSalario() {
        this.salario += this.salario * 0.05;
    }

    @Override
    public String toString() {
        String supervStr = (this.supervisor != null) ? this.supervisor.getNombre() + " " + this.supervisor.getApellidos() : "Sin supervisor";
        return "Nombre: " + this.nombre + " " + this.apellidos +
               "\nDNI: " + this.dni +
               "\nDireccion: " + this.direccion +
               "\nAntiguedad: " + this.anosAntiguedad + " años" +
               "\nTelefono: " + this.telefono +
               "\nSalario: $" + this.salario +
               "\nSupervisor: " + supervStr;
    }
}

class Secretario extends Empleado {
    private String despacho;
    private String numeroFax;

    public Secretario(String nombre, String apellidos, String dni, String direccion, int anosAntiguedad, String telefono, double salario, String despacho, String numeroFax) {
        super(nombre, apellidos, dni, direccion, anosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.numeroFax = numeroFax;
    }

    @Override
    public void incrementarSalario() {
        this.salario += this.salario * 0.05;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPuesto: Secretario" +
               "\nDespacho: " + this.despacho +
               "\nFax: " + this.numeroFax;
    }
}

class Coche {
    private String matricula;
    private String marca;
    private String modelo;

    public Coche(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return this.marca + " " + this.modelo + " (" + this.matricula + ")";
    }
}

class Vendedor extends Empleado {
    private Coche cocheEmpresa;
    private String telefonoMovil;
    private String areaVenta;
    private String listaClientes;
    private double porcentajeComision;

    public Vendedor(String nombre, String apellidos, String dni, String direccion, int anosAntiguedad, String telefono, double salario, Coche coche, String telefonoMovil, String areaVenta, double porcentajeComision) {
        super(nombre, apellidos, dni, direccion, anosAntiguedad, telefono, salario);
        this.cocheEmpresa = coche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.porcentajeComision = porcentajeComision;
        this.listaClientes = "";
    }

    public void darAltaCliente(String cliente) {
        this.listaClientes += cliente + ", ";
    }

    public void darBajaCliente(String cliente) {
        this.listaClientes = this.listaClientes.replace(cliente + ", ", "");
    }

    public void cambiarCoche(Coche nuevoCoche) {
        this.cocheEmpresa = nuevoCoche;
    }

    @Override
    public void incrementarSalario() {
        this.salario += this.salario * 0.10;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nPuesto: Vendedor" +
               "\nMovil: " + this.telefonoMovil +
               "\nArea de Venta: " + this.areaVenta +
               "\nComision: " + this.porcentajeComision + "%" +
               "\nCoche: " + (this.cocheEmpresa != null ? this.cocheEmpresa : "Sin coche") +
               "\nClientes: " + (this.listaClientes.equals("") ? "Sin clientes" : this.listaClientes);
    }
}

class JefeDeZona extends Empleado {
    private String despacho;
    private Secretario secretario;
    private Vendedor[] listaVendedores;
    private int cantidadVendedores;
    private Coche cocheEmpresa;

    public JefeDeZona(String nombre, String apellidos, String dni, String direccion, int anosAntiguedad, String telefono, double salario, String despacho, Coche coche) {
        super(nombre, apellidos, dni, direccion, anosAntiguedad, telefono, salario);
        this.despacho = despacho;
        this.cocheEmpresa = coche;
        this.secretario = null;
        this.listaVendedores = new Vendedor[10];
        this.cantidadVendedores = 0;
    }

    public void cambiarSecretario(Secretario nuevoSecretario) {
        this.secretario = nuevoSecretario;
    }

    public void cambiarCoche(Coche nuevoCoche) {
        this.cocheEmpresa = nuevoCoche;
    }

    public void darAltaVendedor(Vendedor vendedor) {
        if (this.cantidadVendedores < this.listaVendedores.length) {
            this.listaVendedores[this.cantidadVendedores] = vendedor;
            this.cantidadVendedores++;
            vendedor.cambiarSupervisor(this);
        }
    }

    @Override
    public void incrementarSalario() {
        this.salario += this.salario * 0.20;
    }

    @Override
    public String toString() {
        String secrStr = (this.secretario != null) ? this.secretario.getNombre() + " " + this.secretario.getApellidos() : "Sin secretario";
        return super.toString() +
               "\nPuesto: Jefe de Zona" +
               "\nDespacho: " + this.despacho +
               "\nSecretario a cargo: " + secrStr +
               "\nCoche: " + (this.cocheEmpresa != null ? this.cocheEmpresa : "Sin coche") +
               "\nVendedores a cargo: " + this.cantidadVendedores;
    }
}