package com.semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejcio210 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Luisa");
        nombres.add("Ana");
        nombres.add("Fernando");

        for(String x: nombres){
            System.out.print(x+", ");
        }

    }
}
