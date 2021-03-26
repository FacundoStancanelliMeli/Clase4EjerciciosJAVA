package com.company;

import java.util.ArrayList;

public class Torta {
    private ArrayList<Porcion>listaPorciones = new ArrayList<>();
    private String sabor;

    public Torta(ArrayList<Porcion> listaPorciones, String sabor) {
        this.listaPorciones = listaPorciones;
        this.sabor = sabor;
    }

    public Porcion obtenerPorcion(){
        Porcion porcionADevolver = listaPorciones.get(listaPorciones.size()-1);
        listaPorciones.remove(porcionADevolver);
        return porcionADevolver;
    }

    public String getSabor() {
        return sabor;
    }
}
