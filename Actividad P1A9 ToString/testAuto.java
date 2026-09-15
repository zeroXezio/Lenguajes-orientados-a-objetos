public class testAuto {
    public static void main(String[] args) {
        
        Auto carrito = new Auto(); // Creación del objeto 'carrito' de la clase Auto
                                   
        carrito.setModelo(2025); //Modificación del atributo privado 'modelo'
        carrito.marca = "Nissan"; //modificación del atributo público 'marca'
        
        System.out.println("Modelo: "+ carrito.getModelo());
        
        //carrito.imprimir(); // Invocación del método público 'imprimir()'
        
        System.out.println(carrito);
        
    }
}
