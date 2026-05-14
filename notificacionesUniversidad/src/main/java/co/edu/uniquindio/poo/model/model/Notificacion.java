package co.edu.uniquindio.poo.model.model;

import java.time.LocalDate;

public class Notificacion {

    private String estadoNotificacion;

    private LocalDate fechaEnvio;

    public Notificacion(String estadoNotificacion, LocalDate fechaEnvio) {
        this.estadoNotificacion = estadoNotificacion;
        this.fechaEnvio = fechaEnvio;
    }

    public String getEstadoNotificacion() {
        return estadoNotificacion;
    }

    public void setEstadoNotificacion(String estadoNotificacion) {
        this.estadoNotificacion = estadoNotificacion;
    }

    public LocalDate getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(LocalDate fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }
}
