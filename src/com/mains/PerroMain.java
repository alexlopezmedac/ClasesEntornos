package com.mains;

import com.Perro;

public class PerroMain {
    public static void main(String[] args) {

        Perro perro1 = new Perro(
                "rotweiller",
                "AAAAAAAAAAAAA");
        Perro perro2 = new Perro(
                "chiguagua");

        perro1.ladrar();
        perro2.ladrar();

        System.out.println(perro1.getRaza());
        if (perro1.getRaza() == perro2.getRaza()) {
            System.out.println("IGUALES");
        }

        System.out.println(perro1.getRaza());
        perro1.setRaza("");
        System.out.println(perro1.getRaza());

    }
}
