package com.company;

public abstract class Invitado {
    private String nombre;
    private int dni;

    public Invitado(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public abstract void comerPorcion(Porcion porcion);

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }
}
