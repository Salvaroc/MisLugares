package com.example.mislugares;

/**
 * Created by solyc_000 on 7/7/2016.
 */
public enum TipoLugar {
    OTROS("Otros", R.drawable.otros),
    RESTAURANTE("Restaurante", R.drawable.restaurante),
    BAR("Bar", R.drawable.bar),
    COPAS("Copas", R.drawable.copas),
    ESPECTACULO("Espectáculo", R.drawable.espectaculos),
    HOTEL("Hotel", R.drawable.hotel),
    COMPRAS("Compras", R.drawable.compras),
    EDUCACION("Educación", R.drawable.educacion),
    DEPORTE("Deporte", R.drawable.deporte),
    NATURALEZA("Naturaleza", R.drawable.naturaleza),
    GASOLINERA("Gasolinera", R.drawable.gasolinera),
    FUENTEP("Fuente de agua potable", R.drawable.otros),
    FUENTENP("Fuente de agua no potable", R.drawable.otros);

    private final String texto;
    private final int recurso;

    TipoLugar(String texto, int recurso) {
        this.texto = texto;
        this.recurso = recurso;
    }

    public String getTexto() { return texto; }

    public int getRecurso() { return recurso; }
}