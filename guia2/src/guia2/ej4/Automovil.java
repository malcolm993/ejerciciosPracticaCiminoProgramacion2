package guia2.ej4;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Automovil {

    private String patente;
    private double precio;
    private TipoDeAutomovil tipo;

    public Automovil(String patente, double precio, TipoDeAutomovil tipo) {
        this.patente = patente;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public double getPrecio() {
        return precio;
    }

    public TipoDeAutomovil getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Automovil{" + "patente=" + patente + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    

    
}
