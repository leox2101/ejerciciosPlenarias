package com.semana08;

public class Ejcio18 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];


        int cont = 1;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
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
