package com.semana14;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan","Cortes",1137977461,2007);
        Persona p2 = new Persona("Daniel","Cortes",1003712931,2002);

        p1.imprimir();
        p2.imprimir();

        System.out.println("");

        ArregloPersonas.adicionar(p1);
        ArregloPersonas.imprimir();
        ArregloPersonas.buscarID(123431);


    }
}
