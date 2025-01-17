package com.banco;

/**
 * Clase que representa una cuenta.
 */
public class CuentaBancaria {

    /**
     * Dueño de la cuenta.
     */
    private String owner;

    /**
     * Balance de la cuenta en $$$$
     */
    private double balanceDolar;

    /**
     * Balance de la cuenta en €€€€
     */
    private double balanceEuro;

    /**
     * Constructor de la clase
     * 
     * @param owner        DUEÑO
     * @param balanceDolar BALANCE EN $, DEL QUE SE CALCULA TMB EN €
     */
    public CuentaBancaria(String owner, double balanceDolar) {
        this.owner = owner;
        this.balanceDolar = balanceDolar;
        this.balanceEuro = this.balanceDolar * 0.85;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalanceDolar() {
        return this.balanceDolar;
    }

    public void setBalanceDolar(double balanceDolar) {
        this.balanceDolar = balanceDolar;
    }

    public double getBalanceEuro() {
        return this.balanceEuro;
    }

    public void setBalanceEuro(double balanceEuro) {
        this.balanceEuro = balanceEuro;
    }

    /**
     * Realiza un ingreso de la cantidad indicada
     * 
     * @param cantidad Cantidad a ingresa expresada en DOLARES
     */
    public void ingresarDinero(int cantidad) {
        this.balanceDolar += cantidad;
        this.balanceEuro = this.balanceDolar * 0.85;
    }

    public String toString() {
        String mensaje = "La cuenta pertenece a " + this.owner + " y tiene " + this.balanceEuro + "euros";
        return mensaje;
    }

}
