package modeloparcial.parciallicencia;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class ExamenAuto extends Examen {
    private final static int SEGUNDOS_MAXIMO_APROBACION = 90;
    private Circuito circuito;
    private Auto autoUsado;

    public ExamenAuto(Circuito circuito, String fecha, Persona personaEvaluada, Auto autoUsado) {
        super(fecha, personaEvaluada);
        this.circuito = circuito;
        this.autoUsado = autoUsado;
    }
    

    @Override
    public boolean verificarAprobacion() {
        boolean aux= false;
        if(this.circuito.verificarAprobacion() && this.circuito.getSegundosCircuitoHecho() <= SEGUNDOS_MAXIMO_APROBACION){
            aux = true;
        }
        return aux;
    }

    public Circuito getCircuito() {
        return circuito;
    }
    
    

}