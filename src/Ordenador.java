public class Ordenador {
    private int brillo;
    private int volumen;

    public Ordenador(int brillo, int volumen) {
        this.brillo = brillo;
        this.volumen = volumen;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public void cambiarAjustes1() {
        this.volumen = 0;
        this.brillo = 0;
    }

    public void cambiarAjustes2() {
        this.setVolumen(0);
        this.setBrillo(0);
    }
}
