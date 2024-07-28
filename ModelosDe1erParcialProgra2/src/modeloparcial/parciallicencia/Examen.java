package modeloparcial.parciallicencia;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Examen implements Evaluable {

    private String fecha;
    private Persona personaEvaluada;
    

    public Examen(String fecha, Persona personaEvaluada) {
        this.fecha = fecha;
        this.personaEvaluada = personaEvaluada;
        
    }

   
    
    

}