package co.edu.uniquindio.poo.model;

import java.util.List;

public class Camion extends Vehiculo{

    //Atributos
    private double capacidadCarga;
    private int numeroEjes;

    //Relaciones

    //Constructor

    public Camion(String placa, int numeroPeajes, List<RegistroPeaje> listaRegistroPeajes,
                  Propietario propietario, double capacidadCarga,
                  int numeroEjes,double valorPeaje) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario,valorPeaje);
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
    //Verifica que el camion tenga mas de x peso
    public boolean verificarPeso(double peso){
        if(this.capacidadCarga >= peso){
            return true;
        }
        return false;
    }
    //Verifica que el vehiculo haya pagado mas de x peajes
    public boolean verificarCantidadPeajes(int numeroPeajesPagados){
        if(this.getNumeroPeajes() >= numeroPeajesPagados){
            return true;
        }
        return false;
    }
    //metodo para calcular el valor final del peaje
    public double calcularPeajeFinal(){
        double valorPeajeInicial = getValorPeaje();
        double valorFinal = valorPeajeInicial*numeroEjes;

        if(this.capacidadCarga > 10){
            valorFinal = valorFinal+(valorFinal*10)/100;
        }
        return valorFinal;
    }
}
