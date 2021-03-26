package com.company;

public class FuegoArtifical {
    private String color;
    private double alcance;
    private String mensajeAlReventar;

    public FuegoArtifical(String color, double alcance, String mensajeAlReventar) {
        this.color = color;
        this.alcance = alcance;
        this.mensajeAlReventar = mensajeAlReventar;
    }

    public FuegoArtifical() {
    }

    public String getColor() {
        return color;
    }

    public double getAlcance() {
        return alcance;
    }

    public void reventar(){
        System.out.println(this.mensajeAlReventar);
    }
}
