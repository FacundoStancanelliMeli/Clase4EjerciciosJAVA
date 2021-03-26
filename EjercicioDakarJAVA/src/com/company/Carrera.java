package com.company;

import java.util.ArrayList;

public class Carrera {
    private final double distancia;
    private final double premioEnDolares;
    private final String nombre;
    private final int cantVehiculos;
    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private final SocorristaAuto socorristaAuto;
    private final SocorristaMoto socorristaMoto;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantVehiculos, ArrayList<Vehiculo> vehiculos, SocorristaMoto socorristaMoto, SocorristaAuto socorristaAuto) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantVehiculos = cantVehiculos;
        this.vehiculos = vehiculos;
        this.socorristaAuto = socorristaAuto;
        this.socorristaMoto = socorristaMoto;
    }

    private void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente){
        Auto auto = new Auto(velocidad, aceleracion, anguloDeGiro, patente);
        vehiculos.add(auto);
    }

    private void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente){
        Moto moto = new Moto(velocidad, aceleracion, anguloDeGiro, patente);
        vehiculos.add(moto);
    }

    public void eliminarVehiculoConPatente(String unaPatente){
        int posicion = busquedaPatente(unaPatente);
        if(condicionPatenteHallada(unaPatente, posicion)){
            this.vehiculos.remove(busquedaPatente(unaPatente));
        }
    }

    private int busquedaPatente(String patente){
        int i = -1;
        do{
            i++;
        }while (!this.vehiculos.get(i).getPatente().equals(patente));
        return i;
    }

    private boolean condicionPatenteHallada(String patente, int posicion){
        return this.vehiculos.get(posicion).getPatente().equals(patente);
    }

    public void socorrerAuto(String patente){
        int posicion = busquedaPatente(patente);
        if(condicionPatenteHallada(patente, posicion)){
            socorristaAuto.socorrer((Auto) this.vehiculos.get(posicion));
        }
    }

    public void socorrerMoto(String patente){
        int posicion = busquedaPatente(patente);
        if(condicionPatenteHallada(patente, posicion)){
            socorristaMoto.socorrer((Moto) this.vehiculos.get(posicion));
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantVehiculos() {
        return cantVehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
