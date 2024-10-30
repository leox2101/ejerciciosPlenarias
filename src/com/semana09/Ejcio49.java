package com.semana09;

public class Ejcio49 {
    public static void main(String[] args) {
		
		String str1 = "Esta es una prueba de string, que verifica donde esta un string";
		String str2 = "esta";
		String str3 = "string";
		
		encontrarString(str1, str2);
		System.out.println("");
		encontrarString(str1, str3);
		
	}
	
	static void encontrarString(String texto, String buscar){
	    String textomin = texto.toLowerCase();
	    
	    if(textomin.indexOf(buscar) != -1){
	        System.out.println(buscar + " econtrado en la posicion " + textomin.indexOf(buscar)); 
	    }else{
	        System.out.println("no se encontro " + buscar);
	    }
	}
}
