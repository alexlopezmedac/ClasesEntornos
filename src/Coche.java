public class Coche {

    public String color;
    public int anyo;
    public String modelo;
    public String marca;

    public Coche(String colorCoche,
            int anyoCoche,
            String modeloCoche,
            String marcaCoche) {
        color = colorCoche;
        anyo = anyoCoche;
        modelo = modeloCoche;
        marca = marcaCoche;
        System.out.println("Estamos dentro del constructor del coche");
    }

    public Coche(int anyoCoche, String modeloCoche, String marcaCoche) {
        color = "desconocido";
        anyo = anyoCoche;
        modelo = modeloCoche;
        marca = marcaCoche;
        System.out.println("Estamos dentro del constructor del coche");
    }

    public Coche(int anyoCoche, String marcaCoche) {
        color = "desconocido";
        anyo = anyoCoche;
        modelo = "desconocido";
        marca = marcaCoche;
        System.out.println("Estamos dentro del constructor del coche");
    }

}
