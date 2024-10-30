package com.semana13;

public class CuentaAhorros {
    private String titular;
    private int id;
    private double saldo;

    public CuentaAhorros(String titular, int id){
        this.titular = titular;
        this.id = id;
        this.saldo = 0;
    }

    boolean depositar(double cantidad){
        this.saldo += cantidad;
        return true;
    }

    boolean retirar(double cantidad){
        if(this.saldo > cantidad){
            this.saldo -= cantidad;
            return true;
        }

        return false;
    }

    double consultar(){
        return this.saldo;
    }
}
