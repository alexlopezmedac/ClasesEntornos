public class Ordenador {
    private String nombre;
    private int brillo;
    private int volumen;
    public static double descuento = 80;

    public Ordenador(String nombre, int brillo, int volumen) {
        this.nombre = nombre;
        this.brillo = brillo;
        this.volumen = volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        if (brillo < 0 || brillo > 100) {
            return;
        } else {
            this.brillo = brillo;
        }
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarAjustes1() {
        this.volumen = 0;
        this.brillo = 0;
    }

    public void cambiarAjustes2() {
        this.setVolumen(0);
        this.setBrillo(0);
    }

    public void pairWithOtherComputer(Ordenador otro) {
        System.out.println(this.nombre +
                " connect with "
                + otro.nombre + "!");
    }

    public void setUpConnection(Ordenador pc2) {
        this.pairWithOtherComputer(pc2);
        pc2.pairWithOtherComputer(this);
    }

    public static double calcularDescuento() {
        return descuento + 20.00;
    }

}
