package com.herencia;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
        // internamente llama a:
         super(); // =====  new Figura()
    }

    public Triangulo(String nombre,
            int numLados,
            double base,
            double altura) {
        super(nombre, numLados);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro(){
        return 15;
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    
}
