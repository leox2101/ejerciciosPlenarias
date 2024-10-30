package com.semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejcio310 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Tamaño de su matriz: ");
        int n = sc.nextInt();
        System.out.println("");


    
        imprimirArr(convertirArrEstatico(crearArreglo(n)));

    }

    static int[] crearArreglo(int n){

        int[] matriz = new int[n];

        int random;

        for(int i = 0;i<n;i++){
            random = (int) (Math.random() * 100);
            matriz[i] = random;
        }

        return matriz;
    }

    static ArrayList<Integer> convertirArrEstatico(int[] arr){
        ArrayList<Integer> dinamico = new ArrayList<>();

        int n = arr.length;

        for(int i = 0;i<n;i++){
            dinamico.add(arr[i]);
        }   

        return dinamico;
    }

    static void imprimirArr(ArrayList<Integer> arr){
        for(int i =0;i<arr.size();i++){
            System.out.print(arr.get(i) + "|");
        }
    }
}
