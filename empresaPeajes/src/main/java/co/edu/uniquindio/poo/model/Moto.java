package co.edu.uniquindio.poo.model;

import java.util.List;

public class Moto extends Vehiculo{

    //Atributos
    private int cilindraje;

    //Constrcutor

    public Moto(String placa, int numeroPeajes,
                List<RegistroPeaje> listaRegistroPeajes, Propietario propietario, int cilindraje) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario);
        this.cilindraje = cilindraje;
    }

    //Getters y Setters

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
}
