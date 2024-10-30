package com.semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejcio410 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Tamaño de su matriz: ");
        int n = sc.nextInt();
        System.out.println("");


    
        imprimirArr(convertirArrDinamico(crearArreglo(n)));

    }

    static ArrayList<Integer> crearArreglo(int n){

        ArrayList<Integer> dinamico = new ArrayList<>();

        int random;

        for(int i = 0;i<n;i++){
            random = (int) (Math.random() * 100);
            dinamico.add(random);
        }

        return dinamico;
    }

    static int[]  convertirArrDinamico(ArrayList<Integer> arr){
        int n = arr.size();
        int[] estatico = new int[n];

        for(int i = 0;i<n;i++){
            estatico[i] = arr.get(i);
        }   

        return estatico;
    }

    static void imprimirArr(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + "|");
        }
    }
}
