import java.util.ArrayList;

public class MainProfeAlumno {
    public static void main(String[] args) {
        Asignatura basesDeDatos = new Asignatura("Bases de Datos");
        Asignatura entornos = new Asignatura("Entornos de Desarrollo");
        Asignatura ofimatica = new Asignatura("Ofimatica");
        Asignatura programacion = new Asignatura("Programacion");

        ArrayList<Asignatura> asignaturasAlex = new ArrayList<Asignatura>();
        asignaturasAlex.add(basesDeDatos);
        asignaturasAlex.add(ofimatica);
        asignaturasAlex.add(entornos);

        Profesor alex = new Profesor("123466A",
                "Alejandro Lopez",
                1500,
                asignaturasAlex);

        ArrayList<Asignatura> asignaturasRamiro = new ArrayList<Asignatura>();
        asignaturasAlex.add(programacion);

        Profesor ramiro = new Profesor("2342342Z",
                "Ramiro",
                2000,
                asignaturasRamiro);

        alex.listaAsignaturas.remove(entornos);
        ramiro.listaAsignaturas.add(entornos);

    }

}
