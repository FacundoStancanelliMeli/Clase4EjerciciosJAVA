package com.company;

public class SocorristaAuto extends Vehiculo{
    public SocorristaAuto(double velocidad, double aceleracion, double anguloGiro, String patente, double peso, int ruedas) {
        super(velocidad, aceleracion, anguloGiro, patente, peso, ruedas);
    }

    public void socorrer(Auto auto){
        System.out.println("Estoy socorriendo al auto con patente: " + auto.getPatente());
    }
}
