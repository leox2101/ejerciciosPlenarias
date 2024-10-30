package com.semana13;

public class Main {
    public static void main(String[] args) {
        float a = 10.3f;
        float b = 5.4f;
        float c = 7f;
        float d = 6.3f;
        float r=0;


        Calculadora calc = new Calculadora();

        r = calc.sumar(a,b);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());

        r = calc.restar(c,d);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());

        r = calc.multiplicar(c,d);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());

        r = calc.sumar(a,b);
        System.out.println(r);
        System.out.println(calc.obtenerMemoria());

        System.out.println("\n\n Rectangulo \n");

        Rectangulo rect1 = new Rectangulo(12, 20);

        System.out.println("Area del rectangulo: " + rect1.getArea());
        System.out.println("Perimetro del rectangulo: " + rect1.getPerimetro());
    }
}
