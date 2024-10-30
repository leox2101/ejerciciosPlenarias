package com.semana13;

public class MainCuenta {
    public static void main(String[] args) {
        
        CuentaAhorros ca = new CuentaAhorros("Juan", 10);

        
        ca.depositar(15000);   
        System.out.println(ca.consultar());
        ca.depositar(20000);
        System.out.println(ca.consultar());
        ca.retirar(10000);
        System.out.println(ca.consultar());
        ca.depositar(50000);
        System.out.println(ca.consultar());
        ca.retirar(200000);
        System.out.println(ca.consultar());
    }
}
