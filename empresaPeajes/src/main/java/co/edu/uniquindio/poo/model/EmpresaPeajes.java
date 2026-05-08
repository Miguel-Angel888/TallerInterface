package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class EmpresaPeajes {

    //Atributos
    private String nombre;

    //Relaciones
    private List<Vehiculo> listaVehiculos;
    private List<ICobrador> listaCobradores;
    private List<Persona> listaPersonas;

    //Constructor

    public EmpresaPeajes(String nombre, List<Vehiculo> listaVehiculos,
                         List<ICobrador> listaCobradores, List<Persona> listaPersonas) {
        this.nombre = nombre;
        this.listaVehiculos = listaVehiculos;
        this.listaCobradores = listaCobradores;
        this.listaPersonas = listaPersonas;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public List<ICobrador> getListaCobradores() {
        return listaCobradores;
    }

    public void setListaCobradores(List<ICobrador> listaCobradores) {
        this.listaCobradores = listaCobradores;
    }

    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(List<Persona> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    /*Verificar todos los vehiculos tipo camion con mayor o igual peso a X
    * y que haya pagado mas de X peajes
    */
    public List<Vehiculo> buscarCamionesPorPesoYPeajes(double peso,int numeroPeajes){
        List<Vehiculo> listaVehiculosFinal = new ArrayList<>();
        for(Vehiculo camionAux:listaVehiculos){
            if(camionAux instanceof Camion){
                if(((Camion) camionAux).verificarCantidadPeajes(numeroPeajes) &&
                        ((Camion) camionAux).verificarPeso(peso)){
                    listaVehiculosFinal.add(camionAux);
                }
            }
        }
        return listaVehiculosFinal;

    }

}
