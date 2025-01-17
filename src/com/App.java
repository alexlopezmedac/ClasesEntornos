package com;
import com.coche.Coche;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Coche coche1 = new Coche("rojo",
                1998,
                "SF90",
                "Ferrari");

        Coche coche2 = new Coche(2000,
                "SF90",
                "Opel");

        System.out.println(coche2.color);

        Coche coche3 = new Coche(2008,
                "Mercedes");

        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(coche3);

        // coche1 = null;
        // System.out.println(coche1);

    }
}
