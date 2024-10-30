package com.semana13;

public class Calculadora {
    private float memoria;




    public Calculadora(){
        this.memoria = 0;
    }

    float obtenerMemoria(){
        return this.memoria;
    }

    void iniciarMemoria(){
        this.memoria = 0;
    }

    float sumar(float a, float b){
        float resultado = a+b;
        this.memoria += resultado;

        return resultado;
    }

    float restar(float a, float b){
        float resultado = a-b;
        this.memoria += resultado;

        return resultado;
    }

    float multiplicar(float a, float b){
        float resultado = a*b;
        this.memoria += resultado;

        return resultado;
    }

    float dividir(float a, float b){
        float resultado = a/b;
        this.memoria += resultado;

        return resultado;
    }
}
