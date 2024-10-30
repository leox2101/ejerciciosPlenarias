package com.semana13;

public class Rectangulo {
    private double base;
    private double altura;


    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    double getArea(){
        double area = this.base * this.altura;

        return area;
    }

    double getPerimetro(){
        double perimetro = this.base + this.altura;

        return perimetro;
    }
}
