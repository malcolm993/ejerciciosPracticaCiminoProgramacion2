package guia3ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
abstract public class ArchivoMultimedia extends Archivo {

    private int duracion;
    private boolean isReproduciendo = false;

    public ArchivoMultimedia(int duracion, String nombre, int peso, String localizacion) {
        super(nombre, peso, localizacion);
        this.duracion = duracion;
        
    }

    

    public void reproducir() {
        this.isReproduciendo = true;
    }

    public void parar() {
        this.isReproduciendo = false;
    }

    public int getDuracion() {
        return duracion;
    }
    
    

}
