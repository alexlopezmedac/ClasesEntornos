package com;
/**
 * Esta clase representa la informacion para almacenar perros.
 * 
 * @author Alejandro Lopez Sanz
 */
public class Perro extends Animal {
    /**
     * Este atributo representa la raza de nuestro PERRO.
     */
    private String raza;
    public String ladrido;

    /**
     * Constructor de Perro que asigna raza y ladrido
     * 
     * @param razaPerro    Nombre de la raza del perro
     * @param ladridoPerro Ladrido del perro
     */
    public Perro(String razaPerro, String ladridoPerro) {
        this.raza = razaPerro;
        this.ladrido = ladridoPerro;
    }

    /**
     * Constructor de Perro que asigna raza y asigna un ladrido por defecto.
     * 
     * @param razaPerro Nombre de la raza del perro
     */
    public Perro(String razaPerro) {
        raza = razaPerro;
        ladrido = "guau guau";
    }

    /**
     * Metodo getter para la raza del perro.
     * 
     * @return Nombre de la raza
     */
    public String getRaza() {
        return raza;
    }

    public void setRaza(String nuevoNombre) {
        if (!nuevoNombre.equals("")) {
            raza = nuevoNombre;
        }
    }

    /**
     * Metodo que imprime el ladrido del perro.
     */
    @Override
    public void hacerSonido() {
        String mensaje = "ESTO ES UN MENSAJE";
        String raza = "ESTO ES UNA PRUEBA";
        System.out.println(this.raza + raza + " " + mensaje);
    }

    /**
     * Metodo toString para no imprimir las direcciones de memoria
     * 
     * @return Mensaje a imprimir.
     */
    public String toString() {
        return "Perro de raza " + raza + " y ladrido " + ladrido;
    }

}
