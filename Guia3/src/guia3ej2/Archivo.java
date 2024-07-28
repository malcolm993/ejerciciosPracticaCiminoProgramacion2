
package guia3ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class Archivo {

    private String nombre;
    private int peso;
    private String localizacion;
    private boolean isAbierto = false;

    public Archivo(String nombre, int peso, String localizacion) {
        this.nombre = nombre;
        this.peso = peso;
        this.localizacion = localizacion;
        
    }

    

    public void abrir() {
        isAbierto = true;
    }

    

    public void moverUbicacion(String nuevaUbicacion) {
        this.localizacion = nuevaUbicacion;
    }
    
    public void cerrarArchivo(){
        this.isAbierto= false;
    }

}
