package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Invitado invitado1 = new InvitadoMeli("Facundo Stancanelli", 44824615);
        Invitado invitado2 = new InvitadoMeli("Maria Jimenez", 43332332);
        Invitado invitado3 = new InvitadoStandard("Camila Stancanelli", 12222123);
        Invitado invitado4 = new InvitadoStandard("Sabrina Muñiz", 2321321);

        ArrayList<Invitado> listaInvitados = new ArrayList<>();
        listaInvitados.add(invitado1);
        listaInvitados.add(invitado2);
        listaInvitados.add(invitado3);
        listaInvitados.add(invitado4);

        FuegoArtifical fuegoArtifical = new FuegoArtifical("Azul", 1000, "Piumm");
        FuegoArtifical fuegoArtifical2 = new FuegoArtifical("Rojo", 200, "Piumam");
        FuegoArtifical fuegoArtifical3 = new FuegoArtifical("Amaraillo", 13000, "Pwwiumm");
        FuegoArtifical fuegoArtifical4 = new FuegoArtifical("Violeta", 10400, "Piawdawumm");
        FuegoArtifical fuegoArtifical5 = new FuegoArtifical("Naranja", 10040, "Piumqqm");

        ArrayList<FuegoArtifical> listaf1 = new ArrayList<>();
        listaf1.add(fuegoArtifical);
        listaf1.add(fuegoArtifical2);

        ArrayList<FuegoArtifical> listaf2 = new ArrayList<>();
        listaf2.add(fuegoArtifical3);
        listaf2.add(fuegoArtifical4);

        ArrayList<FuegoArtifical> listaf3 = new ArrayList<>();
        listaf3.add(fuegoArtifical5);

        PackFuegoArtificial packFuegoArtificial1 = new PackFuegoArtificial(listaf1);
        PackFuegoArtificial packFuegoArtificial2 = new PackFuegoArtificial(listaf2);
        PackFuegoArtificial packFuegoArtificial3 = new PackFuegoArtificial(listaf3);

        ArrayList<PackFuegoArtificial>listaPacks = new ArrayList<>();
        listaPacks.add(packFuegoArtificial1);
        listaPacks.add(packFuegoArtificial2);
        listaPacks.add(packFuegoArtificial3);


        ArrayList<Porcion>porcions = new ArrayList<>();
        Porcion porcion = new Porcion(20);
        Porcion porcion1 = new Porcion(20);
        Porcion porcion2 = new Porcion(30);
        Porcion porcion3 = new Porcion(40);

        porcions.add(porcion);
        porcions.add(porcion1);
        porcions.add(porcion2);
        porcions.add(porcion3);

        Torta torta = new Torta(porcions, "Chocolate");

        MarteGroupSA marteGroupSA = new MarteGroupSA(listaInvitados,listaPacks, torta);

        marteGroupSA.reventarFuegosArtificales();
    }
}
