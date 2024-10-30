package com.semana09;

import java.util.Scanner;

public class Ejcio59 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese texto: ");
		String n = sc.nextLine();
		
		int largo = n.length();
		char[] inv = new char[largo];
		

		
		for(int j =0;j<largo;j++){
		    inv[j] = n.charAt(largo - (j+1));
		}
		System.out.print(inv);
	}
}
