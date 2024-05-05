package guia2.ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Inmueble {

    private String domicilio;
    private double precio;
    private TipoDeInmueble tipoInmueble;
    private Barrio barrioInmueble;

    public Inmueble(String domicilio, double precio, TipoDeInmueble tipoInmueble, Barrio barrioInmueble) {
        this.domicilio = domicilio;
        this.precio = precio;
        this.tipoInmueble = tipoInmueble;
        this.barrioInmueble = barrioInmueble;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoDeInmueble getTipoInmueble() {
        return tipoInmueble;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "domicilio=" + domicilio + ", precio=" + precio + ", tipoInmueble=" + tipoInmueble + ", barrioInmueble=" + barrioInmueble + '}';
    }

}
