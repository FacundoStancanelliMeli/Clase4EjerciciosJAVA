package com.company;

public class SocorristaMoto extends Vehiculo{
    public SocorristaMoto(double velocidad, double aceleracion, double anguloGiro, String patente, double peso, int ruedas) {
        super(velocidad, aceleracion, anguloGiro, patente, peso, ruedas);
    }

    public void socorrer(Moto moto){
        System.out.println("Estoy socorriendo al auto con patente: " + moto.getPatente());
    }
}
