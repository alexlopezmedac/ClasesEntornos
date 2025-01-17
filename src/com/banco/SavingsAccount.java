package com.banco;
public class SavingsAccount {

    public double balance;

    public SavingsAccount(int initialBalance) {
        balance = initialBalance;
    }

    public void ingresarDinero(int cantidad) {
        if (cantidad > 0) {
            balance += cantidad;
        }
    }

    public void retirarDinero(int cantidad) {
        if (cantidad <= balance) {
            balance -= cantidad;
        }
    }

}
