package modeloparcial.parciallicencia;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Moto extends Vehiculo {

    private boolean siLlevaTodosLosEspejos;

    public Moto(boolean siLlevaTodosLosEspejos, String patente, String marca, int cilindrada) {
        super(patente, marca, cilindrada);
        this.siLlevaTodosLosEspejos = siLlevaTodosLosEspejos;
    }
    

}