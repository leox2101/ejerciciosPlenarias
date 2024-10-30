package com.semana10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Ejcio110 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Luisa");
        nombres.add("Ana");
        nombres.add("Fernando");

        Iterator<String> iterator = nombres.iterator();

        while (iterator.hasNext()) {
            String nombre = iterator.next();
            System.out.println(nombre);
        }

    }

}
