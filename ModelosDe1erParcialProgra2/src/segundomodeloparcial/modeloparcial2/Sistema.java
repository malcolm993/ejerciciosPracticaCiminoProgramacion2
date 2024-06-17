package segundomodeloparcial.modeloparcial2;

import java.util.ArrayList;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Sistema {

    private ArrayList<Reclamo> listaReclamos;

    public Sistema() {
        this.listaReclamos = new ArrayList<>();
    }

    private double importeTotalInfraccionesReclamadas() {
        double totalImporteReclamar = 0;
        for (Reclamo x : listaReclamos) {
            totalImporteReclamar = totalImporteReclamar + x.getInfraccionReclamada().calcularImporte();
        }

        return totalImporteReclamar;
    }

    private int cantidadReclamosInfraccionCaducada() {
        int cont = 0;
        for (Reclamo r : listaReclamos) {
            if (r.getInfraccionReclamada().isCaducada()) {
                cont++;
            }
        }
        return cont;
    }

    public void mostrarCantidadInfraccionCaducada() {
        System.out.println(" la cantidad de reclamos cuya infraccion ha caducado es de : " + cantidadReclamosInfraccionCaducada());
    }

    public void mostrarImporteTotalReclamos() {
        for (Reclamo a : listaReclamos) {
            a.mostrarImporteTotalAPagar();
        }
    }

    public void agregarReclamoALista(Reclamo x) {
        this.listaReclamos.add(x);
    }

}
