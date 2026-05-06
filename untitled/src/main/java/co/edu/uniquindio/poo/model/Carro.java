package co.edu.uniquindio.poo.model;

import java.util.List;

public class Carro extends Vehiculo{

    //Atributos
    private boolean esElectrico;
    private boolean esPublico;

    //Constructos

    public Carro(String placa, int numeroPeajes, List<RegistroPeaje> listaRegistroPeajes,
                 Propietario propietario, boolean esElectrico, boolean esPublico) {
        super(placa, numeroPeajes, listaRegistroPeajes, propietario);
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
}
