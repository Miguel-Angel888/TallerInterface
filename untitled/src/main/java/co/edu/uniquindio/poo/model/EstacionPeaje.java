package co.edu.uniquindio.poo.model;

import java.util.List;

public class EstacionPeaje implements ICobrador{

    //Atributos
    private String nombre;
    private String direccion;
    private double valorFinal;

    //Relaciones
    private List<RegistroPeaje> listaRegistroPeajes;

    //Constructor

    public EstacionPeaje(String nombre, String direccion,
                         double valorFinal, List<RegistroPeaje> listaRegistroPeajes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.valorFinal = valorFinal;
        this.listaRegistroPeajes = listaRegistroPeajes;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }

    public List<RegistroPeaje> getListaRegistroPeajes() {
        return listaRegistroPeajes;
    }

    public void setListaRegistroPeajes(List<RegistroPeaje> listaRegistroPeajes) {
        this.listaRegistroPeajes = listaRegistroPeajes;
    }
}

