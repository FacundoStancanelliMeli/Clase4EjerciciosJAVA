package com.company;

import java.io.IOException;
import java.util.Comparator;

public class Main {

    public static void main(String[] args){
	// write your code here



        Integer arr[]=new Integer[10000];

        for (int i = 0; i < 10000; i++){
            arr[i] = i;
        }

        Comparator<Integer> c1 = (a,b)->a-b;

        Sorter quick = (Sorter) MiFactory.getInstance("*");

        Timer timer = new Timer();
        timer.startTImer();
        quick.sort(arr, c1);
        timer.stopTimer();


        System.out.println(timer.elapsedTime());

    }
}
