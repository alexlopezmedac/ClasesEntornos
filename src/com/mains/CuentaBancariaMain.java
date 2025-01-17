package com.mains;

import com.banco.CuentaBancaria;

public class CuentaBancariaMain {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("yo", 200);
        System.out.println(c1.getBalanceEuro());
        System.out.println(c1);
    }
}
