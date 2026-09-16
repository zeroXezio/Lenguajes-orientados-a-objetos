public class testReloj {
    public static void main(String[] args) {

        Reloj reloj1 = new Reloj();
        Reloj reloj2 = new Reloj(14, 30, 45);

        System.out.println("Reloj 1 por defecto: " + reloj1);
        System.out.println("Reloj 2 en 24 horas: " + reloj2.obtenerHora());
        System.out.println("Reloj 2 en 12 horas: " + reloj2.obtenerHora(false));

    }
}