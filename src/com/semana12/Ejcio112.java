package com.semana12;

public class Ejcio112 {

    public static int pasos = 0;
    public static void main(String[] args) {
        char[][] matriz = {
            {'h', 'o', 'l', 'a'},
            {'p', 'n', 'n', 'a'},
            {'e', 'a', 'f', 'i'},
            {'c', 'm', 'o', 's'}
            
        };

        String[] palabras = {"mano", "hola", "eafit", "cana", "paz"};

        for(String x: palabras){
            boolean encontrada = buscarPalabras(matriz, x);

            if(!encontrada){
                System.out.println("No se ha encontrado: " +x);
            }
        }

    }

    static boolean buscarPalabras(char[][] arr, String palabra){


        int tamañoPalabra = palabra.length();
        int n = arr.length;

        int[][] direcciones = {
            {0, 1}, {0, -1},  // Horizontal derecha e izquierda
            {1, 0}, {-1, 0},  // Vertical abajo y arriba
            {1, 1}, {-1, -1}, // Diagonal principal abajo y arriba
            {1, -1}, {-1, 1}  // Diagonal secundaria abajo y arriba
        };

        for(int i= 0;i<n;i++){
            for(int j = 0; j<n;j++){
                for(int[] direccion : direcciones){
                    int x = i, y = j;
                    boolean encontrada = true;

                    for(int k = 0;k<tamañoPalabra;k++){
                        pasos++;
                        if (x < 0 || x >= n || y < 0 || y >= n || arr[x][y] != palabra.charAt(k)) {
                            encontrada = false;
                            break;
                        }
                        x += direccion[0];
                        y += direccion[1];

                    }

                    
                    if (encontrada) {
                        int xf = i + (tamañoPalabra - 1) * direccion[0];
                        int yf = j + (tamañoPalabra - 1) * direccion[1];
                        System.out.println(palabra + " ha sido encontrada de (" + i + ", " + j + ") a (" + xf + ", " + yf + ")");
                        return true;
                    }
                }
                
            }
        }
        return false;
    }
}
