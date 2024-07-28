package modeloparcial.parciallicencia;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Circuito implements Evaluable {
    private final static int MINIMO_FALTAS =2;
    private int segundosCircuitoHecho;
    private int cantFaltasCometidas;

    public Circuito(int segundosCircuitoHecho, int cantFaltasCometidas) {
        this.segundosCircuitoHecho = segundosCircuitoHecho;
        this.cantFaltasCometidas = cantFaltasCometidas;
    }

    public int getSegundosCircuitoHecho() {
        return segundosCircuitoHecho;
    }
    
    

    @Override
    public boolean verificarAprobacion() {
        boolean aux = false;
        if(this.cantFaltasCometidas <= MINIMO_FALTAS){
            aux=true;
        }
        return aux;
    }
    
    

}