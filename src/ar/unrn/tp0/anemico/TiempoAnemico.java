package ar.unrn.tp0.anemico;

import java.time.LocalDateTime;

//----FORMATO ANEMICO----
//El comportamiento se encuentra en el main y no en la clase TiempoAnemico.
//Esta clase solo se contiene getters/setters que se encargan de mantener los datos.

public class TiempoAnemico {
    private LocalDateTime tiempo;

    public TiempoAnemico() {
        this.tiempo = LocalDateTime.now();
    }

    public LocalDateTime getTiempo() {
        return tiempo;
    }
}