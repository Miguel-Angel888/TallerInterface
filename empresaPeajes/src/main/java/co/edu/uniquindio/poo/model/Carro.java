package co.edu.uniquindio.poo.model;

import java.util.List;

public class Carro extends Vehiculo{

    //Atributos
    private boolean esElectrico;
    private boolean esPublico;

    //Constructos

    public Carro(String placa, int numeroPeajes, List<RegistroPeaje> listaRegistroPeajes,
                 Propietario propietario, boolean esElectrico,
                 boolean esPublico,double valorPeaje) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario,valorPeaje);
        this.esElectrico = esElectrico;
        this.esPublico = esPublico;
    }

    public boolean isEsElectrico() {
        return esElectrico;
    }

    public void setEsElectrico(boolean esElectrico) {
        this.esElectrico = esElectrico;
    }

    public boolean isEsPublico() {
        return esPublico;
    }

    public void setEsPublico(boolean esPublico) {
        this.esPublico = esPublico;
    }

    //Metodo para verificar el calculo del peahe del carro
    public double calcularPeajeFinal(){
        double valorPeajeFinal = getValorPeaje();
        double valorAux = 0;
        if(esElectrico){
            valorAux = (getValorPeaje()*20)/100;
            valorPeajeFinal -=valorAux;
        }
        if(esPublico){
            valorAux = (getValorPeaje()*15)/100;
            valorPeajeFinal +=valorAux;
        }
        return valorPeajeFinal;
    }
}
