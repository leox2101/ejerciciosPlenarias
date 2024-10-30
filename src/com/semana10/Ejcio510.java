package com.semana10;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejcio510 {
    public static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {
        ArrayList<Integer> arr = leerValores();

        int promedio = calcularSuma(arr)/arr.size();

        mostrarMenores(arr, promedio);
        mostrarMayores(arr, promedio);

    }

    static ArrayList<Integer> leerValores(){

        ArrayList<Integer> arr = new ArrayList<>();
        int entrada;

        System.out.print("Ingrese un numero: ");
        entrada = sc.nextInt();

        while(entrada > 0){
            arr.add(entrada);
            System.out.print("Ingrese un numero: ");
            entrada = sc.nextInt();
        }

        return arr;
    }

    static int calcularSuma(ArrayList<Integer> arr){
        int cont = 0;
        for(int i = 0;i<arr.size();i++){
            cont += arr.get(i);
        }

        return cont;
    }

    static int calcularNroMenores(ArrayList<Integer> arr, int promedio){
        int menores = 0;

        for(int i = 0; i<arr.size();i++){
            if(arr.get(i) < promedio){
                menores++;
            }
        }

        return menores;
    }

    static int calcularNroMayores(ArrayList<Integer> arr, int promedio){
        int mayores = 0;

        for(int i = 0; i<arr.size();i++){
            if(arr.get(i) >= promedio){
                mayores++;
            }
        }

        return mayores;
    }

    static void mostrarMenores(ArrayList<Integer> arr, int promedio){

        System.out.print("\nNumeros menores a el promedio: ");
        if(calcularNroMenores(arr, promedio) > 0){
            for(int i = 0; i<arr.size();i++){
                if(arr.get(i) < promedio){
                    System.out.print(arr.get(i) + "|");
                }
            }
        } else{
            System.out.print("No se han encontrado");
        }
    }

    static void mostrarMayores(ArrayList<Integer> arr, int promedio){

        System.out.print("\nNumeros mayores a el promedio: ");
        if(calcularNroMayores(arr, promedio) > 0){
            for(int i = 0; i<arr.size();i++){
                if(arr.get(i) >= promedio){
                    System.out.print(arr.get(i) + "|");
                }
            }
        } else{
            System.out.print("No se han encontrado");
        }
    }
}
