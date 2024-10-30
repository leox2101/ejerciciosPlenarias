package com.semana09;

import java.util.Scanner;

public class Ejcio19 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese texto1: ");
		String n = sc.nextLine();
		System.out.println("ingrese texto2: ");
		String c = sc.nextLine();
		System.out.println("");
		
		if (n.equals(c)){
		    System.out.println("Los textos son iguales");
		}else{
		    System.out.println("los textos son diferentes");
		}
		
		
	}
}
