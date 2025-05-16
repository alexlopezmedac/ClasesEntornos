package com.herencia;

public class MainFigura {
    public static void main(String[] args) {
        System.out.println("HOLA");

        Figura f1 = new Figura("Hexagono",
                6);

        System.out.println(f1);

        Triangulo t1 = new Triangulo(
            "TRIANGULO",
            3,
            5.5,
            8.9
        );
        System.out.println(t1.getNumLados());
        System.out.println(t1.calcularPerimetro());
    }
}
