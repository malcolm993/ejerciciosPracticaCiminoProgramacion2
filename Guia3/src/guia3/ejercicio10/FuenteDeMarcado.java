package guia3.ejercicio10;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class FuenteDeMarcado extends Fuente  {

    private int pesoArchivoKB;
    private LenguajeMarcado tipoDeLenguage;

    public FuenteDeMarcado(String nombre, String ubicacion, LenguajeMarcado tipoDeLenguage, int pesoArchivoKB) {
        super(nombre, ubicacion);
        this.pesoArchivoKB = pesoArchivoKB;
        this.tipoDeLenguage = tipoDeLenguage;
    }

    
    
    
    

    @Override
    public double indiceDeCalidad() {
        return 450/this.pesoArchivoKB;
        
    }

    @Override
    public String toString() {
        return "\n\nFuentesDeMarcado{" + 
                "\npesoArchivoKB=" + pesoArchivoKB + 
                "\n, tipoDeLenguage=" + tipoDeLenguage + '}';
    }

    

}