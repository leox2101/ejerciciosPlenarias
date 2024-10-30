package com.semana08;

import java.util.Scanner;

public class Ejcio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de su matriz: ");
        int n = sc.nextInt();
        System.out.println("");

        int[][] matriz = new int[n][n];

        int cont = 1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matriz[i][j] = cont;
                cont++;
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
