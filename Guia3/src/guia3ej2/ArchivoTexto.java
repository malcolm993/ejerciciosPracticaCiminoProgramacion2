package guia3ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ArchivoTexto extends Archivo {

    private String codificacion;
    private String cuerpoTexto;
    private boolean isCifrado = false;

    
    public ArchivoTexto(String codificacion, String nombre, int peso, String localizacion) {
        super(nombre, peso, localizacion);
        this.codificacion = codificacion;
    }
    
    public void insertarTexto(String texto){
        this.cuerpoTexto = texto;
    }

    public void cifrarContenido() {
        isCifrado = true;
    }

    public String getCodificacion() {
        return codificacion;
    }

    

}
