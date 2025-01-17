import javafx.geometry.Pos;

public class OrdenadorMain {
    public static void main(String[] args) {
        Ordenador pc1 = new Ordenador(
                "PC1",
                50,
                50);
        Ordenador pc2 = new Ordenador(
                "PC2",
                75,
                75);
        System.out.println(pc1.getBrillo());
        pc1.setBrillo(-50);
        System.out.println(pc1.getBrillo());

        pc1.setUpConnection(pc2);

        System.out.println("El descuento es:" + Ordenador.descuento);
        System.out.println("El descuento calculado es:" + Ordenador.calcularDescuento());

        DiaSemana ds = DiaSemana.LUNES;
        System.out.println(ds);
        System.out.println(ds.getNumeroDia());

        Posicion pos = Posicion.DELANTERO;
        System.out.println(pos);

    }
}
