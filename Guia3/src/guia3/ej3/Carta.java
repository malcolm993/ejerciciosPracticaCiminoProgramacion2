package guia3.ej3;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public abstract class Carta {

    static private String forma = "cuadros";
    static private String fondo= "blanco";
    private boolean tapada;

    public Carta() {
        this.tapada = true;
    }

    

    
    public void darVuelta() {
        this.tapada= false;
    }

}
