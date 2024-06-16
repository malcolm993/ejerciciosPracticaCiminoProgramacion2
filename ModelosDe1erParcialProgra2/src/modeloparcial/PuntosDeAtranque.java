package modeloparcial;

/**
 * Código generado por la app UXFtoJava by Charly Cimino
 *
 * @see https://github.com/CharlyCimino/uxf-to-java
 */
public class PuntosDeAtranque {

    private NaveEspacial naveEspacialAtracada;
    private boolean estaOcupado = false;

    public PuntosDeAtranque() {

    }

    public void atracarNave(NaveEspacial a) {
        setNaveEspacialAtracada(a);
        cambioEstadoPunto();
        a.cambioEstadoNaveAtracada();
    }

    public boolean isEstaOcupado() {
        return estaOcupado;
    }

    public void cambioEstadoPunto() {
        this.estaOcupado = !this.estaOcupado;
    }

    public void setNaveEspacialAtracada(NaveEspacial naveEspacialAtracada) {
        this.naveEspacialAtracada = naveEspacialAtracada;
    }

    public void pedirManifestoNaveAtracada() {
        if( isEstaOcupado()){
            naveEspacialAtracada.generarManifesto();
        }else{System.out.println(" no hay nave aparcada");}
    }
}
