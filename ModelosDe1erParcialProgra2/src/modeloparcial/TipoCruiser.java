package modeloparcial;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class TipoCruiser extends NaveEspacial {

    private int cantPasajeros;

    public TipoCruiser(int cantPasajeros, String nombrePlaneta, int cantidadTripulacion) {
        super(nombrePlaneta, cantidadTripulacion);
        this.cantPasajeros = cantPasajeros;
    }

    @Override
    public void generarManifesto() {
        super.generarManifesto();
        System.out.println("PORCENTAJE DE PASAJEROS : " + porcentajePasajeros() + " %");
    }

    @Override
    public boolean verificarCondicion() {

        return cantPasajeros > 0;
    }

    private int porcentajePasajeros() {
        int total;
        total = getCantPasajeros() + getCantidadTripulacion();

        return ((getCantPasajeros() * 100) / total);
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

}
