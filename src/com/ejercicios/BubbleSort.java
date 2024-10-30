package com.ejercicios;
import java.util.ArrayList;

public class BubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> arreglo = new ArrayList<>();
        int random, point;
        
        for(int i=0; i<11; i++){
            random = (int) (Math.random() * 101);
            arreglo.add(random);
        }

        int n = arreglo.size();

        System.out.print(arreglo+"\n");
        //aux=0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo.get(j) > arreglo.get(j + 1)) {
                    point = arreglo.get(j);
                    arreglo.set(j, arreglo.get(j + 1));
                    arreglo.set(j + 1, point);
                }
            }
        }

        System.out.print(arreglo+"\n");

    }
}
