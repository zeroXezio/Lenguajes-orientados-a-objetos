public class Reloj {

    private int hora;
    private int minuto;
    private int segundo;

    public Reloj() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public String obtenerHora() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }

    public String obtenerHora(boolean formato24) {
        if (formato24) {
            return obtenerHora();
        } else {
            String sufijo = "am";
            int hora12 = this.hora;

            if (this.hora >= 12) {
                sufijo = "pm";
            }

            if (this.hora > 12) {
                hora12 = this.hora - 12;
            } else if (this.hora == 0) {
                hora12 = 12;
            }

            return hora12 + ":" + this.minuto + ":" + this.segundo + " " + sufijo;
        }
    }

    @Override
    public String toString() {
        return this.hora + ":" + this.minuto + ":" + this.segundo;
    }
}