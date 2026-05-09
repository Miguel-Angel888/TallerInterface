package co.edu.uniquindio.poo.model;

import java.util.List;

public class Moto extends Vehiculo{

    //Atributos
    private int cilindraje;


    //Constrcutor

    public Moto(String placa, int numeroPeajes,
                List<RegistroPeaje> listaRegistroPeajes, Propietario propietario, int cilindraje,
                double valorPeaje) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario,valorPeaje);
        this.cilindraje = cilindraje;

    }

    //Getters y Setters

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodo para calcular el valor del peaje
    public double valorFinalPeaje(){
       double amuentoPeaje = 0;
        if(cilindraje >= 200){
            amuentoPeaje =2000;
        }
        return this.getValorPeaje()+amuentoPeaje;
    }


}
