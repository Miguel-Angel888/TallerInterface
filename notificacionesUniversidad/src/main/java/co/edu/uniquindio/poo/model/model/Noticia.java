package co.edu.uniquindio.poo.model.model;

import java.util.ArrayList;

public class Noticia {
    private String titulo;
    private String descripcion;
    private EstadoNoticia estadoNoticia;

    private ArrayList<Notificacion> listaNotificaciones;

    public Noticia(String titulo, String descripcion, EstadoNoticia estadoNoticia, ArrayList<Notificacion> listaNotificaciones) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estadoNoticia = estadoNoticia;
        this.listaNotificaciones = listaNotificaciones;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public EstadoNoticia getEstadoNoticia() {
        return estadoNoticia;
    }

    public void setEstadoNoticia(EstadoNoticia estadoNoticia) {
        this.estadoNoticia = estadoNoticia;
    }

    public ArrayList<Notificacion> getListaNotificaciones() {
        return listaNotificaciones;
    }

    public void setListaNotificaciones(ArrayList<Notificacion> listaNotificaciones) {
        this.listaNotificaciones = listaNotificaciones;
    }
}
