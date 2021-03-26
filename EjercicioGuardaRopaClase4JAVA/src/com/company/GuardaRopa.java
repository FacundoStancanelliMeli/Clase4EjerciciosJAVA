package com.company;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    private int countId = 0;
    private HashMap<Integer, List<Prenda>> diccionario = new HashMap<>();

    public GuardaRopa() {
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        int valorKey = 0;

        diccionario.put(countId, listaDePrenda);

        countId++;

        return this.countId;
    }

    public void mostrarPrendas(){
        for (HashMap.Entry<Integer, List<Prenda>> entry : this.diccionario.entrySet()) {
            List<Prenda>listaARecorrer = entry.getValue();

            for (Prenda p:listaARecorrer){
                System.out.println("El numero de la prenda de marca " + p.getMarca() + " y modelo " + p.getModelo() + " es " + (entry.getKey()+1));
            }
        }
    }

    public List<Prenda> devolverPrendas(Integer numero){
        return this.diccionario.get(numero-1);
    }
}
