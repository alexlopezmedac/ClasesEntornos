/**
 * Esta clase representa la informacion para almacenar perros.
 */
public class Perro {
    public String raza;
    public String ladrido;

    /**
     * Constructor de Perro que asigna raza y ladrido
     * @param razaPerro    Nombre de la raza del perro
     * @param ladridoPerro Ladrido del perro
     */
    public Perro(String razaPerro, String ladridoPerro) {
        raza = razaPerro;
        ladrido = ladridoPerro;
    }

    /**
     * Constructor de Perro que asigna raza y asigna un ladrido por defecto.
     * @param razaPerro Nombre de la raza del perro
     */
    public Perro(String razaPerro) {
        raza = razaPerro;
        ladrido = "guau guau";
    }

    /**
     * Metodo que imprime el ladrido del perro.
     */
    public void ladrar() {
        System.out.println(raza + ":" + ladrido);
    }

    /**
     * Metodo toString para no imprimir las direcciones de memoria
     * @return Mensaje a imprimir.
     */
    public String toString() {
        return "Perro de raza " + raza + " y ladrido " + ladrido;
    }
}
