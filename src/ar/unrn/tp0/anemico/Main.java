package ar.unrn.tp0.anemico;
import java.time.format.DateTimeFormatter; //necesario para implementacion anémica.

public class Main {
    public static void main(String[] args) {
        //------IMPLEMENTACION ANÉMICA-----
        TiempoAnemico tiempoAnemico = new TiempoAnemico();
        System.out.println("Format largo anémico: " + DateTimeFormatter.ofPattern("EEEE d 'de' MMMM 'de' yyyy").format(tiempoAnemico.getTiempo()));
        System.out.println("Format corto anémico : " +DateTimeFormatter.ofPattern("dd/MM/yyyy").format(tiempoAnemico.getTiempo()));

        //-----IMPLEMENTACION NO ANÉMICA------
        TiempoNoAnemico tiempoNoAnemico = new TiempoNoAnemico();
        System.out.println("Format largo no anémico: " + tiempoNoAnemico.fechaLarga());
        System.out.println("Format corto no anémico: " + tiempoNoAnemico.fechaCorta());
    }
}