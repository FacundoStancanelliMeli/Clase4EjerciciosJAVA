package com.company;

public class Vehiculo {
    private double velocidad;
    private double aceleracion;
    private double anguloGiro;
    private String patente;
    private double peso;
    private int ruedas;


    public Vehiculo(double velocidad, double aceleracion, double anguloGiro, String patente, double peso, int ruedas) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloGiro = anguloGiro;
        this.patente = patente;
        this.peso = peso;
        this.ruedas = ruedas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public double getAnguloGiro() {
        return anguloGiro;
    }

    public String getPatente() {
        return patente;
    }

    public double getPeso() {
        return peso;
    }

    public int getRuedas() {
        return ruedas;
    }
}
