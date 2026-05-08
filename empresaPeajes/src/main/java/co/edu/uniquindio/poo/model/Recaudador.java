package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.List;

public class Recaudador extends Persona{
    //Atributos

    //Relaciones
    private List<RegistroPeaje> listaRegistroPeajes;

    //Constructor

    public Recaudador(String nombre, String apellido, LocalDate fechaNacimiento,
                      String numeroDocumento, List<RegistroPeaje> listaRegistroPeajes) {
        super(nombre, apellido, fechaNacimiento, numeroDocumento);
        this.listaRegistroPeajes = listaRegistroPeajes;
    }
    //Getters y Setters

    public List<RegistroPeaje> getListaRegistroPeajes() {
        return listaRegistroPeajes;
    }

    public void setListaRegistroPeajes(List<RegistroPeaje> listaRegistroPeajes) {
        this.listaRegistroPeajes = listaRegistroPeajes;
    }
}
