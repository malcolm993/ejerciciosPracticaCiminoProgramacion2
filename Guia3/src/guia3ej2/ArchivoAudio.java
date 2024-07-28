package guia3ej2;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class ArchivoAudio extends ArchivoMultimedia {

    private String artista;
    private String album;
    private FormatoAudio tipoFormatoAudio;

    public ArchivoAudio(String artista, String album, FormatoAudio tipoFormatoAudio, int duracion, String nombre, int peso, String localizacion) {
        super(duracion, nombre, peso, localizacion);
        this.artista = artista;
        this.album = album;
        this.tipoFormatoAudio = tipoFormatoAudio;
    }

    

}
