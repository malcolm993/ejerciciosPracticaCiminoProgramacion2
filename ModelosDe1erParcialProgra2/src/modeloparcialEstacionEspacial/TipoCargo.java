package modeloparcialEstacionEspacial;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class TipoCargo extends NaveEspacial {

    private String descripcion;
    private int volumen;

    public TipoCargo(String descripcion, int volumen, String nombrePlaneta, int cantidadTripulacion) {
        super(nombrePlaneta, cantidadTripulacion);
        this.descripcion = descripcion;
        this.volumen = volumen;
    }

    @Override
    public void generarManifesto() {
        super.generarManifesto();
        System.out.println(getDescripcion() + " (" + getVolumen() + " m3 )");
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getVolumen() {
        return volumen;
    }

    @Override
    public boolean verificarCondicion() {
        return volumen < 100;
    }

}
