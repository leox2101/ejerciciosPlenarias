package com.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Ingrese tamaño de matriz cuadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];

        int c;
        for(int i =0;i<n;i++){
            System.err.println("Ingrese valores para fila #" + (i+1) + ": " );
            for(int j=0;j<n;j++){
                System.out.print((j+1)+": ");
                c = sc.nextInt();
                matriz[i][j] = c;
            }
            System.out.println("");
        }

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matriz[i][j] + "|");
            }
            System.out.println("");
        }
        System.out.println("");

        sumarDiag(matriz);
    }

    public static void sumarDiag(int[][] arr){
        int sum,sum2;
        sum = sum2 = 0;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: "+sum);

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i+j) == (arr.length-1)){
                    sum2 += arr[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal secundaria es: "+sum2);
    }
}
