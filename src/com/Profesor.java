package com;
import java.util.ArrayList;

public class Profesor {
    public String dni;
    public String nombre;
    public double salario;
    public ArrayList<Asignatura> listaAsignaturas;

    public Profesor(String dniProfe,
            String nombreProfe,
            double salarioProfe,
            ArrayList<Asignatura> listaAsignaturasProfe) {
        System.out.println("Creando profesor " + nombreProfe);
        dni = dniProfe;
        nombre = nombreProfe;
        salario = salarioProfe;
        listaAsignaturas = listaAsignaturasProfe;
    }

}
