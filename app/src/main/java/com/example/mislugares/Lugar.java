package com.example.mislugares;

/**
 * Created by solyc_000 on 7/5/2016.
 */
public class Lugar {


    private String nombre;
    private String direccion;
    private GeoPunto posicion;
    private String foto;
    private int telefono;
    private String url;
    private String comentario;
    private long fecha;
    private float valoracion;
    private TipoLugar tipo;


    //** Construcor de Lugar */
    public Lugar(String nombre, String direccion, double longitud,
                 double latitud, TipoLugar tipo, int telefono, String url, String comentario,
                 int valoracion) {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(longitud, latitud);
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.url = url;
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.tipo = tipo;
    }
    //Sobrecarga
    public Lugar() {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(0,0);
        tipo = TipoLugar.OTROS;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", posicion=" + posicion +
                ", foto='" + foto + '\'' +
                ", telefono=" + telefono +
                ", url='" + url + '\'' +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                ", valoracion=" + valoracion +
                ", tipo=" + tipo +
                '}';
    }


    //Getters
    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public GeoPunto getPosicion() {
        return posicion;
    }

    public String getFoto() {
        return foto;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getUrl() {
        return url;
    }

    public String getComentario() {
        return comentario;
    }

    public long getFecha() {
        return fecha;
    }

    public float getValoracion() {
        return valoracion;
    }

    public TipoLugar getTipo() {
        return tipo;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public void setTipo(TipoLugar tipo) {
        this.tipo = tipo;
    }

}