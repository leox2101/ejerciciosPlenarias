package com.semana08;

import java.util.Scanner;

public class Ejcio58 {
    public static String[] info = {"id", "edad", "ado de nacimiento", "numero de materias"};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresar el numero de estudiantes: ");
		int n = sc.nextInt();
		System.out.println("");

		int[][] arreglo = new int[4][n];

		llenarArr(arreglo);
		menu(arreglo);

	}

	static void llenarArr(int[][] arr) {
		Scanner leer = new Scanner(System.in);
		int data;

		for(int i =0; i<arr[0].length; i++) {
			System.out.println("Ingresar datos estudiante n#" + (i+1) + ": ");
			for(int j=0; j<arr.length; j++) {
				System.out.print(info[j] +": ");
				data = leer.nextInt();
				arr[j][i] = data;
			}
			System.out.println("");
		}
		System.out.println("");
	}

	static void buscarID(int[][] arr, int id) {

		int data;
		boolean econt= false;
        System.out.println("Datos de estudiante con el id solicitado: ");
		for(int i =0; i<arr[0].length; i++) {
			if (arr[0][i] == id) {
			    econt= true;
				for(int j=0; j<arr.length; j++) {
					data = arr[j][i];
					System.out.println(info[j] + ": " + data);
				}
			}

			System.out.println("");
		}
		if (!econt){
		    System.out.println("No se encotraron estudiantes con el id " + id);
		}
		System.out.println("");
	}

	static void buscarRangoEdad(int[][] arr, int min, int max) {

		int cont = 0;
		System.out.println("Estudiantes en el rango de edad ("+min+" - "+max+"): ");
		for(int i =0; i<arr[0].length; i++) {
			if (arr[1][i] <= max && arr[1][i] >= min) {
				cont++;

			}

		}

		if (cont == 1) {
			System.out.println("Se ha encontrado " + cont +" estudiante");
		} else if (cont > 1) {
			System.out.println("Se han encontrado " + cont +" estudiantes");
		} else {
			System.out.println("No se han encontrado estudiantes");
		}
		System.out.println("");
	}


	static void imprimirArr(int[][] arr) {

		for(int i =0; i<arr[0].length; i++) {
			System.out.println("Estudiante n#" + (i+1) + ": ");
			for(int j=0; j<arr.length; j++) {
				System.out.println(info[j]+": "+  arr[j][i]);
			}
			System.out.println("");
		}
		System.out.println("");
	}

	static void buscarAdo(int[][] arr, int ado) {

		System.out.println("Estudiantes nacidos en "+ ado + ": ");
		boolean econt = false;
		int data;

		for(int i =0; i<arr[0].length; i++) {
			if (arr[2][i] == ado) {
				econt = true;
				for(int j=0; j<arr.length; j++) {
					data = arr[j][i];
					System.out.println(info[j] + ": " + data);
				}
			}

			System.out.println("");
		}

		if (!econt) {
			System.out.println("No se han encontrado estudiantes");
		}
		System.out.println("");
	}

	static void promMaterias(int[][] arr) {
		int sum =0;
		int cont=0;
		for(int i =0; i<arr[0].length; i++) {
			sum += arr[3][i];
			cont++;
		}
		double res = (double) sum/cont;
		System.out.println("El promedio de materias es: "+ res);
		System.out.println("");
	}

	static void menu(int[][] arr) {
		Scanner sc = new Scanner(System.in);
		int ind;
		do {
			ind = preguntaMenu();
			System.out.println("");
			switch (ind) {
			case 0:
			    System.out.println("");
				System.out.println("Programa terminado");
				break;
			case 1:
			    System.out.println("");
				llenarArr(arr);
				break;
			case 2:
			    System.out.println("");
				imprimirArr(arr);
				break;
			case 3:
			    System.out.println("");
				System.out.print("Ingrese el id: ");
				int id = sc.nextInt();
				buscarID(arr, id);
				break;
			case 4:
			    System.out.println("");
				System.out.print("Edad menor: ");
				int min = sc.nextInt();
				System.out.print("Edad mayor: ");
				int max = sc.nextInt();
				buscarRangoEdad(arr, min, max);
				break;
			case 5:
			    System.out.println("");
			    System.out.print("Ingrese ano de nacimiento: ");
				int ado = sc.nextInt();
				buscarAdo(arr, ado);
				break;
			case 6:
			    System.out.println("");
				promMaterias(arr);
				break;
			default:
				System.out.println("Ingrese un numero adecuado: ");

			}
			
		} while (ind != 0);

	}

	public static int preguntaMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("Digite un numero para realizar una accion");
		System.out.println("0: Salir");
		System.out.println("1: Volver a llenar lista de estudiantes");
		System.out.println("2: Imprimir lista de estudiantes");
		System.out.println("3: Buscar estudiante por ID");
		System.out.println("4: Consultar numero de estudiantes en un rango de edad");
		System.out.println("5: Filtrar lista de estudiante por ano de nacimiento");
		System.out.println("6: Consultar promedio de materias de la lista de estudiantes");
		System.out.println("");
		System.out.print("Ingresar numero: ");
		int ind = sc.nextInt();
		System.out.println("");

		return ind;
	}

}
