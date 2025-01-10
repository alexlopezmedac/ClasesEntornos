public class PerroMain {
    public static void main(String[] args) {

        Perro perro1 = new Perro(
                "rotweiller",
                "AAAAAAAAAAAAA");
        Perro perro2 = new Perro(
                "chiguagua");

        perro1.ladrar();
        perro2.ladrar();

        System.out.println(perro1);

    }
}
