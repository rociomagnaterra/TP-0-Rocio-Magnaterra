package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//----FORMATO NO ANÉMICO----
//En la implementación no anémica, el comportamiento está dentro de TiempoNoAnemico,
//implica que la clase misma se encarga de su propio comportamiento (encapsulamiento de datos).
//No es necesario importar DateTimeFormatter al main porque ya está encapsulado en la clase TiempoNoAnemico.

public class TiempoNoAnemico {
    private LocalDateTime tiempo;

    public TiempoNoAnemico() {
        this.tiempo = LocalDateTime.now();
    }
    public String fechaLarga() {
        return this.tiempo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)); //format de fecha larga (FULL
    }
    public String fechaCorta() {
        return this.tiempo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); //formato de fecha corta.
    }
}