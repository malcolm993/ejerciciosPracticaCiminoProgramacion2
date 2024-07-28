package guia3ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ArchivoVideo extends ArchivoMultimedia {

    private int ancho;
    private int alto;
    private FormatoVideo tipoFormatoVideo;

    public ArchivoVideo(int ancho, int alto, FormatoVideo tipoFormatoVideo, int duracion, String nombre, int peso, String localizacion) {
        super(duracion, nombre, peso, localizacion);
        this.ancho = ancho;
        this.alto = alto;
        this.tipoFormatoVideo = tipoFormatoVideo;
    }

    

}
