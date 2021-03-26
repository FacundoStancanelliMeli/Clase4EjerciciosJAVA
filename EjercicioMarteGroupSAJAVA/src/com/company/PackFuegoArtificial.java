package com.company;

import java.util.ArrayList;

public class PackFuegoArtificial{
    private ArrayList<FuegoArtifical>listaFuegosArtificales;

    public PackFuegoArtificial(ArrayList<FuegoArtifical> listaFuegosArtificales) {
        this.listaFuegosArtificales = listaFuegosArtificales;
    }

    public int obtenerSizeLista(){
        return this.listaFuegosArtificales.size();
    }

    public FuegoArtifical obtenerFuego(int i){
        return listaFuegosArtificales.get(i);
    }
}
