package modeloparcial;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class NaveEspacial {

    private String nombrePlanetaOrigen;
    private int cantidadTripulacion;
    private boolean estadoNaveAtracada = false;

    public NaveEspacial(String nombrePlaneta, int cantidadTripulacion) {
        setNombrePlanetaOrigen(nombrePlaneta);
        setCantidadTripulacion(cantidadTripulacion);
    }

    public void generarManifesto() {
        System.out.println("MANIFESTO : ");
        System.out.println("PLANETA ORIGEN : " + getNombrePlanetaOrigen() + " CANTIDAD DE TRIPULANTES : " + getCantidadTripulacion());
    }

    public abstract boolean verificarCondicion();

    public void cambioEstadoNaveAtracada() {
        this.estadoNaveAtracada = !estadoNaveAtracada;
    }

    public void setNombrePlanetaOrigen(String nombrePlanetaOrigen) {
        this.nombrePlanetaOrigen = nombrePlanetaOrigen;
    }

    public void setCantidadTripulacion(int cantidadTripulacion) {
        this.cantidadTripulacion = cantidadTripulacion;
    }

    public String getNombrePlanetaOrigen() {
        return nombrePlanetaOrigen;
    }

    public int getCantidadTripulacion() {
        return cantidadTripulacion;
    }

}
