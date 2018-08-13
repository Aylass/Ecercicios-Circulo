package com.company;

public class Circulo {

    private Ponto p;
    private double cx; // coordenada do x
    private double cy; // coordenada do y
    private double raio;

    //Método Construtor 1
    public Circulo(){
        this(0,0,1); // o this fala: procure nessa classe um metodo que receba 3 parametros e coloque os valores indicados
    }
    //Método Construtor 2
    public Circulo(double cx, double cy, double raio){
        this.cx = cx;
        this.cy = cy;
        this.raio = raio;
    }
    //Método Construtor Ponto
    public Circulo(Ponto p, double raio){
        this.raio = raio;
        this.p = p;
    }


    public double getCx(){
        return cx;
    }
    public double getCy() {
        return cy;
    }
    public double getRaio() {
        return raio;
    }
    public Ponto getP(){ return getP(); }

    public void setCx(double cx) {
        this.cx = cx;
    }
    public void setCy(double cy) {
        this.cy = cy;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    public void zoom(double nzoom){
        double aux = nzoom * raio;
        setRaio(aux);
    }

    public void move(double x, double y){
        setCx(x);
        setCy(y);
    }

    public double area(){
        double aux;
        double pi = 3.14;
        aux = Math.PI * (raio * raio);
        return aux;
    }

    public boolean interseccao(Circulo c1, Circulo c2){
        Ponto p1 = c1.getP();
        Ponto p2 = c2.getP();
        double a = p1.getCx() + p2.getCx();
        double b = p2.getCy() + p2.getCy();
        double h = 0;
        a = a*a;
        b = b*b;
    }

    public String toString(){

        return "Raio: " + raio + " X: " + cx + " Y: " + cy + "  Área: " + area();
    }
}
