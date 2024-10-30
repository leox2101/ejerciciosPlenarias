package com.ejercicios;
import java.util.Scanner;

public class Ejercicio1{

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Ingrese tamaño para su arreglo: ");
        int n = sc.nextInt();
        int[] vector = new int[n];


        int f;
        for(int i =0; i<n; i++){
            System.out.print("Ingrese valor #" + (i+1) + " para su arreglo: ");
            f = sc.nextInt();
            vector[i] = f;
        }
        System.out.println("");

        imprimir(vector);
        rodar(vector);
        imprimir(vector);
        
        
    }

    static void invertir(int[] arr){
        int inv;
        for(int i=0;i<(arr.length/2);i++){
            inv = arr[i];
            arr[i] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = inv;
        }
    }

    static void rodar(int[] arr){
        
        int n = arr.length;
        System.out.print("Cuantos espacios desea rodar a la derecha: ");
        int k = sc.nextInt();

        k%=n;
        int r, g;
            invertir(arr);
        for(int i=0;i<((n-k)/2);i++){
            r = arr[i + k];
            arr[i+k] = arr[arr.length - (i+1)];
            arr[arr.length - (i+1)] = r;
        }

        for(int i=0;i<(k/2);i++){
            g = arr[i];
            arr[i] = arr[k-(i+1)];
            arr[k-(i+1)] = g;
        }
        System.out.println("");
    }

    static void imprimir(int[] arr){
        for(int x: arr){
            System.out.print(x + "|");
        }
        System.out.println("");
    }

}
