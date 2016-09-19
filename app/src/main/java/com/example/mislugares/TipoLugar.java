package com.example.mislugares;

/**
 * Created by solyc_000 on 7/7/2016.
 */
public enum TipoLugar {
    OTROS("Otros", 5),
    RESTAURANTE("Restaurante", 2),
    BAR("Bar", 6),
    COPAS("Copas", 0),
    ESPECTACULO("Espectáculo", 0),
    HOTEL("Hotel", 0),
    COMPRAS("Compras", 0),
    EDUCACION("Educación", 0),
    DEPORTE("Deporte", 0),
    NATURALEZA("Naturaleza", 0),
    GASOLINERA("Gasolinera", 0),
    FUENTEP("Fuente de agua potable", 1),
    FUENTENP("Fuente de agua no potable", 3);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() { return texto; }

    public int getRecurso() { return recurso; }
}