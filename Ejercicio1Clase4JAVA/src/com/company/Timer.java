package com.company;

import java.util.Calendar;

public class Timer {
    private long horaActualEnMilisegundosInicio;
    private long horaActualEnMilisegundosFin;

    public void startTImer(){
// This gets the time in milliseconds
        horaActualEnMilisegundosInicio = System.currentTimeMillis();
// some time passes

    }

    public void stopTimer(){
// This gets the time in milliseconds
        horaActualEnMilisegundosFin = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return this.horaActualEnMilisegundosFin - this.horaActualEnMilisegundosInicio;
    }

}
