public class Perro {
    public String raza;
    public String ladrido;

    public Perro(String razaPerro, String ladridoPerro) {
        raza = razaPerro;
        ladrido = ladridoPerro;
    }

    public Perro(String razaPerro) {
        raza = razaPerro;
        ladrido = "guau guau";
    }

    public void ladrar() {
        System.out.println(raza + ":" + ladrido);
    }

    public String toString() {
        return "Perro de raza " + raza + " y ladrido " + ladrido;
    }
}
