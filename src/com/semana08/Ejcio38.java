package com.semana08;

import java.util.Scanner;

public class Ejcio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de filas de su matriz: ");
        int m = sc.nextInt();
        System.out.print("Tamaño de columnas de su matriz: ");
        int n = sc.nextInt();
        System.out.println("");

        int[][] matriz = new int[m][n];

        int random;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                random = (int) (Math.random() * 11);
                matriz[i][j] = random;

            }
        }

        for(int[] x: matriz){
            for(int y: x){
                System.out.print(y + "|");
            }
            System.out.println("");
        }
    }
}
