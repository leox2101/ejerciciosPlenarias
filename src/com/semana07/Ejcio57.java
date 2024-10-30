package com.semana07;

import java.util.Scanner;

public class Ejcio57 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el tamaño del arreglo: ");
		int n = sc.nextInt();

		int[] arreglo = new int[n];

	    for(int i = 0;i<n;i++){
	        arreglo[i] = ((i+1)*2);
	        System.out.print(arreglo[i] + "|");
	        
	    }
	    
	    System.out.println("");
	    
	    int alrrvz;

	    
	    for(int i = 0;i<n/2;i++){
	        
	        alrrvz = arreglo[i];
	        arreglo[i] = arreglo[n-(i+1)];
	        arreglo[n-(i+1)] = alrrvz;
	    }
	    
	    for(int x: arreglo){
	        System.out.print(x + "|");
	    }
	}
}
