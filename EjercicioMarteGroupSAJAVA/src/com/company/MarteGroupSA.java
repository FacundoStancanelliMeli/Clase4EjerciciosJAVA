package com.company;

import java.util.ArrayList;

public class MarteGroupSA {
    private ArrayList<Invitado>listaInvitados;
    private ArrayList<PackFuegoArtificial>listaFuegosArtificiales;
    private Torta torta;

    public MarteGroupSA(ArrayList<Invitado> listaInvitados, ArrayList<PackFuegoArtificial> listaFuegosArtificiales, Torta torta) {
        this.listaInvitados = listaInvitados;
        this.listaFuegosArtificiales = listaFuegosArtificiales;
        this.torta = torta;
    }

    public void reventarFuegosArtificales(){
        for (PackFuegoArtificial packFuegoArtificial: listaFuegosArtificiales){

            for (int i = 0; i < packFuegoArtificial.obtenerSizeLista(); i++){
                packFuegoArtificial.obtenerFuego(i).reventar();
            }
        }
    }

    public void distribuirPorciones(){
        for (Invitado invitado : listaInvitados){
            invitado.comerPorcion(torta.obtenerPorcion());
        }
    }
}
