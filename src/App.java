public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Coche coche1 = new Coche();
        coche1.color = "rojo";
        coche1.anyo = 1998;
        coche1.modelo = "SF90";
        coche1.marca = "Ferrari";

        System.out.println(coche1);

        // coche1 = null;
        // System.out.println(coche1);

    }
}
