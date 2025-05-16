package com.herencia;

public class Figura {

    private String nombre;
    private int numLados;

    public Figura () {
        
    }

    public Figura(String nombre, int numLados) {
        this.nombre = nombre;
        this.numLados = numLados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        if (numLados < 0)
            return;
        this.numLados = numLados;
    }

    public String toString() {
        return "Figura [nombre=" + nombre +
                ", numLados=" + numLados + "]";
    }    

    public double calcularPerimetro(){
        return 0;
    }

}