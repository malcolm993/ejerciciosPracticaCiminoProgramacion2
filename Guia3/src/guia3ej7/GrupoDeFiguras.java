package guia3ej7;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class GrupoDeFiguras {

    private ArrayList<Figura> listaFiguras;

    public GrupoDeFiguras() {
        
        listaFiguras = new ArrayList<>();
    }
    
    public void agregarFigura( Figura x){
        listaFiguras.add(x);
    }

    public void mostrarInfoFiguras() {
        for (Figura f : listaFiguras) {
            f.toString();
        }
    }

}