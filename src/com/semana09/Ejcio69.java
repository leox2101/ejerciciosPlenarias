package com.semana09;

import java.util.Scanner;

public class Ejcio69 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ingrese texto: ");
		String n = sc.nextLine();
		
		
		System.out.println(moparStr(n));
		
	}
	
	static String moparStr(String n){
	    String par;
	    String impar;
	    if (n.length()%2 == 0){
	        par = (String.valueOf(n.charAt(0)) + String.valueOf(n.charAt((n.length() - 1))));
	        return par;
	    } else {
	        impar = (String.valueOf(n.charAt(0)) + String.valueOf(n.charAt((n.length() - 1)/2)) +String.valueOf(n.charAt((n.length() - 1))));
	        return impar;
	    }
	}
}
