package com.semana08;

import java.util.Scanner;

public class Ejcio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño de su matriz: ");
        int n = sc.nextInt();
        System.out.println("");

        int[][] matriz = new int[n][n];

        int random;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                random = (int) (Math.random() * 100);
                matriz[i][j] = random;
            }
        }

        for(int[] x: matriz){
            for(int y: x){
                System.out.print(y + "|");
            }
            System.out.println("");
        }
        System.out.println("");

        int[][] transpo = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                transpo[i][j] = matriz[j][i];
            }
        }

        for(int[] x: transpo){
            for(int y: x){
                System.out.print(y + "|");
            }
            System.out.println("");
        }

        System.out.println("\nDiagonal principal de matriz 2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i == j){
                    System.out.print(transpo[i][j] + "|");
                }else{
                    System.out.print("0 |");
                }
            }
            System.out.println("");
        }
    }
}
