package com.ejercicios;
import java.util.Scanner;

public class Ejercicio3 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int m,n,c;
        System.out.print("Ingrese numero de filas: ");
        m = sc.nextInt();
        System.out.print("Ingrese numero de columnas: ");
        n = sc.nextInt();

        int[][] matriz = new int[m][n];

        for(int i =0;i<m;i++){
            System.err.println("Ingrese valores para fila #" + (i+1) + ": " );
            for(int j=0;j<n;j++){
                System.out.print((j+1)+": ");
                c = sc.nextInt();
                matriz[i][j] = c;
            }
            System.out.println("");
        }

        imprimirARR(matriz);
        System.out.println("");
        transponerARR(matriz);
    }

    public static void imprimirARR(int[][] arr){
        for(int[] fila: arr){
            for(int column: fila){
                System.out.print(column + "|");
            }
            System.out.println("");
        }
    }

    public static void transponerARR(int[][] arr){
        int[][] trans = new int[arr[0].length][arr.length];

        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                trans[j][i] = arr[i][j];
            }
        }
        System.out.println("");
        imprimirARR(trans);
    }
}
