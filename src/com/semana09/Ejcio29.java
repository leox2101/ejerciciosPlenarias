package com.semana09;

import java.util.Scanner;

public class Ejcio29 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese texto: ");
		String n = sc.nextLine();
		
		int largo = n.length();
		
		for(int j =0;j<largo;j++){
		    System.out.print(n.charAt((largo - (j+1))));
		}
		
	}
}
