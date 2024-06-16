package modeloparcial;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Atlantis {

    private ArrayList<PuntosDeAtranque> listaPuntosDeAparque;

    public Atlantis() {
        listaPuntosDeAparque = new ArrayList<>();
    }

    public void agregarPuntoDeAparque(PuntosDeAtranque x) {
        listaPuntosDeAparque.add(x);
    }

    public void mostrarManifestos() {
        for (PuntosDeAtranque x : listaPuntosDeAparque) {
            x.pedirManifestoNaveAtracada();
        }
    }

    private PuntosDeAtranque verificarLugarDisponible() {
        PuntosDeAtranque n = null;
        int cont = 0;

        while (cont < listaPuntosDeAparque.size() && n == null) {
            PuntosDeAtranque aux = listaPuntosDeAparque.get(cont);

            if (!aux.isEstaOcupado()) {

                n = aux;
            }
            cont++;
        }

        return n;
    }

    public boolean estacionarNave(NaveEspacial naveespacial1) {
        boolean x = false;
//        System.out.println("aca bien ");
        PuntosDeAtranque lugarAparcarAux = verificarLugarDisponible();
//        System.out.println(naveespacial1.verificarCondicion());
        if (naveespacial1.verificarCondicion() && lugarAparcarAux != null) {

            lugarAparcarAux.atracarNave(naveespacial1);

        }

        return x;
    }

}
