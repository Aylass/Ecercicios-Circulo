package com.company;

public class Ponto {
    private double cx;
    private double cy;

    public Ponto(double cx, double cy){
        this.cx = cx;
        this.cy = cy;
    }

    public double getCx() {
        return cx;
    }
    public double getCy() {
        return cy;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }
    public void setCy(double cy) {
        this.cy = cy;
    }
    public String toString(){

        return  " Ponto:  (" + cx + "," + cy  + ")";
    }
}
