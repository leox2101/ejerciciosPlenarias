package com.semana12;

import java.util.Scanner;


public class Ejcio312 {
    public static Scanner sc = new Scanner(System.in);
    public static int num=0;
    public static void main(String[] args) throws InterruptedException {
        int n = 1000;
        int[] arreglo = new int[n];

        int opcion = leerMenu();
            while(opcion != 0){
                switch (opcion){
                    case 1:
                        System.out.print("Ingrese el elemento a añadir: ");
                        int elemento = sc.nextInt();
                        addElemento(arreglo, elemento);
                        num = 0;
                        Thread.sleep(3000);
                        break;

                    case 2:
                        System.out.print("Ingrese el elemento a borrar: ");
                        int elemento2 = sc.nextInt();
                        borrarElemento(arreglo, elemento2);
                        num = 0;
                        Thread.sleep(3000);
                        break;

                    case 3:
                        imprimirArr(arreglo);
                        num = 0;
                        Thread.sleep(3000);
                        break;

                    case 4:
                        System.out.print("Ingrese el elemento a buscar: ");
                        int elemento3 = sc.nextInt();
                        buscarElemento(arreglo, elemento3);
                        num = 0;
                        Thread.sleep(3000);
                        break;

                    default:
                        System.out.println("Ingrese una opcion valida \n");
                        Thread.sleep(3000);
                        break;
                }
                opcion = leerMenu();
            }
    }

        static int leerMenu(){
            System.out.println("1: Adicionar un elemento\n2: Borrar un elemento\n3: Imprimir arreglo\n4: Buscar un elemento\n0: Salir\n");
            System.out.print("Ingresar comando: ");
            int opcion = sc.nextInt();

            return opcion;
        }

        static void ordenarArr(int[] arr){
            int n = arr.length;
            int temp;

            for(int j = 0; j<n; j++){
                for(int i = 0;i<n - j -1;i++){
                    if(arr[i] > arr[i+1] && arr[i] != 0 && arr[i+1] != 0){
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                        num++;
                    }else if(arr[i] == 0){
                        temp = arr[i];
                        arr[i] = arr[i+1];
                        arr[i+1] = temp;
                    }  
                }
            }
        }

        static void addElemento(int[] arr, int elemento){
            int n = arr.length;

            for(int i = 0; i<n;i++){
                if (arr[i] == 0){
                    arr[i] = elemento;
                    ordenarArr(arr);
                    num++;
                    break;
                }
            }

            System.out.println("\nNumero de pasos para añadir el elemento y ordenar el array: " + num);

        }

        static void borrarElemento(int[] arr, int elemento){
            int n = arr.length;

            boolean encontrado = false;

            for(int i = 0; i<n;i++){
                if(arr[i] != 0){
                    if (arr[i] == elemento ){
                        arr[i] = 0;
                        encontrado = true;
                        ordenarArr(arr);
                        break;
                    }
                }

                num++;
            }

            if(!encontrado){
                System.out.println("\nNo se ha encontrado el elemento");
            }
            System.out.println("Numero de pasos para buscar el elemento: " + num + "\n");
            
        }


        static void imprimirArr(int[] arr){

            int n = arr.length;
            System.out.print("\nArreglo: ");
            for(int i = 0; i<n;i++){
                if (arr[i] != 0){
                    System.out.print(arr[i] + "|");
                    num++;
                }
            }

            System.out.println("\nNumero de pasos para imprimir el array: " + num + "\n");
        }

        static void buscarElemento(int[] arr, int elemento){
            int n = arr.length;
            boolean encontrado = false;

            for(int i = 0;i<n;i++){
                if(arr[i] == elemento){
                    System.out.println("\nElemento encontrado en la posicion: " + i + " del arreglo");
                    encontrado = true;
                    break;
                } 
                num++;
            }

            if(!encontrado){
                System.out.println("\nNo se ha encontrado el elemento");
            }
            System.out.println("Numero de pasos para buscar el elemento: " + num + "\n");
            
        }
}
