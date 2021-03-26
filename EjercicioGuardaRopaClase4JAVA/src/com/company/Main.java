package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GuardaRopa guardaRopa = new GuardaRopa();
        Prenda prenda1 = new Prenda("Gucci", "2312321312");

        Prenda prenda2 = new Prenda("Adidas", "2k");

        Prenda prenda3 = new Prenda("Nikei", "4462659");

        Prenda prenda4 = new Prenda("AAAAA", "44412321k");

        Prenda prenda5 = new Prenda("NBBBBB", "421321");

        Prenda prenda6 = new Prenda("CCCCCC", "44WWW");

        List<Prenda> list = Arrays.asList(prenda1, prenda2, prenda3);
        List<Prenda> list1 = Arrays.asList(prenda4, prenda5, prenda6);

        System.out.println(guardaRopa.guardarPrendas(list));
        System.out.println(guardaRopa.guardarPrendas(list1));
        guardaRopa.mostrarPrendas();
    }
}
