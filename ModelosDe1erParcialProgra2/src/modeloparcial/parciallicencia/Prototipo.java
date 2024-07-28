package modeloparcial.parciallicencia;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Prototipo {

    private ArrayList<Examen> listaDeExamenes;

    public Prototipo() {
        
        listaDeExamenes = new ArrayList<>();
    }
    
    public void agregarExamen( Examen x){
        listaDeExamenes.add(x);
    }

    public Informe ObtenerInforme() {
        
        return new Informe(this.listaDeExamenes);
    }

}