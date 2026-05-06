package co.edu.uniquindio.poo.model;

import java.util.List;

public abstract class Vehiculo {
    //Atributos
    private String placa;
    private int numeroPeajes;

    //Relaciones
    private List<RegistroPeaje> listaRegistroPeajes;
    private Propietario propietario;

    //Constructor

    public Vehiculo(String placa, int numeroPeajes,
                    List<RegistroPeaje> listaRegistroPeajes, Propietario propietario) {
        this.placa = placa;
        this.numeroPeajes = numeroPeajes;
        this.listaRegistroPeajes = listaRegistroPeajes;
        this.propietario = propietario;
    }
    //Getters y Setters

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumeroPeajes() {
        return numeroPeajes;
    }

    public void setNumeroPeajes(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    public List<RegistroPeaje> getListaRegistroPeajes() {
        return listaRegistroPeajes;
    }

    public void setListaRegistroPeajes(List<RegistroPeaje> listaRegistroPeajes) {
        this.listaRegistroPeajes = listaRegistroPeajes;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
}
