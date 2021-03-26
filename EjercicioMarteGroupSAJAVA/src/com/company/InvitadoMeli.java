package com.company;

public class InvitadoMeli extends Invitado{
    public InvitadoMeli(String nombre, int dni) {
        super(nombre, dni);
    }

    @Override
    public void comerPorcion(Porcion porcion) {
        System.out.println("Viva la Chiqui!!");
    }
}
