package co.edu.uniquindio.poo.model;

import java.util.List;

public class Camion extends Vehiculo{

    //Atributos
    private double capacidadCarga;
    private int numeroEjes;

    //Relaciones

    //Constructor

    public Camion(String placa, int numeroPeajes, List<RegistroPeaje> listaRegistroPeajes,
                  Propietario propietario, double capacidadCarga, int numeroEjes) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario);
        this.capacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }
    //Getters y Setters

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
